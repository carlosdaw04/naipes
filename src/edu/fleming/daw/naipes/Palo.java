package edu.fleming.daw.naipes;

public enum Palo {
	TREBOLES('\u2663'), DIAMANTES('\u2666'), CORAZONES('\u2665'), PICAS('\u2660');

	private char simbolo;

	private Palo(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
