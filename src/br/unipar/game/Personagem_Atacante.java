package br.unipar.game;
import java.sql.Timestamp;

public class Personagem_Atacante extends Personagem{

    private boolean Plantar_Spike;
    private Long Tempo_Plantar;

    public boolean isPlantar_Spike() {
        return Plantar_Spike;
    }

    public void setPlantar_Spike(boolean plantar_Spike) {
        Plantar_Spike = plantar_Spike;
    }

    public Long getTempo_Plantar() {
        return Tempo_Plantar;
    }

    public void setTempo_Plantar(Long tempo_Plantar) {
        Tempo_Plantar = tempo_Plantar;
    }
}