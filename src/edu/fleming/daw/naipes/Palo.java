package edu.fleming.daw.naipes;

public enum Palo {
	TREBOLES('\u2663'), DIAMANTES('\u2662'), CORAZONES('\u2661'), PICAS('\u2660');

	private char simbolo;

	private Palo(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
