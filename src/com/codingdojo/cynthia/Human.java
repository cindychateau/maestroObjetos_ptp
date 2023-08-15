package com.codingdojo.cynthia;

public class Human {
	
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	protected String nombre;
	
	public Human(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * this = elena
	 * victima = juana
	 * juana.health -= elena.strength -> 100 - 3 = 97
	 */
	public void attack(Human victima) {
		victima.health -= this.strength;
		System.out.println(this.nombre+" ataca a "+victima.nombre+" Salud de victima:"+victima.health);
		System.out.println(this.toString());
		System.out.println(victima.toString());
	}

	@Override
	public String toString() {
		return "Human [strength=" + strength + ", stealth=" + stealth + ", intelligence=" + intelligence + ", health="
				+ health + ", nombre=" + nombre + "]";
	}
	
	
	
}
