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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

}
