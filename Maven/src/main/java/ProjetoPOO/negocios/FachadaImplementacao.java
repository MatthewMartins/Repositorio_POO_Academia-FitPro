package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarAluno;
import ProjetoPOO.listar.ListarAvaliacao;
import ProjetoPOO.listar.ListarExercicio;
import ProjetoPOO.listar.ListarFuncionario;
import ProjetoPOO.listar.ListarTreino;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FachadaImplementacao implements InterfaceFachada {

    @Autowired
    private InterfaceAluno alunos;
    @Autowired
    private InterfaceAvaliacao avaliacoes;
    @Autowired
    private InterfaceFuncionario funcionarios;
    @Autowired
    private InterfaceTreino treinos;
    @Autowired
    private InterfaceExercicio exercicios;
    
    @Override
    public void adicionarAluno(Aluno aluno) throws AlunoExistenteException {
        this.alunos.adicionarAluno(aluno);
    }
    @Override
    public void atualizarAluno(Aluno aluno) throws AlunoInexistenteException {
        this.alunos.atualizarAluno(aluno);
    }
    @Override
    public void removerAluno(long numMatricula) throws AlunoInexistenteException {
        this.alunos.removerAluno(numMatricula);
    }
    @Override
    public List<ListarAluno> listarAlunos() {
        return this.alunos.listarAlunos();
    }
    @Override
    public ListarAluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException {

        return this.alunos.buscarIdAluno(numMatricula);
    }
    @Override
    public List<ListarTreino> historicoTreinosAluno(long numMatricula) throws AlunoInexistenteException {
        return this.alunos.historicoTreinosAluno(numMatricula);
    }
    @Override
    public List<ListarAvaliacao> historicoAvaliacoesAluno(long numMatricula) throws AlunoInexistenteException {
        return this.alunos.historicoAvaliacoesAluno(numMatricula);
    }
    
    
    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao, long numMatricula) throws AvaliacaoExistenteException {
        this.avaliacoes.adicionarAvaliacao(avaliacao, numMatricula);
    }
    @Override
    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException {
        this.avaliacoes.atualizarAvaliacao(avaliacao);
    }
    @Override
    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        this.avaliacoes.removerAvaliacao(idAvaliacao);
    }
    @Override
    public List<ListarAvaliacao> listarAvaliacoes() {
        return this.avaliacoes.listarAvaliacoes();
    }
    @Override
    public ListarAvaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        return this.avaliacoes.buscarIdAvaliacao(idAvaliacao);
    }

    
    @Override
    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException {
        this.funcionarios.adicionarFuncionario(funcionario);
    }
    @Override
    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException {
        this.funcionarios.atualizarFuncionario(funcionario);
    }
    @Override
    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException {
        this.funcionarios.removerFuncionario(numContrato);
    }
    @Override
    public List<ListarFuncionario> listarFuncionarios() {
        return this.funcionarios.listarFuncionarios();
    }
    @Override
    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException {
        return this.funcionarios.buscarNumContratoFuncionario(numContrato);
    }
    
    
    @Override
    public void adicionarTreino(Treino treino, long numMatricula) throws TreinoExistenteException, AlunoInexistenteException {
        this.treinos.adicionarTreino(treino, numMatricula);
    }
    @Override
    public void atualizarTreino(Treino treino) throws TreinoInexistenteException {
        this.treinos.atualizarTreino(treino);
    }
    @Override
    public void removerTreino(long idTreino) throws TreinoInexistenteException {
        this.treinos.removerTreino(idTreino);
    }
    @Override
    public List<ListarTreino> listarTreinos() {
        return this.treinos.listarTreinos();
    }
    @Override
    public ListarTreino buscarTreinoId(long idTreino) throws TreinoInexistenteException {
        return this.treinos.buscarTreinoId(idTreino);
    }

    
    @Override
    public void adicionarExercicio(long idTreino, Exercicio exercicio) throws ExercicioExistenteException, TreinoInexistenteException {
        this.exercicios.adicionarExercicio(idTreino, exercicio);
    }
    @Override
    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException {
        this.exercicios.atualizarExercicio(exercicio);
    }
    @Override
    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException {
        this.exercicios.removerExercicio(idExercicio);
    }
    @Override
    public List<ListarExercicio> listarExercicios() {
        return this.exercicios.listarExercicios();
    }
    @Override
    public ListarExercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException {
        return this.exercicios.buscarExercicioId(idExercicio);
    }

}
