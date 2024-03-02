/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impmonge.vehiculos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco.Rivera
 */
public class ImpMongeVehiculos {

    /* Declarar arrayList de vehículos.
     * Esta estructura me permitirá almacenar todos los registros de los 
     * vehículos que Importadora Monge requiera.
     */
    public static ArrayList<clsVehiculo> Vehiculos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaraciones
        String menu = "************** Imp. Monge - Control Vehicular ************** \n"
                + "Menú principal - Digite una opción: \n"
                + "1 - Guardar un vehículo. \n"
                + "2 - Modificar un vehículo. \n"
                + "3 - Consultar un vehículo. \n"
                + "4 - Eliminar un vehículo. \n"
                + "5 - Listar los vehículos. \n"
                + "6 - Salir.";
        // Variable para almacenar la opción ingresada por el usuario.
        int opcion;
        boolean operacion;

        // Variables para solicitar datos del vehículo al usuario.
        int motor;
        String placa;
        String modelo;
        String color;
        String marca;
        int caja;
        int year;

        // Objetos
        clsVehiculo myVehiculo;

        do {
            // Obtener la opción ingresada por el usuario del menú.            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Controlar las opciones.
            switch (opcion) {
                case 1: // Guardar un vehículo.
                    // Solicitamos los datos al usuario.
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo.");
                    motor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el motor del vehículo."));
                    modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo.");
                    color = JOptionPane.showInputDialog("Ingrese el color del vehículo.");
                    marca = JOptionPane.showInputDialog("Ingrese el marca del vehículo.");
                    caja = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la caja del vehículo."));
                    year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehículo."));

                    // Creamos la instancia del objeto
                    myVehiculo = new clsVehiculo(placa, caja, color, marca, modelo, motor, year);

                    // Evaluamos la operación.
                    operacion = myVehiculo.Guardar();
                    if (operacion == true) {
                        JOptionPane.showMessageDialog(null, "Vehículo ingresado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe un vehículo registrado con la placa: " + placa);
                    }
                    break;
                case 2: // Actualizar un vehículo.
                    // Solicitamos los datos al usuario (placa).
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");

                    // Creamos la instancia del objeto.
                    myVehiculo = new clsVehiculo(placa);

                    // Solicitar los otros datos al usuario.
                    motor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el motor del vehículo."));
                    modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo.");
                    color = JOptionPane.showInputDialog("Ingrese el color del vehículo.");
                    marca = JOptionPane.showInputDialog("Ingrese el marca del vehículo.");
                    caja = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la caja del vehículo."));
                    year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehículo."));

                    // Asignamos los nuevos valores.
                    myVehiculo.SetMotor(motor);
                    myVehiculo.SetModelo(modelo);
                    myVehiculo.SetColor(color);
                    myVehiculo.SetMarca(marca);
                    myVehiculo.SetCaja(caja);
                    myVehiculo.SetYear(year);

                    // Actualizamos el vehículo.
                    operacion = myVehiculo.Actualizar();

                    // Evaluar la operación
                    if (operacion) { // True cuando actualiza
                        JOptionPane.showMessageDialog(null, "Vehículo actualizado correctamente.");
                    } else { // False cuando no existe
                        JOptionPane.showMessageDialog(null, "No existe un vehículo registrado con la placa: " + placa);
                    }
                    break;
                case 3: // Consultar un vehículo.
                    // Solicitamos los datos al usuario (la placa del vehículo).
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo.");

                    // Creamos la instancia del objeto
                    myVehiculo = new clsVehiculo(placa);

                    // Consultamos el vehículo.
                    myVehiculo = myVehiculo.Consultar();

                    // Evualuamos el resultado.
                    if (myVehiculo != null) {
                        String informacion = "-- Datos del vehículo. -- \n"
                                + "Placa: " + myVehiculo.GetPlaca() + "\n"
                                + "Marca: " + myVehiculo.GetMarca() + "\n"
                                + "Modelo: " + myVehiculo.GetModelo() + "\n"
                                + "Año: " + myVehiculo.GetYear() + "\n"
                                + "Caja: " + myVehiculo.GetCaja() + "\n"
                                + "Color: " + myVehiculo.GetColor() + "\n"
                                + "Motor: " + myVehiculo.GetMotor() + "\n";
                                
                        JOptionPane.showMessageDialog(null, informacion);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un vehículo registrado con la placa: " + placa);
                    }
                    break;
                case 4: // Eliminar un vehículo.
                    // Solicitamos los datos al usuario.
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo.");

                    // Creamos la instancia del objeto
                    myVehiculo = new clsVehiculo(placa);

                    // Evaluamos la operación.
                    operacion = myVehiculo.Eliminar();
                    if (operacion) {
                        JOptionPane.showMessageDialog(null, "Vehículo eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un vehículo registrado con la placa: " + placa);
                    }
                    break;
                case 5: // Listar los vehículos existentes
                    // Creamos la instancia del objeto
                    myVehiculo = new clsVehiculo();
                    String listado = "-- Vehículos registrados. -- \n";

                    // Recorremos los vehpiculos registrados.
                    for (clsVehiculo vehiculo : myVehiculo.Listar()) {
                        listado += "Placa: " + vehiculo.GetPlaca() + "\n"
                                + "Marca: " + vehiculo.GetMarca() + "\n"
                                + "Modelo: " + vehiculo.GetModelo() + "\n"
                                + "Año: " + vehiculo.GetYear() + "\n"
                                + "Caja: " + vehiculo.GetCaja() + "\n"
                                + "Color: " + vehiculo.GetColor() + "\n"
                                + "Motor: " + vehiculo.GetMotor() + "\n";
                    }

                    // Mostramos el resultado de los vehículos existentes.
                    JOptionPane.showMessageDialog(null, listado);
                    break;
            }
        } while (opcion <= 5);
    }

}
