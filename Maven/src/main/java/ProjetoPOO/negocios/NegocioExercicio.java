package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.listar.ListarExercicio;
import ProjetoPOO.persistencias.RepositorioExercicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioExercicio implements InterfaceExercicio {

    @Autowired
    private RepositorioExercicio repositorioExercicio;

    @Transactional(rollbackFor = ExercicioExistenteException.class)
    @Override
    public void adicionarExercicio(Exercicio exercicio) throws ExercicioExistenteException {

        try {
            buscarExercicioId(exercicio.getIdExercicio());
            throw new ExercicioExistenteException();
        } catch (ExercicioInexistenteException e) {
            repositorioExercicio.save(exercicio);
        }
    }

    @Override
    public Exercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException {
        Exercicio exercicio = repositorioExercicio.findByIdExercicio(idExercicio);
        if (exercicio == null) {
            throw new ExercicioInexistenteException();
        }
        return exercicio;
    }

    @Transactional(rollbackFor = ExercicioInexistenteException.class)
    @Override
    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException {
        Exercicio antigo = buscarExercicioId(exercicio.getIdExercicio());
        antigo.setNomeExercicio(exercicio.getNomeExercicio());
        antigo.setDescricao(exercicio.getDescricao());
        antigo.setQtSeries(exercicio.getQtSeries());
        antigo.setNumRepeticao(exercicio.getNumRepeticao());
        antigo.setNumRepeticao(exercicio.getTempoDescanso());
        repositorioExercicio.save(antigo);

    }

    @Transactional(rollbackFor = ExercicioInexistenteException.class)
    @Override
    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException {
        repositorioExercicio.delete(buscarExercicioId(idExercicio));
    }

    @Override
    public List<ListarExercicio> listarExercicios() {
        List<ListarExercicio> retornaListaExercicios = new ArrayList<ListarExercicio>();
        List<Exercicio> exercicio = (List<Exercicio>) repositorioExercicio.findAll();
        for(int i = 0; i<exercicio.size(); i++){
            ListarExercicio listarExercicio = new ListarExercicio(); 
            listarExercicio.setNomeExercicio(exercicio.get(i).getNomeExercicio());
            listarExercicio.setIdExercicio(exercicio.get(i).getIdExercicio());
            listarExercicio.setDescricao(exercicio.get(i).getDescricao());
            listarExercicio.setQtSeries(exercicio.get(i).getQtSeries());
            listarExercicio.setNumRepeticao(exercicio.get(i).getNumRepeticao());
            listarExercicio.setTempoDescanso(exercicio.get(i).getTempoDescanso());
            retornaListaExercicios.add(listarExercicio);
        }
        
        return retornaListaExercicios;
       
    }

}
