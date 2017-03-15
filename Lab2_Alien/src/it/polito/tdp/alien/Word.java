package it.polito.tdp.alien;

import java.util.*;

public class Word {
	private String alienWord;
	private String translation;
	LinkedList<String>listaAlien = new LinkedList<String>();
	LinkedList<String>listaTranslate = new LinkedList<String>();
	
	public Word(String alienWord, String translation) {
		this.alienWord=alienWord;
		this.translation=translation;
	}

	

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
}
