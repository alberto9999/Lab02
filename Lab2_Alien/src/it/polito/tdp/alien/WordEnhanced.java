package it.polito.tdp.alien;

import java.util.LinkedList;

public class WordEnhanced {


	
		private String alienWord;
	
		LinkedList<String>listaTranslate ; 
		
		public WordEnhanced(String alienWord) {
			this.alienWord=alienWord;
			listaTranslate=new LinkedList<String>();
		}

		

		public String getAlienWord() {
			return alienWord;
		}

		public void setAlienWord(String alienWord) {
			this.alienWord = alienWord;
		}



		public LinkedList<String> getListaTranslate() {
			return listaTranslate;
		}



		public void setListaTranslate(LinkedList<String> listaTranslate) {
			this.listaTranslate = listaTranslate;
		}

		
		
		
	}


