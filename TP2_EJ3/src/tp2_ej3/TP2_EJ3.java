/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej3;

public class TP2_EJ3 {

    
    public static void main(String[] args) {
        int s=0;
        ListaEnlazada a = new ListaEnlazada();
        System.out.print("lista con agregar mayor:");
        a.agregarMayor(25);
        a.agregarMayor(5);
        a.agregarMayor(7);
        a.agregarMayor(3);
        a.agregarMayor(-2);
        a.agregarMayor(24);
        a.agregarMayor(24);
        
        a.mostrar();
        
        System.out.print("\nlista con agregar mayor despues de eliminar 24:");
        s = a.eliminar(24);
        a.mostrar();
        System.out.print("\nSe eliminaron "+s+" nodos.");
        System.out.print("\nlista despues de reemplar el 7 por el 5:");
        a.cambiarValor(7, 5);
        a.mostrar();
        System.out.print("\nlista con agregar menor:");
        ListaEnlazada b = new ListaEnlazada();
        b.agregarMenor(27);
        b.agregarMenor(23);
        b.agregarMenor(24);
        b.agregarMenor(29);
        b.agregarMenor(395);
        b.agregarMenor(-2);
        b.mostrar();
        System.out.print("\nlista con agregar menor:");
        
    }
    
}
