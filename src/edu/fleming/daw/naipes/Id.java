package edu.fleming.daw.naipes;

public enum Id {
	AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K;
	
	public boolean isFigura() {
		return this == J || this == Q || this == K;
	}
}
