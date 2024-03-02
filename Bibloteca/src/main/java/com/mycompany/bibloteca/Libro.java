/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibloteca;

/**
 *
 * @author Marco
 */
public class Libro {

    private String titulo;
    private String autor;
    private String inscripcion;

    public void SetTitulo(String pTitulo) {
        this.titulo = pTitulo;
    }

    public void SetAutor(String pAutor) {
        this.autor = pAutor;
    }

    public void SetInscripcion(String pInscripcion) {
        this.inscripcion = pInscripcion;
    }

    public String GetTitulo() {
        return this.titulo;
    }

    public String GetAutor(){
        return this.autor;
    }
    
    public String GetInscripcion(){
        return this.inscripcion;
    }
    
    public String getInfoLibros(){
        return "\n Libros; " + titulo + "\n autor: " + autor + "\n inscripcion: " + inscripcion;
    }
}
