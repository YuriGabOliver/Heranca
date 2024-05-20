package br.unipar.game;

public class Arma_Secundaria {
    private boolean Pegar_Arma;
    private String Inspecionar_Arma;
    private int Capacidade_Municao;
    private int Municao_atual;
    private boolean Modo_Disparo;

    public boolean isPegar_Arma() {
        return Pegar_Arma;
    }

    public void setPegar_Arma(boolean pegar_Arma) {
        Pegar_Arma = pegar_Arma;
    }

    public String getInspecionar_Arma() {
        return Inspecionar_Arma;
    }

    public void setInspecionar_Arma(String inspecionar_Arma) {
        Inspecionar_Arma = inspecionar_Arma;
    }

    public int getCapacidade_Municao() {
        return Capacidade_Municao;
    }

    public void setCapacidade_Municao(int capacidade_Municao) {
        Capacidade_Municao = capacidade_Municao;
    }

    public int getMunicao_atual() {
        return Municao_atual;
    }

    public void setMunicao_atual(int municao_atual) {
        Municao_atual = municao_atual;
    }

    public boolean isModo_Disparo() {
        return Modo_Disparo;
    }

    public void setModo_Disparo(boolean modo_Disparo) {
        Modo_Disparo = modo_Disparo;
    }
}
