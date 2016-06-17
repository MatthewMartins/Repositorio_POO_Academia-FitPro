package ProjetoPOO.listar;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;


public class ListarAvaliacao {
    
    private long idAvaliacao;
    private float peso;
    private float altura;
    private float peito;
    private float biceps;
    private float triceps;
    private float ombro;
    private float costa;
    private float coxa;
    private float panturrilha;
    private float quadril;
    private String nomeAluno; //nome do aluno que esta associado a uma determinada avaliacao
    //private Aluno aluno;
    //private Funcionario funcionario;
    
    public ListarAvaliacao(Avaliacao avaliacao){
        this.idAvaliacao = avaliacao.getIdAvaliacao();
         this.peso = avaliacao.getPeso();
         this.altura = avaliacao.getAltura();
         this.peito = avaliacao.getPeito();
         this.biceps = avaliacao.getBiceps();
         this.triceps = avaliacao.getTriceps();
         this.ombro = avaliacao.getOmbro();
         this.costa = avaliacao.getCosta();
         this.coxa = avaliacao.getCoxa();
         this.panturrilha = avaliacao.getPanturrilha();
         this.quadril = avaliacao.getQuadril();
         //fazer o for para pegar o nome do aluno que esta associado a avalicao
    }
    
    public ListarAvaliacao() {
        //this.aluno = aluno;
    }

    public ListarAvaliacao(long idAvaliacao, float peso, float altura, float peito, float biceps, float triceps, float ombro, float costa, float coxa, float panturrilha, float quadril, String nomeAluno) {
        this.idAvaliacao = idAvaliacao;
        this.peso = peso;
        this.altura = altura;
        this.peito = peito;
        this.biceps = biceps;
        this.triceps = triceps;
        this.ombro = ombro;
        this.costa = costa;
        this.coxa = coxa;
        this.panturrilha = panturrilha;
        this.quadril = quadril;
        this.nomeAluno = nomeAluno;
    }
    
    
    
    public long getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(long idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeito() {
        return peito;
    }

    public void setPeito(float peito) {
        this.peito = peito;
    }

    public float getBiceps() {
        return biceps;
    }

    public void setBiceps(float biceps) {
        this.biceps = biceps;
    }

    public float getTriceps() {
        return triceps;
    }

    public void setTriceps(float triceps) {
        this.triceps = triceps;
    }

    public float getOmbro() {
        return ombro;
    }

    public void setOmbro(float ombro) {
        this.ombro = ombro;
    }

    public float getCosta() {
        return costa;
    }

    public void setCosta(float costa) {
        this.costa = costa;
    }

    public float getCoxa() {
        return coxa;
    }

    public void setCoxa(float coxa) {
        this.coxa = coxa;
    }

    public float getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(float panturrilha) {
        this.panturrilha = panturrilha;
    }

    public float getQuadril() {
        return quadril;
    }

    public void setQuadril(float quadril) {
        this.quadril = quadril;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
