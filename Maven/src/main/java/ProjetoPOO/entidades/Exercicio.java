package ProjetoPOO.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exercicio {

    private String nomeExercicio;
    private long idExercicio;
    private String descricao;
    private int qtSeries;
    private int numRepeticao;
    private int tempoDescanso;
    private Treino treino;
  
    public Exercicio() {
    }

    public Exercicio(String nomeExercicio, long idExercicio, String descricao, int qtSeries, int numRepeticao, int tempoDescanso, Treino treino) {
        this.nomeExercicio = nomeExercicio;
        this.idExercicio = idExercicio;
        this.descricao = descricao;
        this.qtSeries = qtSeries;
        this.numRepeticao = numRepeticao;
        this.tempoDescanso = tempoDescanso;
        this.treino = treino;
    }
    @Id
    public long getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(long idExercicio) {
        this.idExercicio = idExercicio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtSeries() {
        return qtSeries;
    }

    public void setQtSeries(int qtSeries) {
        this.qtSeries = qtSeries;
    }

    public int getNumRepeticao() {
        return numRepeticao;
    }

    public void setNumRepeticao(int numRepeticao) {
        this.numRepeticao = numRepeticao;
    }

    public int getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(int tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }
    
    @ManyToOne
    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

}