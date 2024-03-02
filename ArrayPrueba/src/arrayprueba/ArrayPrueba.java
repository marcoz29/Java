/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayprueba;

/**
 *
 * @author Marco
 */
public class ArrayPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
     
    //crear un array de enteros, los valores dentro del array y se van a imprimir
    int[] arreglo; //declaracion del array "arreglo"
    
    arreglo = new int[5]; //se asigna en memoria de 5 espacios
    
    //se almacenan datos en el primer espacion del array
    arreglo[0]=6;
    arreglo[1]=14;
    arreglo[2]=21;
    arreglo[3]=46;
    arreglo[4]=72;
    
    //se accede a los elementos que se encuentran dentro del array
    for(int i = 0; i<arreglo.length; i++)
    {
    System.out.println("Elemento en el espacio " + i + ": " +arreglo[i]);
    }
    System.out.println("Ya no hay mas elementos");
    }
}