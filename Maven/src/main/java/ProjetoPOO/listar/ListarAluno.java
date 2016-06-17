package ProjetoPOO.listar;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Treino;
import java.util.ArrayList;
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
    private List<ListarTreino> ListaTreinoAluno;
    private List<ListarAvaliacao> listaAvaliacaoAluno; 
    
    
    //construtor para listar e buscar os alunos //maneira otimizada, para evitar repetição de codigo
    public ListarAluno(Aluno aluno) {
        this.nome = aluno.getNome();
        this.idade = aluno.getIdade();
        this.telefone = aluno.getTelefone();
        this.rua = aluno.getRua();
        this.bairro = aluno.getBairro();
        this.cidade = aluno.getCidade();
        this.numMatricula = aluno.getNumMatricula();
        this.senha = aluno.getSenha();
        ListaTreinoAluno = new ArrayList<ListarTreino>();
        for(int i = 0; i< aluno.getTreinoAlunos().size(); i++){
            System.out.println("aki");
            ListarTreino t = new ListarTreino(aluno.getTreinoAlunos().get(i));
            this.ListaTreinoAluno.add(t);
        }
        
        for(int i = 0; i< aluno.getAvaliacaoAlunos().size(); i++){
            //ListarTreino t = new ListarTreino(aluno.getTreinoAlunos().get(i));
            //ListaTreinoAluno.add(t);
        }
    }

    public List<ListarTreino> getListaTreinoAluno() {
        return ListaTreinoAluno;
    }

    public void setListaTreinoAluno(List<ListarTreino> ListaTreinoAluno) {
        this.ListaTreinoAluno = ListaTreinoAluno;
    }

    public List<ListarAvaliacao> getListaAvaliacaoAluno() {
        return listaAvaliacaoAluno;
    }

    public void setListaAvaliacaoAluno(List<ListarAvaliacao> listaAvaliacaoAluno) {
        this.listaAvaliacaoAluno = listaAvaliacaoAluno;
    }

    
    public ListarAluno() {
        //Olhar isso aqui, a parada do array list
        this.ListaTreinoAluno = new ArrayList<ListarTreino>();
        this.listaAvaliacaoAluno = new ArrayList<ListarAvaliacao>();
    }

    public ListarAluno(String nome, int idade, String telefone, String rua, String bairro, String cidade, long numMatricula, String senha, List<ListarTreino> ListaTreinoAluno, List<ListarAvaliacao> listaAvaliacaoAluno) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numMatricula = numMatricula;
        this.senha = senha;
        this.ListaTreinoAluno = ListaTreinoAluno;
        this.listaAvaliacaoAluno = listaAvaliacaoAluno;
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


    
}
