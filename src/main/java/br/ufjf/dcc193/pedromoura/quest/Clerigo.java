package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.stereotype.Component;

@Component("Clerigo")
public class Clerigo implements Heroi{

    public Clerigo(){
        System.out.println("Um novo clerigo chega ao reino...");
    }

    public void agir(){
        System.out.println("O clerigo luta!");
    }

}
