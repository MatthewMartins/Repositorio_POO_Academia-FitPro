package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.persistencias.RepositorioAluno;
import ProjetoPOO.persistencias.RepositorioTreino;
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
            //blz, agora que achamos o aluno por meio da matricula, como fazemos via implementação pra que esse treino
            //que vai ser salvo, seja salvo no numero de matricula desse respectivo aluno
            //sera que criaremos um for? percorrer todo o aluno e no objeto treino, adicionar essas informações?
            //obs: esse erro ai é pq nao esta implementado ainda nas interfaces
            //ve se tu entende a logica que eu fiz ai
            try {
                buscarTreinoId(treino.getIdTreino());
                throw new TreinoExistenteException();
            } catch (TreinoInexistenteException e) {
                repositorioTreino.save(treino);
              // seria assim?  aluno.setTreinoAlunos((List<Treino>) repositorioTreino.save(treino));
              // ou assim? Aluno aluno.treinoAlunos = (list<Treino> repositorioTreino.save(treino);
            }
        }
        else if(aluno == null){
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
    public List<Treino> listarTreino() {
        return (List<Treino>) repositorioTreino.findAll();
    }

}
