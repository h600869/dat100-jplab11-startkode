package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private String url;
	private int likes;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.tekst=tekst;
		this.url=url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.tekst=tekst;
		this.url=url;
		this.likes=likes;
	}
	
	public String getUrl() {
		return url;
		
	}

	public void setUrl(String url) {
		this.url=url;
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
