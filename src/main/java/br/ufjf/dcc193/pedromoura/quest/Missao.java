package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Missao {
    /**
     * varre todo o projeto
     */
    @Autowired
    /**
     * Classifica especificamente qual o componente que será chamado
     */
    @Qualifier("Clerigo")
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
