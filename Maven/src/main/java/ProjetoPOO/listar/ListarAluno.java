package ProjetoPOO.listar;

import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Treino;
import java.util.List;

public class ListarAluno {

    private String nome;
    private int idade;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private long numMatricula;
    private String senha;
    private List<Treino> ListaTreinoAlunos;
    private List<Avaliacao> listaAvaliacaoAlunos; 

    public ListarAluno() {
        this.ListaTreinoAlunos = ListaTreinoAlunos;
        this.listaAvaliacaoAlunos = listaAvaliacaoAlunos;
    }

    public ListarAluno(String nome, int idade, String telefone, String rua, String bairro, String cidade, long numMatricula, String senha, List<Treino> ListaTreinoAlunos, List<Avaliacao> listaAvaliacaoAlunos) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numMatricula = numMatricula;
        this.senha = senha;
        this.ListaTreinoAlunos = ListaTreinoAlunos;
        this.listaAvaliacaoAlunos = listaAvaliacaoAlunos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(long numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Treino> getListaTreinoAlunos() {
        return ListaTreinoAlunos;
    }

    public void setListaTreinoAlunos(List<Treino> ListaTreinoAlunos) {
        this.ListaTreinoAlunos = ListaTreinoAlunos;
    }

    public List<Avaliacao> getListaAvaliacaoAlunos() {
        return listaAvaliacaoAlunos;
    }

    public void setListaAvaliacaoAlunos(List<Avaliacao> listaAvaliacaoAlunos) {
        this.listaAvaliacaoAlunos = listaAvaliacaoAlunos;
    }

    
}
