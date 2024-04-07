/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author elcho
 */
public class TP2_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo c1 = new Complejo(3, 2);
        Complejo c2 = new Complejo(1, -1);
        
        System.out.println("Suma:" + Complejo.suma(c1, c2).re + "+" + Complejo.suma(c1, c2).im + "i");
        System.out.println("Resta: " + Complejo.resta(c1, c2).re + " + " + Complejo.resta(c1, c2).im + "i");
        System.out.println("Producto: " + Complejo.producto(c1, c2).re + " + " + Complejo.producto(c1, c2).im + "i");
        System.out.println("Division: " + Complejo.division(c1, c2).re + " + " + Complejo.division(c1, c2).im + "i");
    }
    
}
