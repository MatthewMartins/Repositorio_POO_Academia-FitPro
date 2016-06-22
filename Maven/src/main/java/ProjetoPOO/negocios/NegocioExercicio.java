package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarExercicio;
import ProjetoPOO.persistencias.RepositorioExercicio;
import ProjetoPOO.persistencias.RepositorioTreino;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioExercicio implements InterfaceExercicio {

    @Autowired
    private RepositorioExercicio repositorioExercicio;

    @Autowired
    private RepositorioTreino repositorioTreino;
    
    @Autowired
    private InterfaceFachada fachada;

    @Transactional(rollbackFor = ExercicioExistenteException.class)
    @Override
    public void adicionarExercicio(long idTreino, Exercicio exercicio) throws ExercicioExistenteException, TreinoInexistenteException {
        Treino treino = repositorioTreino.findByIdTreino(idTreino);
        if (treino != null) {
            try {
                buscarExercicioId(exercicio.getIdExercicio());
                throw new ExercicioExistenteException();
            } catch (ExercicioInexistenteException e) {
                exercicio.setTreino(treino);
                repositorioExercicio.save(exercicio);    
            }
        }else if (treino == null) {
            System.out.println("ID DO TREINO NAO ENCONTRADO");
            throw new TreinoInexistenteException();
        }
    }

    @Override
    public ListarExercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException {
        Exercicio exercicio = repositorioExercicio.findByIdExercicio(idExercicio);
        if (exercicio == null) {
            throw new ExercicioInexistenteException();
        }
        return new ListarExercicio(exercicio);
    }
    
     private Exercicio buscarExercicio(long idExercicio) throws ExercicioInexistenteException {
        Exercicio exercicio = repositorioExercicio.findByIdExercicio(idExercicio);
        if (exercicio == null) {
            throw new ExercicioInexistenteException();
        }
        return exercicio;
    }

    @Transactional(rollbackFor = ExercicioInexistenteException.class)
    @Override
    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException {
        Exercicio antigo = buscarExercicio(exercicio.getIdExercicio());
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
        repositorioExercicio.delete(buscarExercicio(idExercicio));
    }

    @Override
    public List<ListarExercicio> listarExercicios() {
        List<ListarExercicio> retornaListaExercicios = new ArrayList<ListarExercicio>();
        List<Exercicio> exercicio = (List<Exercicio>) repositorioExercicio.findAll();
        for (int i = 0; i < exercicio.size(); i++) {
            ListarExercicio listarExercicio = new ListarExercicio(exercicio.get(i));
            retornaListaExercicios.add(listarExercicio);   
        }
        return retornaListaExercicios;
    }

}
