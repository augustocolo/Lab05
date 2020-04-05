package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

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

    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert fieldInsert != null : "fx:id=\"fieldInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert areaCorretti != null : "fx:id=\"areaCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert areaErrati != null : "fx:id=\"areaErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
