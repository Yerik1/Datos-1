/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

//Packete donde se encuentra la clase (es distinto al packete de "Tarea1Datos" debido a que en este packete lo genera automaticamente)
package javafxapp;

// imports del paquete "Tarea1Datos" para acceder a las bases de datos creadas
import Tarea1Datos.Persona;
import Tarea1Datos.Lista;
import Tarea1Datos.Nodo;
// imports JavaFX
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class (default al crear el contolador)
 *
 * @author Yerik
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField tfNombre; //Text Field Nombre de persona
    @FXML
    private TextField tfEdad; //Text Field Edad de persona
    @FXML
    private ChoiceBox<String> cbPers1; //ChoiceBox para escoger a persona 1
    @FXML
    private ChoiceBox<String> cbPers2; //ChoiceBox para escoger a persona 2
    @FXML
    private Label lbResult; //Label del resultado de la operacion
    @FXML
    private ChoiceBox<String> cbProvincia; //ChoiceBox para escoger provincia de la persona
    Lista lista= new Lista(); //Lista enlazada donde se guardaran personas

    /**
     * Initializes the controller class. (default al crear clase controlador)
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbProvincia.getItems().setAll("San Jose","Alajuela","Cartago","Heredia","Limon","Puntarenas","Guanacaste");
    }    

    /**
     * Funcion que guarda la edad de las dos personas escogidas en las choice box
     * y realiza una suma con esas edades y las muestra en el label result
     * 
     * @param event 
     */
    @FXML
    private void btnSuma(ActionEvent event) {
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x+y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    /**
     * Funcion que toma los datos necesarios para crear una persona y luego 
     * agrega el nombre de esta a las choicebox para ser escogidas, y guarda las
     * personas en una lista enlazada
     * 
     * @param event 
     * @rest 
     */
    @FXML
    private void btnAgregar(ActionEvent event) {
        //Cambia la label del resultado a vacia
        lbResult.setText("");
        //Solo se permiten maximo 4 personas en la lista
        if(lista.getLargo()<=3){
            //intenta convertir el valor de edsd a int
            try{
                //Verifica si se escogio la provincia
                if(cbProvincia.getValue()!=null){
                    //Verifica si se ingreso un nombre
                    if(tfNombre.getText().length()!=0){
                        //Verifica si es un entero distinto de 0
                        if(Integer.parseInt(tfEdad.getText())!=0){
                            //Crea la persona
                            Persona persona = new Persona(tfNombre.getText(),Integer.parseInt(tfEdad.getText()),cbProvincia.getValue());
                            //Se añade el nombre de la persona a las choicebox
                            cbPers1.getItems().add(persona.getNombre());
                            cbPers2.getItems().add(persona.getNombre());
                            lista.agregar(new Nodo(persona)); //Se agrega la persona a la lista enlazada
                        }else{
                            //Error edad =0
                            lbResult.setText("Por favor ingrese una edad distinta a 0");
                        }
                    }else{
                        //Error nombre vacio
                        lbResult.setText("Por favor ingrese un nombre");
                    }
                }else{
                    //Error no se selecciono una provincia
                    lbResult.setText("Por favor ingrese una provincia");
                }
            }catch(NumberFormatException e){
                //Error edad no es un entero
                lbResult.setText("Por favor ingrese un numero como edad");
            }
        }else{
            //Error cantidad maxima de personas alcanzada
            lbResult.setText("Solo se permiten 4 personas");
        }
        //Clear de las text box
        tfNombre.setText("");
        tfEdad.setText("");
        
    }

    /**
     * Funcion que guarda la edad de las dos personas escogidas en las choice box
     * y realiza una resta con esas edades y las muestra en el label result
     * @param event 
     */
    @FXML
    private void btnResta(ActionEvent event) {
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x-y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    /**
     * Funcion que guarda la edad de las dos personas escogidas en las choice box
     * y realiza una multiplicacion con esas edades y las muestra en el label result
     * @param event 
     */
    @FXML
    private void btnMult(ActionEvent event) {
        int x=lista.buscar(cbPers1.getValue()).getEdad();
        int y=lista.buscar(cbPers2.getValue()).getEdad();
        int result=x*y;
        String res=Integer.toString(result);
        lbResult.setText(res);
    }

    /**
     * Funcion que guarda la edad de las dos personas escogidas en las choice box
     * y realiza una division con esas edades y las muestra en el label result
     * @param event 
     */
    @FXML
    private void btnDiv(ActionEvent event) {
        float x=lista.buscar(cbPers1.getValue()).getEdad();
        float y=lista.buscar(cbPers2.getValue()).getEdad();
        double result=(x/y);
        String res=Double.toString(result);
        lbResult.setText(res);
    }
    
}
