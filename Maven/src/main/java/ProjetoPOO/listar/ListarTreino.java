package ProjetoPOO.listar;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Treino;
import java.util.ArrayList;
import java.util.List;

public class ListarTreino {

    private long idTreino;
    private String nomeTreino;
    private String dataExpiracao; //perguntar sobre anotação @temporal
    private String nomeAluno;
    //private Funcionario funcionario;
    private List<Exercicio> exercicios;

    //construtor para listar e buscar treinos
    public ListarTreino(Treino treino) {
        this.idTreino = treino.getIdTreino();
        this.nomeTreino = treino.getNomeTreino();
        this.dataExpiracao = treino.getDataExpiracao();
        this.nomeAluno = treino.getAluno().getNome();
        
    }

    public ListarTreino() {
        this.exercicios = new ArrayList<Exercicio>();
    }

    public ListarTreino(long idTreino, String nomeTreino, String dataExpiracao, String nomeAluno, List<Exercicio> exercicios) {
        this.idTreino = idTreino;
        this.nomeTreino = nomeTreino;
        this.dataExpiracao = dataExpiracao;
        this.nomeAluno = nomeAluno;
        this.exercicios = exercicios;
    }

    public long getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(long idTreino) {
        this.idTreino = idTreino;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getAluno() {
        return nomeAluno;
    }

    public void setAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

}
