/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declarar las variables
        String mensajeUno = "Ingrese la base del triangulo.";
        String mensajeDos = "Ingrese la altura del triangulo.";
        
        String valorUnoSolocitado;
        String valorDosSolicitado;
        
        int valorNumeroUno = 0;
        int valorNumeroDos = 0;
        
        //Solicitar valores al usuario
        valorUnoSolocitado = JOptionPane.showInputDialog(mensajeUno);
        valorDosSolicitado = JOptionPane.showInputDialog(mensajeDos);
        
        //Convertir los valores de texto a numeros
        valorNumeroUno = Integer.parseInt(valorUnoSolocitado);
        valorNumeroDos = Integer.parseInt(valorDosSolicitado);
        
        //Realizamos el proceso de sumar los numeros
       int resultado = (valorNumeroUno * valorNumeroDos) /2 ;
        
        //Enviamos el mensaje al usuario
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + resultado);
    }
    
}
