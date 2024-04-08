package ejemplo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Ejemplo {

    public static void main(String[] args) {
        Complejo c; //Declaracion
        c= new Complejo(); //Instanciacion
        c.setRe(1);       //Invocacion de metodos
        c.setIm(10);
        System.out.println("Parte real: " + c.getRe());
        System.out.println("Parte imaginaria: " + c.getIm());
        
        Complejo a= new Complejo(2,20);
        System.out.println("Parte real: " + a.getRe());
        System.out.println("Parte imaginaria: " + a.getIm());
        
        System.out.println();
        c.inc(a); //c = c + a
        System.out.println(c);
        
        System.out.println();
        Complejo d;
        d = Complejo.suma(c, c);
        System.out.println(d);
        
    }
}
