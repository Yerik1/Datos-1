/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kondy
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfEdad;
    @FXML
    private Label lbResult;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnSuma(ActionEvent event) {
        String name= tfNombre.getText();
        lbResult.setText("Hola "+name);
    }

    private void btnAdd(ActionEvent event) {
        String name= tfNombre.getText();
        lbResult.setText("Hola "+name);
    }

    @FXML
    private void btnResta(ActionEvent event) {
    }

    @FXML
    private void btnMult(ActionEvent event) {
    }

    @FXML
    private void btnDiv(ActionEvent event) {
    }

    @FXML
    private void btnAgregar(ActionEvent event) {
        String name= tfNombre.getText();
        lbResult.setText("Hola "+name);
    }
    
}
