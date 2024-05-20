package br.unipar.game;
import java.sql.Timestamp;

public class Personagem_Defensor extends Personagem {
    private boolean Desarme_Spike;
    private Long Tempo_Desarme;

    public boolean isDesarme_Spike() {
        return Desarme_Spike;
    }

    public void setDesarme_Spike(boolean desarme_Spike) {
        Desarme_Spike = desarme_Spike;
    }

    public Long getTempo_Desarme() {
        return Tempo_Desarme;
    }

    public void setTempo_Desarme(Long tempo_Desarme) {
        Tempo_Desarme = tempo_Desarme;
    }
}
