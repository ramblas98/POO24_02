/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

public class TP2_EJ1 {

    public static void main(String[] args) {
        Complejo a, b;
        a = new Complejo(3,4);
        b = new Complejo(5,6);
        
        Complejo c;
        c = Complejo.suma(a,b);
        System.out.print("Suma: "+c+"\n");
        c = Complejo.resta(a,b);
        System.out.print("Resta: "+c+"\n");
        c = Complejo.producto(a, b);
        System.out.print("Producto: "+c+"\n");
        c = Complejo.division(a, b);
        System.out.print("Division: "+c+"\n");
    }
    
}
