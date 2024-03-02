/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrodepinturas;

/**
 *
 * @author Marco
 */
public class pintura {
    //Atributos
    private String color;
    private double precio;
    private int unidades;
    
    //Constructor
    public pintura(String color, double precio, int unidades){
        this.color = color;
        this.precio = precio;
        this.unidades = unidades;
    }
    public pintura()
    {
            this.color="";
            this.precio=0;
            this.unidades=0;
    }
    //get
    public String getColor(){
        return this.color;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getUnidades(){
        return this.unidades;
    }
    //set
    public void SetColor(String color){
        this.color=color;
    }
    public void SetPrecio(double precio){
        this.precio=precio;
    }
    public void SetUnidades(int unidades){
        this.unidades=unidades;
    }
    
    public String getInformacion(){
        String informacion="\nEl color de la pintura es: "+getColor()+
        "\nCantidad de galones es: "+getUnidades()+
        "\nEl precio total es: "+getPrecio();
        return informacion;
    }
}
