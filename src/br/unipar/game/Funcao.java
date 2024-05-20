package br.unipar.game;

public class Funcao extends Personagem{

    private String Duelista;
    private String Iniciador;
    private String Controlador;
    private String Sentinela;

    public String getDuelista() {
        return Duelista;
    }

    public void setDuelista(String duelista) {
        Duelista = duelista;
    }

    public String getIniciador() {
        return Iniciador;
    }

    public void setIniciador(String iniciador) {
        Iniciador = iniciador;
    }

    public String getControlador() {
        return Controlador;
    }

    public void setControlador(String controlador) {
        Controlador = controlador;
    }

    public String getSentinela() {
        return Sentinela;
    }

    public void setSentinela(String sentinela) {
        Sentinela = sentinela;
    }
}
