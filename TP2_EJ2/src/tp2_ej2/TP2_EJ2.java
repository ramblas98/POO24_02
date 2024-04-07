/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej2;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class TP2_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Fecha f = new Fecha();
            //boolean band;
            
            /*f.setAnio(1992);
            band = f.bisiesto(f.getAnio());
            if(band == true) System.out.println("Anio bisiesto");
            else System.out.println("Anio NO bisiesto");*/
            
            f.setDia(29);
            f.setMes(2);
            f.setAnio(2024);
            f.imprimir();
            f.adelantar(5);
            f.imprimir();
    }

}
