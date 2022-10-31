package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private int likes;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.tekst=tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.tekst=tekst;
		this.likes=likes;
	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
