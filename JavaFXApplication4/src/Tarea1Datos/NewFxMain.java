/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

//Pckete del proyecto e imports necesarios para la inicializacion
package Tarea1Datos;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase Main donde se encuentra el metodo main para que corra lo relacionado a JavaFX
 * @author Yerik
 */
public class NewFxMain extends Application {
    
    /**
     * Metodo para iniciar la ventana (default al crear clase main en JavaFX)
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo main (default al crear clase main en JavaFX)
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
