package com.epam.botor.domain;

public class LighSabre {

	private final String name;
	private final int damage;

	public LighSabre(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public String hit() {
		return "bumbbumbbbubmm";
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

}
