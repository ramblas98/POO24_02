/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej4;
import java.util.*;
public class TP2_EJ4 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaEnlazada a = new ListaEnlazada();
        
        int i=0, r;
        do{
            System.out.print("Ingrese parte real: ");
            i = leer.nextInt();
            System.out.print("\nIngrese parte imaginaria:");
            r = leer.nextInt();
            Complejo nuevo = new Complejo(i,r);
            a.agregarMayor(nuevo);
            System.out.println("Se ingreso el complejo :"+nuevo+"...");
            System.out.print("\nPara salir presione -1:");
            i = leer.nextInt();
        }while(i!=-1);
        System.out.println("Lista generada:");
        a.mostrar();
    }
    
}
