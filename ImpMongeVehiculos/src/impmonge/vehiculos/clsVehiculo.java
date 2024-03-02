/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impmonge.vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Marco.Rivera
 */
public class clsVehiculo {
    // Atributos - Privados *
    private int motor;
    private String placa; // Atributo llave o identificador
    private String modelo;
    private String color;
    private String marca;
    private int caja;
    private int year;

    // Propiedades de escritura - Públicos *
    public void SetMotor(int pMotor){
        this.motor = pMotor;
    }
    
    public void SetPlaca(String pPlaca){
       this.placa = pPlaca; 
    }
    
    public void SetModelo(String pModelo){
        this.modelo = pModelo;
    }
    
    public void SetColor(String pColor){
        this.color = pColor;
    }
    
    public void SetMarca(String pMarca){
        this.marca = pMarca;
    }
    
    public void SetCaja(int pCaja){
        this.caja = pCaja;
    }
    
    public void SetYear(int pYear){
        this.year = pYear;
    }
    
    // Propiedades de lectura - Públicos *
    public int GetMotor(){
        return this.motor;
    }
    
    public String GetPlaca(){
        return this.placa;
    }
    
    public String GetModelo(){
        return this.modelo;
    }
    
    public String GetColor(){
        return this.color;
    }
    
    public String GetMarca(){
        return this.marca;
    }
    
    public int GetCaja(){
        return this.caja;
    }
    
    public int GetYear(){
        return this.year;
    }
    
    // Métodos CONSTRUCTORES
    // Constructor vacio
    public clsVehiculo(){}
    
    // Constructor llave
    public clsVehiculo(String pPlaca){
        this.placa = pPlaca;
    }
    
    // Constructor  lleno
    public clsVehiculo(String pPlaca, int pCaja, String pColor, String pMarca, String pModelo, int pMotor, int pYear){
        this.placa = pPlaca;
        this.caja = pCaja;
        this.color = pColor;
        this.marca = pMarca;
        this.modelo = pModelo;
        this.motor = pMotor;
        this.year = pYear;
    }
    
    // Métodos para manipulación de información.
    public boolean Guardar(){
        // Consultar si la placa ya existe.
        clsVehiculo myVehiculo = this.Consultar();
        
        // Validar si el vehículo existe.
        if (myVehiculo == null) {
            // Si no existe el vehículo (o sea es null), se procede a guardarlo y retornar true.
            return ImpMongeVehiculos.Vehiculos.add(this);
        } else {
            // La consulta arrojó datos por lo que se detectó un duplicado se retorna false.
            return false;
        }
    }
    
    public boolean Actualizar(){
        // Consultar si la placa ya existe.
        clsVehiculo myVehiculo = this.Consultar();
        
        // Validar si el vehículo existe.
        if (myVehiculo != null) {
            // Borramos el registro anterior del vehículo asociado a la placa.
            ImpMongeVehiculos.Vehiculos.remove(myVehiculo);
            
            // Agregamos el registro actualizado.
            return ImpMongeVehiculos.Vehiculos.add(this);
        } else {
            return false;
        }
    }
    
    public boolean Eliminar(){
        // Consultar si la placa ya existe.
        clsVehiculo myVehiculo = this.Consultar();
        
        // Validar si el vehículo existe.
        if (myVehiculo != null) {
            // Borramos el registro del vehículo asociado a la placa.
            return ImpMongeVehiculos.Vehiculos.remove(myVehiculo);
        } else {
            return false;
        }
    }
    
    public clsVehiculo Consultar(){
        // Declaro la variable local a utilizar como respuesta al proceso.
        clsVehiculo myVehiculo = null;
        
        // Realizar la búsqueda del vehículo con la placa ingresada o (atributo llave).
        for (clsVehiculo Registro : ImpMongeVehiculos.Vehiculos) {
            if (Registro.placa.equals(this.placa)) {
                myVehiculo = Registro;
                break;
            }
        }
        
        return myVehiculo;
    }
    
    public ArrayList<clsVehiculo> Listar(){
        // Retorna los valores de la lista.
        return ImpMongeVehiculos.Vehiculos;
    }
}