package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.listar.ListarAluno;
import ProjetoPOO.listar.ListarTreino;
import ProjetoPOO.persistencias.RepositorioAluno;
import ProjetoPOO.persistencias.RepositorioTreino;
import java.util.ArrayList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioAluno implements InterfaceAluno {

    @Autowired
    private RepositorioAluno repositorioAluno;
    
    @Autowired
    private RepositorioTreino repositorioTreino;
    
    @Transactional(rollbackFor = AlunoExistenteException.class)
    @Override
    public void adicionarAluno(Aluno aluno) throws AlunoExistenteException {

        try {
            buscarIdAluno(aluno.getNumMatricula());
            throw new AlunoExistenteException();
        } catch (AlunoInexistenteException e) {
            repositorioAluno.save(aluno);
        }
    }

    @Override
    public ListarAluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException {
        Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        if (aluno == null) {
            throw new AlunoInexistenteException();
        }
        return new ListarAluno(aluno);
    }
    
    private Aluno buscarId(long numMatricula) throws AlunoInexistenteException {
        Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        if (aluno == null) {
            throw new AlunoInexistenteException();
        }
        return aluno;
    }

    @Transactional(rollbackFor = AlunoInexistenteException.class)
    @Override
    public void atualizarAluno(Aluno aluno) throws AlunoInexistenteException {
        Aluno antigo = buscarId(aluno.getNumMatricula());
        antigo.setAvaliacaoAlunos(aluno.getAvaliacaoAlunos());
        antigo.setBairro(aluno.getBairro());
        antigo.setCidade(aluno.getCidade());
        antigo.setIdade(aluno.getIdade());
        antigo.setNome(aluno.getNome());
        antigo.setNumMatricula(aluno.getNumMatricula());
        antigo.setRua(aluno.getRua());
        antigo.setSenha(aluno.getSenha());
        antigo.setTelefone(aluno.getTelefone());
        repositorioAluno.save(antigo);
    }

    @Transactional(rollbackFor = AlunoInexistenteException.class)
    @Override
    public void removerAluno(long numMatricula) throws AlunoInexistenteException {
        //preciso pegar o treino e avaliacao que esta associado a esse aluno e excluir
        //antes de excluir o aluno
        //no form ele so passa o id do aluno, como eu pego esse ID do aluno e atraves dele pego o treino do aluno
        /*Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        List<ListarTreino> listaTreinoAluno = new ArrayList<ListarTreino>();
         for(int i = 0; i< aluno.getTreinoAlunos().size(); i++){
            ListarTreino listaTreinoDesseAluno = new ListarTreino(aluno.getTreinoAlunos().get(i));
            listaTreinoAluno.add(listaTreinoDesseAluno);
            //repositorioTreino.delete(buscarTreinoId(aluno.getTreinoAlunos().get(i)));
        }*/
        repositorioAluno.delete(buscarId(numMatricula));
    }

    @Override
    public List<ListarAluno> listarAlunos() {
        List<ListarAluno> retornaListaAlunos = new ArrayList<ListarAluno>();
        List<Aluno> aluno = (List<Aluno>) repositorioAluno.findAll();
        System.out.println("1");
        for (int i = 0; i < aluno.size(); i++) {
            ListarAluno listarAluno = new ListarAluno(aluno.get(i));
            retornaListaAlunos.add(listarAluno);
            /*ListarAluno listarAluno = new ListarAluno(aluno.get(i)); 
            listarAluno.setNome(aluno.get(i).getNome());
            listarAluno.setIdade(aluno.get(i).getIdade());
            listarAluno.setTelefone(aluno.get(i).getTelefone());
            listarAluno.setRua(aluno.get(i).getRua());
            listarAluno.setBairro(aluno.get(i).getBairro());
            listarAluno.setCidade(aluno.get(i).getCidade());
            listarAluno.setNumMatricula(aluno.get(i).getNumMatricula());
            listarAluno.setSenha(aluno.get(i).getSenha());
            
            listarAluno.setListaTreinoAluno(aluno.get(i).getTreinoAlunos());
            
            listarAluno.setListaAvaliacaoAluno(aluno.get(i).getAvaliacaoAlunos());
            retornaListaAlunos.add(listarAluno);
            System.out.println("3");*/
        }

        return retornaListaAlunos;
    }
}
