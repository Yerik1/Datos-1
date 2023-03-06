/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 * Clase que representa un nodo de una lista donde se guardan objetos tipo persona
 * @author Yerik
 */
public class Nodo {
    //Atributos
    private Nodo next;
    private Persona data;
    
    /**
     * Constructor objeto Nodo
     * @param persona, objeto persona a guardar en el nodo
     */
    public Nodo(Persona persona){
        this.data=persona;
        //Se inicializa sin un nodo siguiente
        this.next=null;
    }
    
    /**
     * Metodo que permite cambiar el valor del nodo siguiente
     * @param node, Valor del nodo que va a ser el siguiente en la lista
     */
    public void setNext(Nodo node){
        this.next=node;
    }
    
    /**
     * Metodo que permite cambiar el objeto persona que almacena el nodo
     * @param persona, objeto persona que se quiere guardar en el nodo
     */
    public void setPersona(Persona persona){
        this.data=persona;
    }
    
    /**
     * Metodo que retorna el nodo siguiente al actual
     * @return nodo siguiente
     */
    public Nodo getNext(){
        return this.next;
    }
    
    /**
     * Metodo que retorna la persona guardada en el nodo
     * @return data, persona guardada en el nodo
     */
    public Persona getData(){
        return this.data;
    }

}
