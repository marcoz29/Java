package com.mycompany.bibloteca;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Marco
 */
public class OperacionLibro {

    ArrayLibros aLibro;
    Libro miLibro;

    //tamano del vector o arreglo
    int tamlibros;

    public OperacionLibro() {
        try{
        tamlibros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de libros que desea tener en la biblioteca"));

        //Se cre la instancia del array
        aLibro = new ArrayLibros(tamlibros);
        }cath   (NumberFormatException e){
        System.out.println("No digito ningun valor correspondiente");
        System.exit(0);
    }

    public void menu() {
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la biblioteca"
                    + "\nSelecciones una opcion:"
                    + "\n 1.Incluir libros"
                    + "\n 2.Mostrar informacion de un libro"
                    + "\n 3.Mostrar informacion de todos los libros"
                    + "\n 4.Buscar libro por autor"
                    + "\n 5.Buscar libro por inscripcion"
                    + "\n 6.Mostrar un libro de un mismo autor"
                    + "\n 7.Eliminar un libro "));

            switch (opcion) {
                case 1:
                    ingresarLibros();
                    break;
                case 2:
                    int posLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del libro a mostrar"));
                    aLibro.mostrarLibro(posLibro);
                    break;
                case 3:
                    aLibro.mostrarLibro();
                case 4:
                    String autorLibro = JOptionPane.showInputDialog("Para buscar su libro por autor, \n Ingrese el nombre del autor");
                    aLibro.buscarLibroAutor(autorLibro);
                    break;
                case 5:
                    String inscripLibro = JOptionPane.showInputDialog("Para buscar su libro por inscripcion, \n Ingrese el numero de inscripcion");
                    aLibro.buscarLibroInscripcion(inscripLibro);
                case 6:
                    String librosAutor = JOptionPane.showInputDialog("Para buscar los autores repetidos, \n Ingrese el nombre del autor");
                    aLibro.buscarLibrosAutor(librosAutor);
                    break;
                case 7:
                    String delete = JOptionPane.showInputDialog("Digite  la inscripcion del libro a eliminar");
                    aLibro.eliminarLibro(delete);
                case 8:
                    System.exit(0);
            }//Fin del switch
        } while (opcion != 8);
    }//Fin del metodo menu

    public void ingresarLibros() {
        String titulo = "";
        String autor = "";
        String inscripcion = "";

        for (int i = 0; i < tamlibros; i++) {
            titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro: " + i);
            autor = JOptionPane.showInputDialog("Ingrese el autor del libro: " + titulo);
            inscripcion = JOptionPane.showInputDialog("Ingrese la inscripcion del libro: " + titulo);

            miLibro = new libros(titulo, autor, inscripcion);
            aLibro.agregarLibro(i, miLibro);
        }

    }
}
