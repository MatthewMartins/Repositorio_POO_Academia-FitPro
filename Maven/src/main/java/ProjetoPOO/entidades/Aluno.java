
package ProjetoPOO.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aluno {

    private String nome;
    private int idade;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private long numMatricula;
    private String senha;
    private List<Treino> treinoAlunos;
    private List<Avaliacao> avaliacaoAlunos;
    //os relacionamentos MANY TO ONE, recebe tambem o comando: fetch = FetchType.EAGER ????
    
    public Aluno() {
        //O construtor é por causa do framework, pq ele vai utilizar o construtor por baixo dos panos, para criar o BD
    }
   
    public Aluno(String nome, int idade, String telefone, String rua, String bairro, String cidade, long numMatricula, String senha, List<Avaliacao> avaliacaoAlunos, List<Treino> treinoAlunos) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numMatricula = numMatricula;
        this.senha = senha;
        this.avaliacaoAlunos = avaliacaoAlunos;
        this.treinoAlunos = treinoAlunos;
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
    
    @Id
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
    
    @OneToMany (mappedBy = "aluno", fetch = FetchType.EAGER)
    public List<Avaliacao> getAvaliacaoAlunos() {
        return avaliacaoAlunos;
    }

    public void setAvaliacaoAlunos(List<Avaliacao> avaliacaoAlunos) {
        this.avaliacaoAlunos = avaliacaoAlunos;
    }
    
    @OneToMany (mappedBy = "aluno", fetch = FetchType.EAGER)
    public List<Treino> getTreinoAlunos() {
        return treinoAlunos;
    }

    public void setTreinoAlunos(List<Treino> treinoAlunos) {
        this.treinoAlunos = treinoAlunos;
    }
    
    
}