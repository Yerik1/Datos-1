/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapp;

import Tarea1Datos.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
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
    private ChoiceBox<String> cbPers1;
    @FXML
    private ChoiceBox<String> cbPers2;
    @FXML
    private Label lbResult;
    @FXML
    private ChoiceBox<String> cbProvincia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbProvincia.getItems().setAll("San Jose","Alajuela","Cartago","Heredia","Limon","Puntarenas","Guanacaste");
    }    

    @FXML
    private void btnSuma(ActionEvent event) {
    }

    @FXML
    private void btnAgregar(ActionEvent event) {
        Persona persona = new Persona(tfNombre.getText(),Integer.parseInt(tfEdad.getText()),cbProvincia.getValue());
        cbPers1.getItems().add(persona.getNombre());
        cbPers2.getItems().add(persona.getNombre());
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
    
}
