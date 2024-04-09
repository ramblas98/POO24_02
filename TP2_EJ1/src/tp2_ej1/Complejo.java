/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author Luis Mendoza
 */
public class Complejo {
    private double re,im;   //Estos son los parametros del complejo
    
    public Complejo(double re, double im) {
        this.re = re; //Este es para asignar los dos parametros a la ves utilizando el"NEW"                 
        this.im = im;
    }
    public Complejo(){ //Este es para no asignar valor a los parametros utilizando el "NEW"
    }
    
    
    
    public double getRe() {  //Estos son para retornar los parametros real e imaginario
        return re;           //Ej: para mostrar el parametro deseado
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) { //Asigna el valor a la parte real
        this.re = re;
    }

    public void setIm(double im) {  //Asigna el valor a la parte imaginaria
        this.im = im;
    }
     //metodos de instancia
    public void inc(Complejo a){
        this.re += a.re;
        this.im += a.im;
    }
    public void dec(Complejo a){
        this.re -= a.re;
        this.im -= a.im;
    }
    
    public static Complejo modu(Complejo b){
    Complejo a = new Complejo();
    a.re = Math.sqrt(b.re* b.re);
    a.im = Math.sqrt(b.im * b.im);
    return a;
    }
    
    public void conjugado(){
    this.im = -this.im;
    }
    public void por(Complejo b){
     this.re = (this.re * b.re)-(this.im*b.im);                       
     this.im = (this.re * b.im)+(this.im * b.re);
    }
    public void div(Complejo b){
     this.re = ((this.re * b.re)+(this.im * b.im)) / ((b.re * b.re)+(b.im * b.im));                       
     this.im = ((this.im * b.re)-(this.re * b.im)) / ((b.re * b.re)+(b.im * b.im));
    }
    
    //Metodos generales
    
    @Override
    public String toString() {
        return "COMPLEJO{" + "re=" + re + ", im=" + im + '}';
    }
    //METODOS DE CLASE
    public static Complejo suma(Complejo a,Complejo b){
        Complejo c = new Complejo();          //(a.re,a.im)  OTRA FORMA a C se le asigna A
        c.re = a.re + b.re;                       //c.inc(b);   OTRA FORMA seSuma C+B
        c.im = a.im + b.im;
        return c;
    }
    
    public static Complejo resta(Complejo a,Complejo b){
        Complejo c = new Complejo();
        c.re = a.re - b.re;                       
        c.im = a.im - b.im;
        return c;
    }
    
    public static Complejo multiplicacion(Complejo a,Complejo b){
        Complejo c = new Complejo();
        c.re = (a.re * b.re)-(a.im*b.im);                       
        c.im = (a.re * b.im)+(a.im * b.re);
        return c;
    }
    
    
    public static Complejo divicion(Complejo a,Complejo b){
        Complejo c = new Complejo();
        c.re = ((a.re * b.re)+(a.im * b.im)) / ((b.re * b.re)+(b.im * b.im));                       
        c.im = ((a.im * b.re)-(a.re * b.im)) / ((b.re * b.re)+(b.im * b.im)); 
        return c;
    }

    boolean modulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
