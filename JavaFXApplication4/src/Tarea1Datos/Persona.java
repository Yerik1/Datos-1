/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 * Clase que representa una persona basado en su nombre, edad y provincia
 * @author Yerik
 */
public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String provincia;
    
    /**
     * Contructor objeto persona
     * @param nombre, nombre de la persona
     * @param edad, edad de la persona
     * @param provincia, provincia de la persona
     */
    public Persona(String nombre,int edad, String provincia){
        this.nombre=nombre;
        this.edad=edad;
        this.provincia=provincia;
    }
    
    /**
     * Metodo que permite cambiar el nombre de la persona
     * @param nombre, nombre nuevo para la persona
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    /**
     * Metodo que permite cambiar la edad de la persona
     * @param edad, edad nueva de la persona
     */
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    /**
     * Metodo que permite cambiar la provincia de la persona
     * @param provincia, nueva provincia de la persona
     */
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
    
    /**
     * Metodo que retorna el nombre de la persona
     * @return nombre de la persona
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Metodo que retorna la provincia de la persona
     * @return provincia de la persona
     */
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Metodo que retorna la edad de la persona
     * @return la edad de la persona
     */
    public int getEdad(){
        return this.edad;
    }
    
}
