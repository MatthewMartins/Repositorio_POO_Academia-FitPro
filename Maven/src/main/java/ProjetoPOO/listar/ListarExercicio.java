package ProjetoPOO.listar;

public class ListarExercicio {

    private String nomeExercicio;
    private long idExercicio;
    private String descricao;
    private int qtSeries;
    private int numRepeticao;
    private int tempoDescanso;

    public ListarExercicio() {
        
    }

    public ListarExercicio(String nomeExercicio, long idExercicio, String descricao, int qtSeries, int numRepeticao, int tempoDescanso) {
       
        this.nomeExercicio = nomeExercicio;
        this.idExercicio = idExercicio;
        this.descricao = descricao;
        this.qtSeries = qtSeries;
        this.numRepeticao = numRepeticao;
        this.tempoDescanso = tempoDescanso;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

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
    
}
