/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Pablo
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private String correo;
    
    public Estudiante(){} 
    
    public Estudiante(String nombre, String matricula, String carrera,
            String correo){
       
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.correo = correo;
    }
    
      public String getNombre(){return this.nombre;}    
      public String getMatricula(){return this.matricula;}
      public String getCarrera(){return this.carrera;}
      public String getCorreo(){return this.correo;}
      
       public String toString(){
        String cadena = "";
        cadena += "Nombre: " + this.nombre + 
                "\nMatricula: " + this.matricula +
                "\nCarrera: " + this.carrera +
                "\nCorreo: " + this.correo;
        return cadena;
    } 
}
