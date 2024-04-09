/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;
import java.util.*;
/**
 *
 * @author Luis Mendoza
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo c; 
        c = new Complejo();
        c.setRe(2); 
        c.setIm(5); 
        System.out.println("Parte Real: " + c.getRe()); 
        System.out.println("Parte Imaginaria: " + c.getIm()); 
        
        System.out.println("************************************************");
        
        Complejo a = new Complejo(3,10);
        System.out.println("Parte Real: " + a.getRe());
        System.out.println("Parte Imaginaria: " + a.getIm());
        
        System.out.println("************************************************");
        
        System.out.println("INC:");
        Complejo in = new Complejo(2,4);
        in.inc(a);
        System.out.println(in);
        
        System.out.println("************************************************");
        
        System.out.println("DEC:");
        Complejo de = new Complejo(4,7);
        de.dec(a);
        System.out.println(de);
        
        System.out.println("************************************************");
        
        System.out.println("MODULO:");
        Complejo mod;
        mod = Complejo.modu(a);
        System.out.println(mod);
        
        System.out.println("************************************************");
        
        System.out.println("POR:");
        Complejo p = new Complejo(6,9);
        p.por(a);
        System.out.println(p);
        
        System.out.println("************************************************");
        
        System.out.println("DIV:");
        Complejo divi = new Complejo(3,4);
        divi.div(a);
        System.out.println(divi);
        
        System.out.println("************************************************");
        
        System.out.println("conjugado:");
        Complejo con = new Complejo(5,8);
        con.conjugado();
        System.out.println(con);
        
        
        
        
        
        System.out.println("************************************************");
        
        
        
        
        
        //_____________________________________________
        
        System.out.println("SUMA:");
        Complejo sum;
        sum = Complejo.suma(a,c );
        System.out.println(sum);  
        
        System.out.println("************************************************");
        
        System.out.println("RESTA:");
        Complejo res;
        res = Complejo.resta(a,c);
        System.out.println(res);  
        
        System.out.println("************************************************");
        
        System.out.println("MULTIPLICACION:");
        Complejo mul;
        mul = Complejo.multiplicacion(a,c);
        System.out.println(mul);  
        
        System.out.println("************************************************");
        
        System.out.println("DIVICION:");
        Complejo di;
        di = Complejo.divicion(a,c);
        System.out.println(di);  
        
        
        //________________________EJ:06-A)_________________________
        
        
        int i,j;
        Complejo v[] = new Complejo[10];
        for(i=0;i<10;i++){
           v[i] = new Complejo(Math.random()*100,Math.random()*100);
        }
        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
               if(v[j].modulo() > v[i].modulo()){
                   Complejo aux = v[i];
                   v[i] = v[j];
                   v[j] = aux;
               }
            }
        
        }
        for(i=0;i<10;i++){
            System.out.println(v[i]);
        }
    }
    
}
