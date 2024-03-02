/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double notaMin;
        double notaOb;
        int cantidadEstudiantes;
        
        notaMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a nota minima:"));
        cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de estudiantes:"));
        int notas[] = new int[cantidadEstudiantes];
        notaOb = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas obtenidas:"));
        
        for(int i = 0; i<cantidadEstudiantes; i++){
            String nota = JOptionPane.showInputDialog("Ingrese la el numero de estudiante:");
            notas[i] = Integer.parseInt(nota);
            
        }
            
            if(notaMin >= notaOb){
                System.out.println("Reprobado");
        
            }else{
            boolean name = notaOb > notaMin;
                System.out.println("Aprobado");
                
            
        }
               
        for(int i =0; i<cantidadEstudiantes; i++){
        
        System.out.println("El estudiante"+ notas[i] + ",tiene una nota minimade: " + notaMin + ",Obtuvo una nota de: " +notaOb);
        
    
    }
    }
}