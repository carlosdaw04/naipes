package edu.fleming.daw.naipes;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {

	private static final Random R = new Random();
	
	protected ArrayList<Naipe> naipes;
	
	public Mazo() {
		naipes = new ArrayList<Naipe>();
	}
	
	public Mazo(int n) {
		this();
		for (int i=0; i<n; i++)
			for (Palo palo: Palo.values()) 
				for (Id id: Id.values()) {
					naipes.add(new Naipe(palo, id, id.isFigura() ? 10 : id.ordinal() + 1));
				}
	}
	
	public void add(Naipe n) {
		naipes.add(n);
	}
	
	public void add(Mazo m) {
		naipes.addAll(m.naipes);
		m.naipes.clear();
	}
	
	public int numeroNaipes() {
		return naipes.size();
	}
	
	public Naipe getNaipe() {
		if (naipes.isEmpty())
			return null;
		int i = R.nextInt(naipes.size());
		Naipe n = naipes.get(i);
		naipes.remove(i);
		return n;
	}
	
	public Naipe [] get() {
		return (Naipe []) naipes.toArray();
	}
}
