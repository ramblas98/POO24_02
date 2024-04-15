/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej7;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Luis Mendoza
 */
public class Persona {
    private long dni;
    private String nombre,apellido;
    private LocalDate fnac;
    

    public Persona(long dni, String nombre, String apellido, LocalDate fnac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnac = fnac;
    }
    public Persona(){             
    }

    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fnac=" + fnac + '}';
    }
    
    public void mostrarAyP(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
    
    public static int edad(LocalDate fact){
        
       LocalDate actual = LocalDate.now(); //Fecha actual
       Period periodo = Period.between(fact,actual); //Saca la edad de la persona
       
       return periodo.getYears(); //Retorna los años de la persona
    }
    
    public static boolean cumpleanios(LocalDate fact){
        LocalDate actual = LocalDate.now(); //Fecha actual
        
        if(fact.getDayOfMonth()==actual.getDayOfMonth() && fact.getMonth() == actual.getMonth()){
            return true;
        }
        else return false;
    }
    
}
