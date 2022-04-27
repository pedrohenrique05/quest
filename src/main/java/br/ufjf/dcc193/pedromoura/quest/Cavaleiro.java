package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.stereotype.Component;
/**
 * é instanciado sem ser 'chamado'
 */
@Component("Cavaleiro")
public class Cavaleiro implements Heroi{

    
    public Cavaleiro(){
        System.out.println("Um novo cavaleiro chega ao reino...");
    }

    public void agir(){
        System.out.println("O cavaleiro luta!");
    }

}
