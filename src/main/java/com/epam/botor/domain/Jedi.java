package com.epam.botor.domain;

public class Jedi {

	private final LighSabre lighsabre;

	public Jedi() {
		this.lighsabre = new LighSabre("LS", 100);
	}

	public String fight() {
		return lighsabre.hit();
	}

}
