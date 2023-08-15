package com.codingdojo.cynthia;

public class HumanTest {

	public static void main(String[] args) {
		
		Human elena = new Human("Elena");
		Human juana = new Human("Juana");
		
		elena.attack(juana);
		
		//Nuevo Samurai
		Samurai pablo = new Samurai("Pablo");
		
		//Wizard
		Wizard harryPotter = new Wizard("Harry Potter");
		
		//Ninja
		Ninja jackiChan = new Ninja("Jackie Chan");
		
		pablo.meditate();
		pablo.deathBlow(elena);
		
		harryPotter.fireBall(jackiChan);
		jackiChan.steal(pablo);
		

	}

}
