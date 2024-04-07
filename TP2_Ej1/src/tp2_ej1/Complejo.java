/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author elcho
 */
public class Complejo {
    double re;
    double im;
    
    public Complejo(double re, double im){
        this.re = re;
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
        double tempRe = this.re * a.re - this.im * a.im;
        double tempIm = this.re * a.im + this.im * a.re;
        this.re = tempRe;
        this.im = tempIm;
    }
    
    public void por(double d){
        this.re *= d;
        this.im *= d;
    }
    
    public void div(Complejo a){
        double divisor = a.re * a.re + a.im * a.im;
        if(divisor != 0){
            double tempRe = (this.re * a.re + this.im * a.im) / divisor;
            double tempIm = (this.im * a.re - this.re * a.im) / divisor;
            this.re = tempRe;
            this.im = tempIm;
        } else{
            System.out.println("No se puede dividir por cero");
        }
    }
    
    public double modulo(){
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }
    public Complejo conjugado(){
        return new Complejo(this.re, -this.im);
    }
    
    public static Complejo suma(Complejo a, Complejo b){
        return new Complejo(a.re + b.re, a.im + b.im);
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        return new Complejo(a.re - b.re, a.im - b.im);
    }
    
    public static Complejo producto(Complejo a, Complejo b){
       return new Complejo(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);
    }
    
    public static Complejo division(Complejo a, Complejo b){
        double divisor = b.re * b.re + b.im * b.im;
        if(divisor != 0){
            double tempRe = (a.re * b.re + a.im * b.im) / divisor;
            double tempIm = (a.im * b.re - a.re * b.im) / divisor;
            return new Complejo(tempRe, tempIm);
        } else{
            System.out.println("No se puede dividir por cero");
            return null;
        }
    }
}
