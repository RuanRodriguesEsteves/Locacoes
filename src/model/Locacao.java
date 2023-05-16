package model;

import java.util.Date;

public class Locacao {
    int id, quadra, locatario;
    char necessitaEquipamento;
    String dataHoraInicio;
    String dataHoraTermino;
    double precoTotal;
    
    public Locacao(int quadra, int locatario, char necessitaEquipamento, String dataHoraInicio, String dataHoraTermino, double precoTotal){
        this.quadra = quadra;
        this.locatario = locatario;
        this.necessitaEquipamento = necessitaEquipamento;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraTermino = dataHoraTermino;
        this.precoTotal = precoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuadra() {
        return quadra;
    }

    public void setQuadra(int quadra) {
        this.quadra = quadra;
    }

    public int getLocatario() {
        return locatario;
    }

    public void setLocatario(int locatario) {
        this.locatario = locatario;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(String dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
