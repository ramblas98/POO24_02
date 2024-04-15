/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej8;

public class Persona {
    private String nombre, apellido;
    private int dni;
    
    public Persona(){
    }
    public Persona(String nombre,String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    /* 
    public String GetNombre(){
        return nombre;
    }
    
    public String GetApellido(){
        return apellido;
    }
    
    public int GetDni(){
        return dni;
    }*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String ape){
        this.apellido = ape;
    }
    public void setNombre(int dni){
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "" + nombre + " " + apellido + ", DNI:" + dni +" ";
    }
}
