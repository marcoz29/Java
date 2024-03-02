/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carazo.plan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class CarazoPlan {
    
    public static ArrayList<CursoPlan> Cursos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaraciones
        String menu = "************** Uni. Castro Carazo - Cursos Plan ************** \n"
                + "Menu principal - digite una opcion \n"
                + "1 - Guardar curso. \n"
                + "2 - Modificar curso. \n"
                + "3 - Consultar curso. \n"
                + "4 - Eliminar curso. \n"
                + "5 - Listar cursos. \n"
                + "6 - Salir. \n";
        //Variable para almacenar
        int opcion;
        boolean operacion;
        
        //Variable para soliciar datos
        int id;
        String nombrecurso;
        int duracion;
        String profesor;
        
        //Objetos
        CursoPlan myCurso;
        
        do {
           //Obtener la opcion ingresada
           opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
           
           //Controlar las opciones
           switch (opcion){
               case 1: //Guardar un curso
                   //Solicitar datos al usuario
                   id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id."));
                   nombrecurso = JOptionPane.showInputDialog("Ingrese nombre del curso");
                   duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion."));
                   profesor = JOptionPane.showInputDialog("Ingrese nombre del profesor.");
                   
                   //Creamos la instancia
                   myCurso = new CursoPlan(id, nombrecurso, duracion, profesor);
                   
                   //Evaluar la operacion
                   operacion = myCurso.Guardar();
                   if (operacion == true) {
                       JOptionPane.showMessageDialog(null, "Curso ingresado correctamente.");
                   } else {
                       JOptionPane.showMessageDialog(null, "Ya exise un curso registrado con el nombre:" + id);
                   }
                   break;
               case 2: //Actualizar
               //Solicitar datos
               id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
               
               //Crear la instancia
               myCurso = new CursoPlan(id);
               
               //Solicitar datos
               nombrecurso = JOptionPane.showInputDialog("Ingrese el nombre del curso.");
               duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion."));
               profesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor.");
               
               //Asignamos los nuevos valores
               myCurso.SetNombreCurso(nombrecurso);
               myCurso.SetDuracion(duracion);
               myCurso.SetProfesor(profesor);
               
               //Actualizar datos
               operacion = myCurso.Actualizar();
               
               //Evaluar la operacion
               if (operacion) {
                   JOptionPane.showMessageDialog(null, "Curso actualizado correctamente.");
               } else{
                   JOptionPane.showMessageDialog(null, "No existe un Curso registrado con el nombre:" + id);
               }
               break;
               case 3: //Consultar
                   //Solicitamos los datos
                   id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del curso"));
                   
                   //Creamos la instancia
                   myCurso = new CursoPlan(id);
                   
                   //Consultar
                   myCurso = myCurso.Consultar();
                   
                   //Evaluamos
                   if (myCurso != null) {
                       String informacion = "-- Datos del curso. -- \n"
                               + "Id: " + myCurso.GetId() + "\n"
                               + "Nombre del Curso:" + myCurso.GetNombreCurso() + "\n"
                               + "Duracion:" + myCurso.GetDuracion() + "\n"
                               + "Profesor:" + myCurso.GetProfesor() + "\n"
                               + "---------------------------------";
                       JOptionPane.showMessageDialog(null, informacion);
                   } else {
                       JOptionPane.showMessageDialog(null, "No existe un curso registrado con el nombre: " + id);
                   }
                   break;
               case 4: //Eliminar
                   //Solicitamos
                   id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id."));
                   
                   //Creamos una instancia
                   myCurso = new CursoPlan(id);
                   
                   //Evaluamos
                   operacion = myCurso.Eliminar();
                   if (operacion) {
                       JOptionPane.showMessageDialog(null, "Curso eliminado correctamente.");
                   } else {
                       JOptionPane.showMessageDialog(null, "No existe un curso registrado con el nombre:" + id);
                   }
                   break;
               case 5: //Listar lis cursos
                   //Creamos una instancia
                   myCurso = new CursoPlan();
                   String listado = "-- Curso registrado. -- \n";
                   
                   //Recorremos los cursos
                   for (CursoPlan curso : myCurso.Listar()) {
                       listado += "Id: " + curso.GetId() + "\n"
                               + "Nombre del Curso: " + curso.GetNombreCurso() + "\n"
                               + "Duracion: " + curso.GetDuracion() + "\n"
                               + "Profesor: " + curso.GetProfesor() + "\n"
                               + "--------------------------------------- \n";
                   }
                   
                   //Mostrar el resultado
                   JOptionPane.showMessageDialog(null, listado);
                   break;
           }
        } while (opcion <= 5);
        
    }
    
}
