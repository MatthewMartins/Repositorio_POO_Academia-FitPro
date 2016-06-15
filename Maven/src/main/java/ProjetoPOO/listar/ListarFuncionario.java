package ProjetoPOO.listar;

import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Treino;
import java.util.List;

public class ListarFuncionario {

    private String nomeFun;
    private int idadeFun;
    private String telefoneFun;
    private String ruaFun;
    private String bairroFun;
    private String cidadeFun;
    private long numContrato;
    private int nivelAcesso;
    private String senhaFun;
    //private List<Avaliacao> listaAvaliacoes;
    //private List<Treino> listaTreinos;

    public ListarFuncionario() {

    }

    public ListarFuncionario(String nomeFun, int idadeFun, String telefoneFun, String ruaFun, String bairroFun, String cidadeFun, long numContrato, int nivelAcesso, String senhaFun/*, List<Avaliacao> listaAvaliacoes, List<Treino> listaTreinos*/) {
        this.nomeFun = nomeFun;
        this.idadeFun = idadeFun;
        this.telefoneFun = telefoneFun;
        this.ruaFun = ruaFun;
        this.bairroFun = bairroFun;
        this.cidadeFun = cidadeFun;
        this.numContrato = numContrato;
        this.nivelAcesso = nivelAcesso;
        this.senhaFun = senhaFun;
        //this.listaAvaliacoes = listaAvaliacoes;
        //this.listaTreinos = listaTreinos;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public int getIdadeFun() {
        return idadeFun;
    }

    public void setIdadeFun(int idadeFun) {
        this.idadeFun = idadeFun;
    }

    public String getTelefoneFun() {
        return telefoneFun;
    }

    public void setTelefoneFun(String telefoneFun) {
        this.telefoneFun = telefoneFun;
    }

    public String getRuaFun() {
        return ruaFun;
    }

    public void setRuaFun(String ruaFun) {
        this.ruaFun = ruaFun;
    }

    public String getBairroFun() {
        return bairroFun;
    }

    public void setBairroFun(String bairroFun) {
        this.bairroFun = bairroFun;
    }

    public String getCidadeFun() {
        return cidadeFun;
    }

    public void setCidadeFun(String cidadeFun) {
        this.cidadeFun = cidadeFun;
    }

    public long getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(long numContrato) {
        this.numContrato = numContrato;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenhaFun() {
        return senhaFun;
    }

    public void setSenhaFun(String senhaFun) {
        this.senhaFun = senhaFun;
    }

    //public List<Avaliacao> getListaAvaliacoes() {
      //  return listaAvaliacoes;
    //}

    //public void setListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
      //  this.listaAvaliacoes = listaAvaliacoes;
    //}

    //public List<Treino> getListaTreinos() {
      //  return listaTreinos;
    //}

    //public void setListaTreinos(List<Treino> listaTreinos) {
      //  this.listaTreinos = listaTreinos;
    //}

}
