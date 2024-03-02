/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centrodepinturas;



import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class CentroDePinturas {

    
     //Clase principal
     
    public static void main(String[] args) {
        //Instancia del objeto cliente
     Cliente clin = new Cliente();
     pintura pin = new pintura();
     
     //Se inicia las variables
     int menu=0;
     int menuVenta=0;
     int cantidadGalones =0;
     int cantidad= 0;
     int pinturasVendidas= 0;
     double totalVentas= 0;
     String detalleFactura= "";
     
     clin.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: ")); //almacen del nombre
     clin.setCedula(JOptionPane.showInputDialog("Ingrese la cedula: ")); //almacen de la cedula
     detalleFactura = "el nombre del cliente es: " +clin.getNombre()+"\n Y la cedula es: " +clin.getCedula(); //concatenacion
       
    do{
 
        menuVenta= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a centro de pinturas Casa Elegante\n 1. Realizar Venta\n 2. Salir del sistema"));
    
        switch(menuVenta){ //Menu opciones
            case 1: //Double.parsesouble sirve para ingresar numeros decimales 
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pinturas que desea"));
                for(int indice=0; indice<cantidad; indice++){
                    menu= Integer.parseInt(JOptionPane.showInputDialog("Colores disponibles: \n 1. Rojo\n 2. Verde\n 3. Azul"));
                    cantidadGalones= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de galones que necesita"));
                    pin.SetUnidades(cantidadGalones);
                    pinturasVendidas+=cantidadGalones;
                    if(menu ==1){
                        pin.SetColor("Rojo");
                        pin.SetPrecio(12000.0*cantidadGalones);
                        totalVentas+=pin.getPrecio();
                    }
                    else
                        if(menu==2){
                            pin.SetColor("Verde");
                            pin.SetPrecio(15000.0*cantidadGalones);
                            totalVentas+=pin.getPrecio();
                            
                        }else
                            if(menu==3){
                                pin.SetColor("Azul");
                                pin.SetPrecio(17000.0*cantidadGalones);
                                totalVentas+=pin.getPrecio();
                            }
                    if(pin.getPrecio()>=50000){
                        double porcentaje=pin.getPrecio()*0.10;
                        pin.SetPrecio(pin.getPrecio()-porcentaje);
                    }
                    detalleFactura+=pin.getInformacion()+"\n";
                    totalVentas+= pin.getPrecio();
                }
                JOptionPane.showMessageDialog(null, detalleFactura);
                
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Total de pinturas vendidas: " +pinturasVendidas+"\n " +totalVentas);
                System.exit(0);
                
                break;
                }
    }while (menuVenta!=2);
    }    
}