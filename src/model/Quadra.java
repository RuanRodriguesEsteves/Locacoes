package model;

public class Quadra {
    int id, tipoQuadra;
    String nome;
    double valorMinuto;
    
    public Quadra(int tipoQuadra, String nome, double valorMinuto){
        this.tipoQuadra = tipoQuadra;
        this.nome = nome;
        this.valorMinuto = valorMinuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoDaQuadra() {
        return tipoQuadra;
    }

    public void setTipoQuadra(int tipoDaQuadra) {
        this.tipoQuadra = tipoDaQuadra;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
