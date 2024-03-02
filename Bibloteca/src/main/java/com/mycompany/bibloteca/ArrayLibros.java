/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibloteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class ArrayLibros {

    private Libro libros[];

    public ArrayLibros(int tamano) {
        libros = new Libro[tamano];
    }

    public void agregarLibro(int posicion, Libro valor) {
        //Se agrega libro por arreglo
        libros[posicion] = valor;
    }

    public String mostrarLibro(int posicion) {
        String info = "";

        if (libros[posicion] != null) {
            info = libros[posicion].getInfoLibros();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el libro en la posicion: " + posicion);
        }
        JOptionPane.showMessageDialog(null, "Libro " + posicion + info);
        return info;

    }

    public int tamanoArreglo() {

        JOptionPane.showMessageDialog(null, "El tamano del arreglo es de: " + libros.length);
        return libros.length;
    }

    public String mostarTodosLibros() {
        String info = "";

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                info += libros[i].getInfoLibros();
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningun libro por mostrar");
            }

        }
        JOptionPane.showMessageDialog(null, "Estos son todos los libros de la biblioteca: \n" + info);
        return info;
    }

    public String buscarLibroAutor(String autor) {
        String info = "";

        for (int i = 0; i < libros.length; i++) {
            if (libros[i].GetAutor().equals(autor))
            {
                info += libros[i].getInfoLibros();
            }else {
                JOptionPane.showMessageDialog(null, "El autor " + autor + "no tiene libros en la base de datos");
                    }
        }
        JOptionPane.showMessageDialog(null, "Libros del autor: " + autor + info);

        return info;
    }

    public String buscarLibroInscripcion(String inscripcion) {
        String info = "Inscripcion no encontrada";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].GetInscripcion().equals(inscripcion)) {
                info += libros[i].getInfoLibros();
            }
        }

        JOptionPane.showMessageDialog(null, "Resultados de la busqueda de: " + inscripcion + "\n" + info);
        return info;
    }
    public String buscarLibrosAutor(String autor) {
        String info = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].GetAutor().equals(autor)) {
                info = libros[i].getInfoLibros();
            }
        }

        JOptionPane.showMessageDialog(null, "Resultados de la busqueda de: " + inscripcion + "\n" + info);
        return info;
    }

    public void eliminarLibro(String inscripcion) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].GetInscripcion().equals(inscripcion)) {
                libros[i] = null;
                JOptionPane.showMessageDialog(null, "El libro con la inscripcion " + inscripcion + "se ha eliminado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado el libro por la inscripcion: " + inscripcion);
            }
        }
    }
}
