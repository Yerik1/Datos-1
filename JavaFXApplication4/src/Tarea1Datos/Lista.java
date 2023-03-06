/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1Datos;

/**
 * Clase que permite crear una lista enlazada y realizar acciones con esta
 * @author Yerik
 */
public class Lista {
    //Atributos Cabeza de lista y largo de lista
    private Nodo head;
    private int largo;
    
    /**
     * Constructor clase Lista, crea una lista sin nodos y de largo 0
     */
    public Lista(){
        head=null;
        largo=0;
    }
    /**
     * Funcion que permite buscar una persona por el nombre en la lista enlazada
     * @param nombre, nombre de la persona a buscar
     * @return objeto Persona perteneciente a la lista con nombre del parametro nombre
     */
    public Persona buscar(String nombre){
        //Nodo auxiliar para recorrer la lista
        Nodo temp=this.head;
        //Compara el nombre de la persona del auxiliar con el nombre del argumento
        while(temp.getData().getNombre()!=nombre){
            temp=temp.getNext();
        }
        //Cuando se llega al nodo correcto se devuelve la persona del nodo auxiliar
        return temp.getData();
    }
    
    /**
     * Funcion que permite agregar un nodo a la lista
     * @param node, nodo a agregar a la lista
     */
    public void agregar(Nodo node){
        //Nodo temporal para buscar la ultima posicion
        Nodo temp;
        //Si la cabeza de lista no existe se agrega el nodo a esta
        if(this.head==null){
            this.head=node;
        }else{
            temp=this.head;
            //Se busca el ultimo nodo de la lista
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            //Se agrega al ultimo nodo de la lista el nodo del parametro
            temp.setNext(node);
        }
        //Se aumenta el largo de la lista
        this.largo++;
    }
    
    /**
     * Metodo set que permite modificar el valor de la cabeza de lista 
     * @param node, valor a asignar a la cabeza de lista
     */
    public void setHead(Nodo node){
        this.head=node;
    }
    
    /**
     * Metodo que permite modificar el largo de la lista
     * @param largo, valor de largo a asignar
     */
    public void setLargo(int largo){
        this.largo=largo;
    }
    
    /**
     * Metodo que returna la cabeza de lista
     * @return nodo de cabeza de lista
     */
    public Nodo getHead(){
        return this.head;
    }
    
    /**
     * Metodo que retorna el largo de la lista
     * @return largo de la lista
     */
    public int getLargo(){
        return this.largo;
    }
}
