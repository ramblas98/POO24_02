/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author profeblas
 */
public class Complejo {
    private double rea, ima;
    public Complejo(){
        this.rea = this.ima = 0;
    }
    public Complejo(double rea, double ima){
        this.rea = rea;
        this.ima = ima;
    }
    public double getRea(){
        return rea;
    }
    public double getIma(){
        return ima;
    }
    public void setRea(double rea){
        this.rea = rea;
    }
    public void setIma(double ima){
        this.ima = ima;
    }
    public void inc(Complejo a){
        this.rea += a.rea;
        this.ima += a.ima;
    }
    public static Complejo suma(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.rea = a.rea + b.rea;
        c.ima = a.ima + b.ima;
        return c;
    }
    @Override
    public String toString(){
        return "Complejo{" + "rea=" + rea + ", ima=" + ima + '}';
    }
    
    
}
