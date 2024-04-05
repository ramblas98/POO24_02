/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author magal
 */
public class Complejo {
    private double re, im;

    public Complejo() {
        this.re = 0;
        this.im = 0;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public void setIm(int im) {
        this.im = im;
    }
    
    //Métodos de instancia(NO estáticos)
    
    public void inc(Complejo a){
        this.re += a.re;
        this.im += a.im;
    }
    
    public void dec(Complejo a){
        this.re -= a.re;
        this.im -= a.im;
    }
    
    public void por(Complejo a){ //(c.re*a.re + c.im*a.im , c.re*a.im - c.im*a.re) 
        double p1, p2;
        p1 = this.re * a.im;
        p2 = this.im * a.re;
        this.re = this.re * a.re + this.im * a.im;
        this.im = p1 - p2;
    }
    
    public void div(Complejo a){
        this.re = (this.re * a.re + this.im * a.im) / (Math.pow(a.re,2) + Math.pow(a.im, 2));
        this.im = (this.im * a.re - this.re * a.im) / (Math.pow(a.re,2) + Math.pow(a.im, 2));
    }
    
    public double modulo(){
        return (Math.sqrt((Math.pow(this.re,2)) + Math.pow(this.im,2)));
    }
    
    public Complejo conjugado(){
        this.im = (-1) * this.im;
        return this;
    }
    
    //Métodos Generales

    @Override
    public String toString() {
        return "Complejo{" + "re=" + re + ", im=" + im + '}';
    }
    
    //Métodos de Clases
    
    public static Complejo suma(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        return c;
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.re = a.re - b.re;
        c.im = a.im - b.im;
        return c;
    }
    
    public static Complejo priducto(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.re = a.re * b.re + a.im * b.im;
        c.im = a.re * b.im - a.im * b.re;
        return c;
    }
    public static Complejo division(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.re = (a.re * b.re + a.im * b.im) / (Math.pow(b.re, 2) + Math.pow(b.im, 2));
        c.im = (a.im * b.re - a.re * b.im) / (Math.pow(b.re, 2) + Math.pow(b.im, 2));
        return c;
    }
}
