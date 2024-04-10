/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej4;

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
    
    public void dec(Complejo a){
        this.rea -= a.rea;
        this.ima -= a.ima;
    }
    
    public void por(Complejo a){
        this.rea *= this.rea*a.rea - this.ima*a.ima;
        this.ima *= this.rea*a.ima + this.ima*a.rea;
    }
    
    public void por(double a){
        this.rea *= a;
        this.ima *= a;  
    }
    
    public void div(Complejo a){
        if(a.rea != 0 && a.ima !=0 ){
            double deno =Math.pow(a.modulo(), 2);
            this.rea = (this.rea*a.rea + this.ima*a.ima)/(deno);
            this.ima = (this.ima*a.rea-this.rea*a.ima)/(deno);
        }else System.out.println("No es posible dividir por cero");
    }
    
    public void div(double a){
        if(a!=0){
            this.rea /= a;
            this.ima /= a;
        }else System.out.println("No es posible dividir por cero");
    }
    
    public double modulo(){
        double modu;
        modu = Math.sqrt(Math.pow(rea, 2)+Math.pow(ima, 2));
        return modu;        
    }
    public void conjugado(){
        ima*=-1;
    }
    public static Complejo suma(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.rea = a.rea + b.rea;
        c.ima = a.ima + b.ima;
        return c;
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.rea = a.rea - b.rea;
        c.ima = a.ima - b.ima;
        return c;
    }
    
    public static Complejo producto(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.rea = a.rea*b.rea - a.ima*b.ima;
        c.ima = a.rea*b.ima + a.ima*b.rea;
        return c;
    }
    
    public static Complejo division(Complejo a, Complejo b){
        Complejo c = new Complejo();
        if(b.rea!=0 && b.ima!=0){
            double deno = Math.pow(b.modulo(),2);
            c.rea = ((a.rea*b.rea)+(a.ima*b.ima))/deno;
            c.ima = (a.ima*b.rea-a.rea*b.ima)/deno;
        }else System.out.print("No es posible dividir por cero");    
        return c;
    }
    
    @Override
    public String toString(){
        return "Complejo{" + "rea= " + rea + ", ima= " + ima + '}';
    }
    
}
