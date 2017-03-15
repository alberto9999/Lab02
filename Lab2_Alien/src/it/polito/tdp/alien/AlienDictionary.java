package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private String alienWord;
	private String translation;
	LinkedList<Word> listaWords = new LinkedList<Word>();
	


	
	public void addWord(String alienWord, String translation){
		boolean trovato = false;
		for(Word w: listaWords){
			
			if(w.getAlienWord().compareTo(alienWord)==0){
				trovato=true;
				w.setTranslation(translation);
				break;
			}
		}
		
		
		if(trovato==false){
		Word w = new Word(alienWord, translation);
		listaWords.add(w);
		}
		
		
	}
	
	
	public String translateWord(String alienWord){
		String traduzione="non ho la traduzione";
		
		for(Word w: listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
			    traduzione=w.getTranslation();
				
		}
		}
			
		return traduzione;
		
	
}


	public void clear() {
		listaWords.clear();
		
	}
	
	
}
