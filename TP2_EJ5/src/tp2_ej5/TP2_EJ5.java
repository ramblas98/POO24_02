/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej5;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza
 */
public class TP2_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c,cont=0,n,i;
        Estudiante a = new Estudiante("Mendoza","Luis","luismendoza4565@gmail.com",435,7,8,0,17,false);
        System.out.println("Ingresar cantidad de asistencias a sumar:");
        c= teclado.nextInt();
        a.incAsistencia(c);
        a.verificar();
        System.out.println(a);
        
        
        
        System.out.println("*****************************************************");
        //____________________________TP06-C)_______________________________________
        
        System.out.println("Ingresar cantidad de estudiantes:");
        n = teclado.nextInt();
        Estudiante b[] = new Estudiante[n];
        Estudiante aux = new Estudiante();
        for(i=0;i<n;i++){
           aux.carga();
           b[i]=aux;
        }
        for(i=0;i<n;i++){
            b[i].verificar();
            if(b[i].isRegular()==true){
                cont++;
            }
        }
        System.out.println("Cantidad de Estudiantes en instancia de Regular: " + cont);
    }
}
