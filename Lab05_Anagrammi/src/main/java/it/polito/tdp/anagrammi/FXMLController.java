package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressBar;

public class FXMLController {
	
	Model model;
	
	@FXML
    private ProgressBar progress;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField fieldInsert;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea areaCorretti;

    @FXML
    private TextArea areaErrati;

    @FXML
    private Button btnReset;
    

    @FXML
    void doCalcola(ActionEvent event) {
    	String word = fieldInsert.getText();
    	List<String> out = this.model.getAnagrammi(word);
    	String textCorretto = "";
    	String textErrato = "";
    	for (String s: out) {
    		if (model.anagrammaCorretto(s)) {
    			textCorretto += s + "\n";
    		} else {
    			textErrato += s + "\n";
    		}
    	}
    	areaCorretti.setText(textCorretto);
    	areaErrati.setText(textErrato);
    }

    @FXML
    void doReset(ActionEvent event) {
    	fieldInsert.clear();
    	areaCorretti.clear();
    	areaErrati.clear();
    }

    @FXML
    void initialize() {
        assert progress != null : "fx:id=\"progress\" was not injected: check your FXML file 'Scene.fxml'.";
        assert fieldInsert != null : "fx:id=\"fieldInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert areaCorretti != null : "fx:id=\"areaCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert areaErrati != null : "fx:id=\"areaErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
    }
    
    public void setModel(Model in) {
    	this.model = in;
    }
}
