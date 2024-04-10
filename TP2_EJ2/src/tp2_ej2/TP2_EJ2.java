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
        int d,n,i,cont = 0;
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
        
        
        System.out.println("*********************[TP06-B]***************************");
        
        
        
        
        //___________________________TP06-B)____________________________________
        
        Fecha c = new Fecha();
        Fecha aux;
        System.out.println("Ingresar cantidad de fechas a cargar:");
        n = teclado.nextInt();
        for(i=0;i<n;i++){
            c.iniciar();
            aux = c;
            c.normalizar(aux);
            if(Fecha.bisiesto(c.getAño()) == true){
                cont ++;
            }
            System.out.println();
        }
        
        System.out.println("La cantidad de anio Bisiesto es: " + cont);
    }
}
    

