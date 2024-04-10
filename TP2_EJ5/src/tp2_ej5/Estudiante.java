/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej5;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza
 */
public class Estudiante {
    Scanner teclado = new Scanner(System.in);
    private String apellido,nombre,email;
    private int lu,notaP1,notaP2,notaR,asistencia;
    private boolean regular;

    public Estudiante(String apellido, String nombre, String email, int lu, int notaP1, int notaP2, int notaR, int asistencia, boolean regular) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.lu = lu;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.asistencia = asistencia;
        this.regular = regular;
    }
      

    
    public Estudiante(){
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getLu() {
        return lu;
    }

    public int getNotaP1() {
        return notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public int getNotaR() {
        return notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public boolean isRegular() {
        return regular;
    }
    
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellido=" + apellido + ", nombre=" + nombre + ", email=" + email + ", lu=" + lu + ", notP1=" + notaP1 + ", notaP2=" + notaP2 + ", notaR=" + notaR + ", asistencia=" + asistencia + ", regular=" + regular + '}';
    }
    
    public void incAsistencia() {
        this.asistencia++;
    }

    public void incAsistencia(int c) {
        this.asistencia += c;
    }

    public void verificar() {
        if ((notaP1 >= 6 && notaP2 >= 6) || notaR >= 6) this.regular = true;
    }
    
    public void carga(){
        System.out.println("Ingresar Apellido:");
        this.apellido = teclado.next();
        System.out.println("Ingresar Nombre:");
        this.nombre = teclado.next();
        System.out.println("Ingresar email:");
        this.email = teclado.next();
        System.out.println("Ingresar lu:");
        this.lu = teclado.nextInt();
        System.out.println("Ingresar notaP1:");
        this.notaP1 = teclado.nextInt();
        System.out.println("Ingresar notaP1:");
        this.notaP2 = teclado.nextInt();
        if(notaP1 < 6 && notaP2 < 6){
            System.out.println("Ingresar notaR:");
            this.notaR = teclado.nextInt();
         }
        System.out.println("Ingresar cantidad de asistencias:");
        this.asistencia = teclado.nextInt();
        
        this.regular = false;
    
    }
    
}
