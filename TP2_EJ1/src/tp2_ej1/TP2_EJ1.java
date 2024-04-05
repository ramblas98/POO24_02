/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

import java.util.Scanner;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Complejo c = new Complejo();
        Complejo d = new Complejo();
        double e;
        Complejo f = new Complejo();
        
        System.out.println("Pimer complejo:");
        
        System.out.print("Parte Real: ");
        c.setRe(teclado.nextInt());
        System.out.print("Parte Compleja: ");
        c.setIm(teclado.nextInt());
        //System.out.println("Pimer complejo ingresado: (" + c.getRe() + " , " + c.getIm() + "i)");
        System.out.println(c);
        
        System.out.println("Segundo complejo:");
        d.setRe(5);
        d.setIm(7);
        System.out.println(d);
        System.out.println();
        System.out.println("Resultado de la SUMA:");
        c.inc(d);
        System.out.println(c);
        System.out.println();
        System.out.println("Resultado de la DIFERENCIA:");
        c.dec(d);
        System.out.println(c);
        System.out.println();
        System.out.println("Resultado del PRODUCTO:");
        c.por(d);
        System.out.println(c);
        System.out.println();
        System.out.println("Resultado del COCIENTE:");
        c.div(d);
        System.out.println(c);
        System.out.println();
        System.out.println("Resultado del MODULO:");
        e = c.modulo();
        System.out.println(e);
        System.out.println();
        System.out.println("Resultado del CONJUGADO");
        f = c.conjugado();
        System.out.println(f);
        System.out.println();
        Complejo g = new Complejo();
        Complejo h = new Complejo();
        g.setRe(3);
        g.setIm(1);
        System.out.println(g);
        System.out.println();
        h.setRe(2);
        h.setIm(5);
        System.out.println(h);
        System.out.println();
        
        
        System.out.println("Resultado de la SUMA:");
        System.out.println(Complejo.suma(g,h));
        System.out.println();
        System.out.println("Resultado de la DIFERNECIA:");
        System.out.println(Complejo.resta(g, h));
        System.out.println();
        System.out.println("Resultado del PRODUCTO:");
        System.out.println(Complejo.priducto(g, h));
        System.out.println();
        System.out.println("Resultado del COCIENTE:");
        System.out.println(Complejo.division(g, h));
        System.out.println();
    }
    
}
