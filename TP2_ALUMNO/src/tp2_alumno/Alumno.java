/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_alumno;

/**
 *
 * @author mesue
 */
public class Alumno {
    private String apellido,nombre,meil;
    private int lu,notaP1,notaP2,notaR,asistencia;
    private boolean regular;

    public Alumno(){
        
    }
    
    public Alumno(String apellido, String nombre, String meil, int lu, int notaP1, int notaP2, int notaR, int asistencia, boolean regular) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.meil = meil;
        this.lu = lu;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.asistencia = asistencia;
        this.regular = regular;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMeil() {
        return meil;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMeil(String meil) {
        this.meil = meil;
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
    
}
