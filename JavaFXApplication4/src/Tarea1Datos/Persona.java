/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 *
 * @author kondy
 */
public class Persona {
    private String nombre;
    private int edad;
    private String provincia;
    
    public Persona(String nombre,int edad, String provincia){
        this.nombre=nombre;
        this.edad=edad;
        this.provincia=provincia;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
}
