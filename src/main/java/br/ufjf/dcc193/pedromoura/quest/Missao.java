package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Sco
public class Missao {
    @Autowired
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
