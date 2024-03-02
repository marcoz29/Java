/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrodepinturas;

/**
 *
 * @author Marco
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String cedula;
    
    //constructor
    public Cliente(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public Cliente()
    {
            this.nombre="";
            this.cedula="";
    }
    //get
    public String getNombre(){
        return this.nombre;
    }
    public String getCedula(){
        return this.cedula;
    }
    
    //set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    
}
