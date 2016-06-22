package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarTreino;
import java.util.List;


public interface InterfaceTreino {
    
    public void adicionarTreino(Treino treino, long numMatricula) throws TreinoExistenteException, AlunoInexistenteException;

    public void atualizarTreino(Treino treino) throws TreinoInexistenteException;

    public void removerTreino(long idTreino) throws TreinoInexistenteException;

    public List<ListarTreino> listarTreinos();

    public ListarTreino buscarTreinoId(long idTreino) throws TreinoInexistenteException;
}
