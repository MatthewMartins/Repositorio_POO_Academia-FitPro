package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.listar.ListarAvaliacao;
import ProjetoPOO.persistencias.RepositorioAluno;
import ProjetoPOO.persistencias.RepositorioAvaliacao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioAvaliacao implements InterfaceAvaliacao {

    @Autowired
    private RepositorioAvaliacao repositorioAvaliacao;

    @Autowired
    private RepositorioAluno repositorioAluno;

    @Transactional(rollbackFor = AvaliacaoExistenteException.class)
    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao, long numMatricula) throws AvaliacaoExistenteException {
        Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        if (aluno != null) {
            try {
                buscarIdAvaliacao(avaliacao.getIdAvaliacao());
                throw new AvaliacaoExistenteException();
            } catch (AvaliacaoInexistenteException e) {
                aluno.setAvaliacaoAlunos((List<Avaliacao>) avaliacao);
                repositorioAvaliacao.save(avaliacao);
                
            }
        } else if (aluno == null) {
            System.out.println("NUMERO DA MATRICULA DO ALUNO NAO ENCONTRADO");
        }
    }

    @Override
    public Avaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        Avaliacao avaliacao = repositorioAvaliacao.findByIdAvaliacao(idAvaliacao);
        if (avaliacao == null) {
            throw new AvaliacaoInexistenteException();
        }
        return avaliacao;
    }

    @Transactional(rollbackFor = AvaliacaoInexistenteException.class)
    @Override
    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException {
        Avaliacao antiga = buscarIdAvaliacao(avaliacao.getIdAvaliacao());
        antiga.setPeso(avaliacao.getPeso());
        antiga.setAltura(avaliacao.getAltura());
        antiga.setPeito(avaliacao.getPeito());
        antiga.setBiceps(avaliacao.getBiceps());
        antiga.setTriceps(avaliacao.getTriceps());
        antiga.setOmbro(avaliacao.getOmbro());
        antiga.setCosta(avaliacao.getCosta());
        antiga.setCoxa(avaliacao.getCoxa());
        antiga.setPanturrilha(avaliacao.getPanturrilha());
        antiga.setQuadril(avaliacao.getQuadril());
        repositorioAvaliacao.save(antiga);

    }

    @Transactional(rollbackFor = AvaliacaoInexistenteException.class)
    @Override
    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        repositorioAvaliacao.delete(buscarIdAvaliacao(idAvaliacao));
    }

    @Override
    public List<ListarAvaliacao> listarAvaliacoes() {
        List<ListarAvaliacao> retornaListaAvaliacoes = new ArrayList<ListarAvaliacao>();
        List<Avaliacao> avaliacao = (List<Avaliacao>) repositorioAvaliacao.findAll();
        for (int i = 0; i < avaliacao.size(); i++) {
            ListarAvaliacao listarAvaliacao = new ListarAvaliacao();

            listarAvaliacao.setIdAvaliacao(avaliacao.get(i).getIdAvaliacao());
            listarAvaliacao.setPeso(avaliacao.get(i).getPeso());
            listarAvaliacao.setAltura(avaliacao.get(i).getAltura());
            listarAvaliacao.setPeito(avaliacao.get(i).getPeito());
            listarAvaliacao.setBiceps(avaliacao.get(i).getBiceps());
            listarAvaliacao.setTriceps(avaliacao.get(i).getTriceps());
            listarAvaliacao.setOmbro(avaliacao.get(i).getOmbro());
            listarAvaliacao.setCosta(avaliacao.get(i).getCosta());
            listarAvaliacao.setCoxa(avaliacao.get(i).getCoxa());
            listarAvaliacao.setPanturrilha(avaliacao.get(i).getPanturrilha());
            listarAvaliacao.setQuadril(avaliacao.get(i).getQuadril());
            retornaListaAvaliacoes.add(listarAvaliacao);
        }

        return retornaListaAvaliacoes;
    }
}
