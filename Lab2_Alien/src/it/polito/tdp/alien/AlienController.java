package it.polito.tdp.alien;

import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary dictionary = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doClear(ActionEvent event) {
    	
    	txtResult.clear();
    	dictionary.clear();
    	txtInsert.clear();
    	

    }
   
    @FXML
    void doTranslate(ActionEvent event) {
    	
     String inserimento = txtInsert.getText().toLowerCase();
     boolean   bool=false;
     String[] arrayIns= inserimento.split(" ");
     String ins = "";
     for(String s : arrayIns){
    	 ins+=s;	 
     }
    	for( char c :ins.toCharArray()){
        	if(((int)c<97||(int)c>122)&& c !='?'){
        		bool=true;
        		break;
        	}
    	}
        	if(ins.contains("?")){
        	int cont =0;
        for(char c1 :ins.toCharArray())	{
        	if(c1=='?')
        		cont++;		
        }
        if(cont!=1)
        	bool=false;
        	}
        
    	
    	if(bool==false){
    	
    	String[] arrayLettura= inserimento.split(" ");
    
        if(arrayLettura.length==1){
        	String parola= arrayLettura[0];
        	String result=dictionary.translateWord(parola);
        	txtResult.setText(result);
    
        }
        
        
        if(arrayLettura.length==2){
        	String alien = arrayLettura[0];
        	String trad = arrayLettura[1];
        	dictionary.addWord(alien, trad);
        	txtResult.setText("parola inserita correttamente");
        		
        }
        
        
        if((arrayLettura.length!=1)&&(arrayLettura.length!=2)&&(arrayLettura.length!=0)){
        	 txtResult.setText("errore: inserire 1 o 2 parole");

        }
        

        if(arrayLettura.length==0){
        	 txtResult.setText("devi prima inserire una o due parole");
        }
    	}
    	else{
    		 txtResult.setText("formato non valido");
    	}
    	
    	
    	
    	

    }

    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
