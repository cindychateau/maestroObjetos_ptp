package com.codingdojo.cynthia;

public class Wizard extends Human {
	
	/*private int health = 50;
	private int intelligence = 8;*/

	public Wizard(String nombre) {
		super(nombre);
		this.health = 50;
		this.intelligence = 8;
	}
	
	/*
	 Wizard harryPotter = new Wizard("Harry Potter");
	 Human elena = new Human("Elena");
	 harryPotter.heal(elena);
	 this = harryPotter 
	 */
	public void heal(Human humano) {
		//this se refiere al objeto que está invocando
		humano.health += this.intelligence;
		System.out.println(this.nombre+" curo a "+humano.nombre);
		System.out.println(this.toString());
		System.out.println(humano.toString());
	}
	
	public void fireBall(Human victima) {
		victima.health -= this.intelligence*3;
		System.out.println("Ataque de bola de fuego de "+this.nombre+" a "+victima.nombre);
		System.out.println(this.toString());
		System.out.println(victima.toString());
	}

}
