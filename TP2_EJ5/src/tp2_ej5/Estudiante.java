/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej5;

public class Estudiante {
    private String apellidos, nombres, email;
    private int lu, notaP1, notaP2, notaR,  asistencia;
    private boolean regular;

    public Estudiante() {
        regular = false;
        asistencia = 0;
        notaP1 = notaP2 = notaR = 0;
    }

    public Estudiante(String apellidos, String nombres, int lu, String email) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
        regular = false;
        asistencia = 0;
        notaP1 = notaP2 = notaR = 0;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
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

    public String getNotaP2() {
        return apellidos;
    }

    public int getNotaR() {
        return notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLu(int l) {
        this.lu = l;
    }

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
        verificar();
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
        verificar();
    }

    public void incAsistencia() {
        this.asistencia++;
    }

    public void incAsistencia(int c) {
        this.asistencia += c;
    }

    private void verificar() {
        if ((notaP1 >= 6 && notaP2 >= 6) || notaR >= 6) this.regular = true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", email=" + email + ", lu=" + lu + ", notaP1=" + notaP1 + ", notaP2=" + notaP2 + ", notaR=" + notaR + ", asistencia=" + asistencia + ", regular=" + regular + '}';
    }

}
