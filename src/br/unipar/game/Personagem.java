package br.unipar.game;

public class Personagem {
    private String Fala;
    private String Nome;
    private String Time;
    private int Vida;
    private boolean Atirar;
   private boolean Mirar;
    private boolean Recarga;
    private boolean Andar;
    private boolean Agaixar;
    private boolean Habilidade1;
    private boolean Habilidade2;
    private boolean Habilidade3;
    private boolean Ultimate;
    private boolean Largar_Item;
    private boolean Pegar_Item;
    private boolean Spray;
    private boolean Marcar_Local;

    public String getFala() {
        return Fala;
    }

    public void setFala(String fala) {
        Fala = fala;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public boolean isAtirar() {
        return Atirar;
    }

    public void setAtirar(boolean atirar) {
        Atirar = atirar;
    }

    public boolean isMirar() {
        return Mirar;
    }

    public void setMirar(boolean mirar) {
        Mirar = mirar;
    }

    public boolean isRecarga() {
        return Recarga;
    }

    public void setRecarga(boolean recarga) {
        Recarga = recarga;
    }

    public boolean isAndar() {
        return Andar;
    }

    public void setAndar(boolean andar) {
        Andar = andar;
    }

    public boolean isAgaixar() {
        return Agaixar;
    }

    public void setAgaixar(boolean agaixar) {
        Agaixar = agaixar;
    }

    public boolean isHabilidade1() {
        return Habilidade1;
    }

    public void setHabilidade1(boolean habilidade1) {
        Habilidade1 = habilidade1;
    }

    public boolean isHabilidade2() {
        return Habilidade2;
    }

    public void setHabilidade2(boolean habilidade2) {
        Habilidade2 = habilidade2;
    }

    public boolean isHabilidade3() {
        return Habilidade3;
    }

    public void setHabilidade3(boolean habilidade3) {
        Habilidade3 = habilidade3;
    }

    public boolean isUltimate() {
        return Ultimate;
    }

    public void setUltimate(boolean ultimate) {
        Ultimate = ultimate;
    }

    public boolean isLargar_Item() {
        return Largar_Item;
    }

    public void setLargar_Item(boolean largar_Item) {
        Largar_Item = largar_Item;
    }

    public boolean isPegar_Item() {
        return Pegar_Item;
    }

    public void setPegar_Item(boolean pegar_Item) {
        Pegar_Item = pegar_Item;
    }

    public boolean isSpray() {
        return Spray;
    }

    public void setSpray(boolean spray) {
        Spray = spray;
    }

    public boolean isMarcar_Local() {
        return Marcar_Local;
    }

    public void setMarcar_Local(boolean marcar_Local) {
        Marcar_Local = marcar_Local;
    }
}
