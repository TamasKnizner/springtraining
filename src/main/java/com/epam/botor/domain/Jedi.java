package com.epam.botor.domain;

public class Jedi {

	private final LighSabre lighsabre;

	public Jedi(LighSabre lighSabre) {
		this.lighsabre = lighSabre;
	}

	public String fight() {
		return lighsabre.hit();
	}

}
