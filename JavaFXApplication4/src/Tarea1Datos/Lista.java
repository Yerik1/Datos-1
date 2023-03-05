/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 *
 * @author kondy
 */
public class Lista {
    private Nodo head;
    private int largo;
    
    Lista(){
        head=null;
        largo=0;
    }
    
    public void agregar(Nodo node){
        Nodo temp;
        if(this.head==null){
            this.head=node;
        }else{
            temp=this.head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
        this.largo++;
    }
    
    public void setHead(Nodo node){
        this.head=node;
    }
    
    public void setLargo(int largo){
        this.largo=largo;
    }
    
    public Nodo getHead(){
        return this.head;
    }
    
    public int getLargo(){
        return this.largo;
    }
}
