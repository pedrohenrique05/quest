package br.ufjf.dcc193.pedromoura.quest;

public class Missao {

    private Heroi heroi;
    public Missao(Heroi heroi){
        System.out.println("O Rei criou uma nova missão!"); 
        setHeroi(heroi);
    }
    public Missao(){
        this(null);
    }
    
    public void iniciar(){
        System.out.println("A missão teve inicio!");
    }

    public void concluir(){
        this.heroi.agir();
        System.out.println("A missão chegou ao fim!");
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi Heroi) {
        this.heroi = Heroi;
    }
    
}
