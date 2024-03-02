/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carazo.plan;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class CursoPlan {
    //Atributos - Privados
    private int id; //Atributo llave
    private String nombrecurso;
    private int duracion;
    private String profesor;
    
    //Propiedades de escritura
    public void SetId(int pId){
        this.id = pId;
    }
    
    public void SetNombreCurso(String pNombreCurso){
            this.nombrecurso = pNombreCurso;
    }
    
    public void SetDuracion(int pDuracion){
        this.duracion = pDuracion;
    }
    
    public void SetProfesor(String pProfesor){
        this.profesor = pProfesor;
    }
    
    //Propiedades de lectura
    public int GetId(){
        return this.id;
    }
    
    public String GetNombreCurso(){
        return this.nombrecurso;
    }
    
    public int GetDuracion(){
        return this.duracion;
    }
    
    public String GetProfesor(){
        return this.profesor;
    }
    
    //Constructor vacio
    public CursoPlan(){}
    
    //Constructor llave
    public CursoPlan(int pId){
        this.id = pId;
    }
    
    //Constructor lleno
    public CursoPlan(int pId, String pNombreCurso, int pDuracion, String pProfesor){
        this.id = pId;
        this.nombrecurso = pNombreCurso;
        this.duracion = pDuracion;
        this.profesor = pProfesor;
    }
    
    //Metodos para manipular informacion
    public boolean Guardar(){
        //Consultar
        CursoPlan myCurso = this.Consultar();
        
        //Validar si existe
        if (myCurso == null){
            //Si no existe, se mandara a guardar
            return CarazoPlan.Cursos.add(this);
            
        } else {
            //Consulta si hay un duplicado
            return false;
        }
    }
    
    public boolean Actualizar(){
        //Consultar si ya existe.
        CursoPlan myCurso = this.Consultar();
        
        //Validar si exise
        if (myCurso != null){
            //Borramos el registro anterior
            CarazoPlan.Cursos.remove(myCurso);
            
            //Agregamos el registro actualizado
            return CarazoPlan.Cursos.add(this);
        } else{
            return false;
        }
    }
    
    public boolean Eliminar(){
        //Consultar si existe
        CursoPlan myCurso = this.Consultar();
        
        //Validar si existe
        if (myCurso != null){
            //Borramos el registro anterior
            return CarazoPlan.Cursos.remove(myCurso);
        } else {
            return false;
        }
    }
    
    public CursoPlan Consultar(){
        //Declarar la varieble local
        CursoPlan myCurso = null;
        
        //Realizar una busqueda
        for (CursoPlan Registro : CarazoPlan.Cursos){
            if (Registro.id == (this.id)){
                myCurso = Registro;
                break;
            }
        }
        
        return myCurso;
    }
    
    public ArrayList<CursoPlan> Listar(){
        //Retornar los valores
        return CarazoPlan.Cursos;
    }
}
