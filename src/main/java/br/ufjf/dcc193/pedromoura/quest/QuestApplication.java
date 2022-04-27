package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);
		System.out.println("Hora de Aventura");

		Heroi h1 = new Cavaleiro();
		Missao m1 = new Missao();
		m1.iniciar();
		m1.setHeroi(h1);
		m1.concluir();
	}
}
