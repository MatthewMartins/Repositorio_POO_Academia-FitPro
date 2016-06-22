package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.listar.ListarAvaliacao;
import java.util.List;

public interface InterfaceAvaliacao {

    public void adicionarAvaliacao(Avaliacao avaliacao, long numMatricula) throws AvaliacaoExistenteException;

    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException;

    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

    public List<ListarAvaliacao> listarAvaliacoes();

    public ListarAvaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

}
