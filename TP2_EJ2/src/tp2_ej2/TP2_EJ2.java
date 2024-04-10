/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej2;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza
 */
public class TP2_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d;
        boolean bisi;
        Fecha a = new Fecha();
        
        System.out.println("**************************************************");
        System.out.println("Reiniciar______________________________");
        a.iniciar();
        a.imprimir();
        
        
        //***********************************************************
        
        System.out.println("**************************************************");
        System.out.println("Adelantar:");
        System.out.println("Ingresar dia a incrementar:");
        d = teclado.nextInt();
        a.adelantar(d);
        a.imprimir();
        
        //***********************************************************
        
        System.out.println("**************************************************");
        System.out.println("Normalizar:");
        Fecha b = a;
        a.normalizar(b);
        a.imprimir();
        
        System.out.println("**************************************************");
        System.out.print("El anio es bisiesto:");
        bisi= Fecha.bisiesto(a.getAño());
        System.out.println(bisi);
    }
}
    

