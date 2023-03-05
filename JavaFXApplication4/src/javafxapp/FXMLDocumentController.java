/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapp;

import Tarea1Datos.Persona;
import Tarea1Datos.Lista;
import Tarea1Datos.Nodo;
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
    Lista lista= new Lista(); 

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
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x+y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    @FXML
    private void btnAgregar(ActionEvent event) {
        lbResult.setText("");
        if(lista.getLargo()<=3){
            try{
                if(cbProvincia.getValue()!=null){
                    if(tfNombre.getText().length()!=0){
                        Persona persona = new Persona(tfNombre.getText(),Integer.parseInt(tfEdad.getText()),cbProvincia.getValue());
                        cbPers1.getItems().add(persona.getNombre());
                        cbPers2.getItems().add(persona.getNombre());
                        lista.agregar(new Nodo(persona));
                    }else{
                        lbResult.setText("Por favor ingrese un nombre");
                    }
                }else{
                    lbResult.setText("Por favor ingrese una provincia");
                }
            }catch(NumberFormatException e){
                lbResult.setText("Por favor ingrese un numero como edad");
            }
        }else{
            lbResult.setText("Solo se permiten 4 personas");
        }
        tfNombre.setText("");
        tfEdad.setText("");
        
    }

    @FXML
    private void btnResta(ActionEvent event) {
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x-y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    @FXML
    private void btnMult(ActionEvent event) {
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x*y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    @FXML
    private void btnDiv(ActionEvent event) {
        float x=lista.buscar(cbPers1.getValue()).getEdad();
        float y=lista.buscar(cbPers2.getValue()).getEdad();
        double result=(x/y);
        String res=Double.toString(result);
        lbResult.setText(res);
    }
    
}
