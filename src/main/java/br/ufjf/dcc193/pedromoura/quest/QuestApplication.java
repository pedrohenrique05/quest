package br.ufjf.dcc193.pedromoura.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(QuestApplication.class, args);
		System.out.println("Hora de Aventura");

		//Heroi h1 = ctx.getBean(Cavaleiro.class);
		Missao m1 = ctx.getBean(Missao.class);
		//Heroi h1 = Guilda.createHeroi();
		//Heroi h1 = new Cavaleiro();
		//Missao m1 = new Missao();
		m1.iniciar();
		m1.setHeroi(ctx.getBean(Cavaleiro.class));
		m1.concluir();
	}
}
