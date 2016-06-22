/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Usuário
 */
public interface InterfaceFachada {

    public void adicionarAluno(Aluno aluno) throws AlunoExistenteException;

    public void atualizarAluno(Aluno aluno) throws AlunoInexistenteException;

    public void removerAluno(long numMatricula) throws AlunoInexistenteException;

    public List<ListarAluno> listarAlunos();

    public ListarAluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException;

    public void adicionarAvaliacao(Avaliacao avaliacao, long numMatricula) throws AvaliacaoExistenteException;

    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException;

    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

    public List<ListarAvaliacao> listarAvaliacoes();

    public ListarAvaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException;

    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException;

    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException;

    public List<ListarFuncionario> listarFuncionarios();

    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException;
    
    public void adicionarTreino(Treino treino, long numMatricula) throws TreinoExistenteException;

    public void atualizarTreino(Treino treino) throws TreinoInexistenteException;

    public void removerTreino(long idTreino) throws TreinoInexistenteException;

    public List<ListarTreino> listarTreinos();

    public ListarTreino buscarTreinoId(long idTreino) throws TreinoInexistenteException;
    
    public void adicionarExercicio(long idTreino, Exercicio exercicio) throws ExercicioExistenteException;

    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException;

    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException;

    public List<ListarExercicio> listarExercicios();

    public ListarExercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException;
}
