/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 *
 * @author kondy
 */
public class Nodo {
    private Nodo next;
    private Persona data;
    
    public Nodo(Persona persona){
        this.data=persona;
        this.next=null;
    }
    
    public void setNext(Nodo node){
        this.next=node;
    }
    
    public void setPersona(Persona persona){
        this.data=persona;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    
    public Persona getData(){
        return this.data;
    }

}
