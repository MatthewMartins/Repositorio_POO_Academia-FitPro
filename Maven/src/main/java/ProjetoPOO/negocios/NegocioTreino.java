package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarTreino;
import ProjetoPOO.persistencias.RepositorioAluno;
import ProjetoPOO.persistencias.RepositorioTreino;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioTreino implements InterfaceTreino {

    @Autowired
    private RepositorioTreino repositorioTreino;
    @Autowired
    private RepositorioAluno repositorioAluno;

    @Transactional(rollbackFor = TreinoExistenteException.class)
    @Override
    public void adicionarTreino(Treino treino, long numMatricula) throws TreinoExistenteException {
        Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        if (aluno != null) {
            try {
                buscarTreinoId(treino.getIdTreino());
                throw new TreinoExistenteException();
            } catch (TreinoInexistenteException e) {
                treino.setAluno(aluno);
                repositorioTreino.save(treino);
                
            }
        } else if (aluno == null) {
            System.out.println("NUMERO DA MATRICULA DO ALUNO NAO ENCONTRADO");
        }

    }

    @Override
    public Treino buscarTreinoId(long idTreino) throws TreinoInexistenteException {
        Treino treino = repositorioTreino.findByIdTreino(idTreino);
        if (treino == null) {
            throw new TreinoInexistenteException();
        }
        return treino;
    }

    @Transactional(rollbackFor = TreinoInexistenteException.class)
    @Override
    public void atualizarTreino(Treino treino) throws TreinoInexistenteException {
        Treino antigo = buscarTreinoId(treino.getIdTreino());
        antigo.setNomeTreino(treino.getNomeTreino());
        antigo.setDataExpiracao(treino.getDataExpiracao());
        repositorioTreino.save(antigo);
    }

    @Transactional(rollbackFor = TreinoInexistenteException.class)
    @Override
    public void removerTreino(long idTreino) throws TreinoInexistenteException {
        repositorioTreino.delete(buscarTreinoId(idTreino));
    }

    @Override
    public List<ListarTreino> listarTreinos() {
        List<ListarTreino> retornaListaTreinos = new ArrayList<ListarTreino>();
        List<Treino> treino = (List<Treino>) repositorioTreino.findAll();
        for (int i = 0; i < treino.size(); i++) {
            ListarTreino listarTreino = new ListarTreino(treino.get(i));
            retornaListaTreinos.add(listarTreino);
            
        }

        return retornaListaTreinos;
    }

}
