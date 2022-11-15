package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private int lengde;
	private Innlegg[] innleggtabell;
	private int nesteledige;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return this.nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int e = 0;
		while (e < nesteledige && !funnet) {
			if (innleggtabell[e] == innlegg)
			funnet = true;
			else 
			e++;
		}
		if (funnet) return e;
		else 
			return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		int f = finnInnlegg(innlegg);
		if (f >=0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		for(int g =0; g < innleggtabell.length; g++) {
			if(innleggtabell[g] == null) {
				return true;
			}
			else
				g++;
		} return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && nesteledige < innleggtabell.length) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige ++;
			return true;
		} else {
				return false;
		}
	}
	
	public String toString() {
		String svar = "2"+"\n";
        for (int i = 0; i < nesteledige; i++) {
            svar += innleggtabell[i].toString() + "";
        }
        return svar;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}