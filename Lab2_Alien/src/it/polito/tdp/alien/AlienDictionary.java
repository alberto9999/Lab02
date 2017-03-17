package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {


	LinkedList<WordEnhanced> listaWords = new LinkedList<WordEnhanced>();
	


	
	public void addWord(String alienWord, String translation){
		boolean bool= false;
		for(WordEnhanced w: listaWords){			
			if(w.getAlienWord().compareTo(alienWord)==0){	
				w.getListaTranslate().add(translation);
				bool = true;
				break;
			}
		}
		if(bool == false){
			WordEnhanced w = new WordEnhanced(alienWord);
			listaWords.add(w);
			w.getListaTranslate().add(translation);
		}
		
		

		
	}
	
	
	public String translateWord(String alienWord){
		String str = "";
		
		int contt=0;
		String alfabeto= "qwertyuiopasdfghjklzxcvbnm";
		char[] alfabetochar=alfabeto.toCharArray();
	
		boolean bool = false;
		if(alienWord.contains("?")){
			bool = true;
			for(int j=0;j<alfabeto.length();j++){
				String parola = alienWord.replace('?', alfabetochar[j]);
				for(WordEnhanced w: listaWords){
					if(w.getAlienWord().compareTo(parola)==0){
						LinkedList<String>listaTraduzioni=new LinkedList<String>( w.getListaTranslate());
						String [] s = new String[listaTraduzioni.size()] ;
						int i=0;
						str+="parola di riferimento: "+parola+"\n";
						for(String p :listaTraduzioni){
							s[i]=p;
							str+=s[i]+"\n";
							i++;	
							contt=1;
			        	}
				
		     	}			
	     	}
		
		}
	}	
		
		if(bool==false){
		for(WordEnhanced w: listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
				LinkedList<String>listaTraduzioni=new LinkedList<String>( w.getListaTranslate());
				String [] s = new String[listaTraduzioni.size()] ;
				int i=0;
				for(String p :listaTraduzioni){
					s[i]=p;
					str+=s[i]+"\n";
					i++;
					contt=1;
		}
		}
		}
		}
		if(contt==0){
		   str="nessuna parola corrisponde ai dati di ricerca";
		}
		return str;			
}


	public void clear() {
		listaWords.clear();
		
	}
	
	
}
