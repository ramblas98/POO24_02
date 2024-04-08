/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ej1;

/**
 *
 * @author David S
 */
public class Complejo {
    private double re;
    private double im;

    public Complejo() {
        this.re = 0;
        this.im = 0;
    }

    public Complejo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public void inc(Complejo a){
        this.re += a.re; 
        this.im += a.im;
    }
    
    public void dec(Complejo a){
        this.re -= a.re;
        this.im -= a.im;
    }
    public void por(Complejo a){
        this.re = this.re * a.re + this.im * a.im;
        this.im = (this.re * a.im) - (this.im * a.re);
    }
    public void por(double a){
       
    }
    public void div(Complejo a){
        this.re = (this.re * a.re + this.im * a.im)/ Math.pow(a.re,2) + Math.pow(a.im,2);
        this.im = (this.im * a.re - this.re * a.im) / Math.pow(a.re,2) + Math.pow(a.im,2);
        }
    public double modulo(){
        return (Math.sqrt(Math.pow(this.re,2) + Math.pow(this.im,2)));
    }
    public Complejo conjugado(){
        this.im = (-1)* this.im;
        return this;
    }
        
    public static Complejo sumar(Complejo a,Complejo b){
        Complejo c = new Complejo();
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        
        return c;
    }
    public static Complejo resta(Complejo a,Complejo b){
        Complejo c = new Complejo();
        c.re = a.re - b.re;
        c.im = a.im - b.im;
        
        return c;
    }
    public static Complejo producto(Complejo a,Complejo b){
        Complejo c = new Complejo();
        
        c.re = a.re * b.re + a.im * b.im;
        c.im = a.re * b.im - a.im * b.re;
        
        return c;
    }
}
