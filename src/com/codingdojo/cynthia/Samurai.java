package com.codingdojo.cynthia;

public class Samurai extends Human {
	
	//private int health = 200;
	
	private static int cantidad = 0; //Algo general PARA TODA LA CLASE

	public Samurai(String nombre) {
		super(nombre);
		this.health = 200;
		Samurai.cantidad+=1;
	}
	
	public void deathBlow(Human victima) {
		victima.health = 0;
		this.health /= 2;
		System.out.println(this.nombre+" ataco con deadBlow y mato a "+victima.nombre);
		System.out.println(this.toString());
		System.out.println(victima.toString());
	}
	
	public void meditate() {
		this.health += this.health/2;
		System.out.println("OMMMMMMMM nueva salud de "+this.health);
		System.out.println(this.toString());
	}
	
	public static int howMany() {
		return Samurai.cantidad;
	}

}
