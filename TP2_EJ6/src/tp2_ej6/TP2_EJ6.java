/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej6;
import java.util.*;
public class TP2_EJ6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("A)");
        ListaEnlazada v = new ListaEnlazada();
        ListaEnlazada ordenada = new ListaEnlazada();
        
        int x,y, j, k, c, w;
        int i=0;
        for(i=0; i<10; i++){
           x= (int) (Math.random()*100);
           y= (int) (Math.random()*100);
           Complejo com = new Complejo(x,y);
           v.agregarUltimo(com);
        }
        System.out.println("Lista generada:");
        v.mostrar();
        System.out.println();
        System.out.println("Lista ordenada:");
        ordenada = ordenada.ascendente(v);
        ordenada.mostrar();
        
        
        System.out.println("B)");
        i=0;
        c=0;
        do{
            Fecha f = new Fecha();
            System.out.print("\nFecha nueva.\n");
            System.out.print("Ingrese el dia: ");
            i = leer.nextInt();
            System.out.print("\nIngrese el mes:");
            j = leer.nextInt();
            System.out.print("\nIngrese el anio:");
            k = leer.nextInt();
            f.reiniciar(i, j, k);
            f.normalizar();
            if(f.bisiesto(f.getAño())==true)c++;
            System.out.print("\nPara salir ingrese -1:");
            i = leer.nextInt();
        }while(i!=-1);
        System.out.print(c+" Fechas ingresadas tuvieron anios bisisestos.");
        
        System.out.println("C)");
        i=0; j=-1; k= 97; w=65;
        Estudiante[] lista = new Estudiante[30];
        String ape, nom;
        do{
            j++;
            Estudiante a = new Estudiante((char)(w+j)+" ", (char) (k+j)+" ", (int)Math.random()*100, (char)(w+j)+"@gmail.com");
            a.setNotaP1((int) (Math.random()*10));
            a.setNotaP2((int) (Math.random()*10));
           
            lista[j] = a;
            System.out.print("\nSe Cargo un nuevo estudiante, si desea agregar otro presione cualquier tecla. Para salir ingrese -1:");
            i = leer.nextInt();
        }while(i!=-1);
        System.out.println("Lista de estudiantes:");
        for(i=0; i<=j; i++){
            System.out.println((i+1)+")-. "+lista[i]);
        }
        System.out.println("Lista de estudiantes regulares:");
        for(i=0; i<=j; i++){
            if(lista[i].isRegular()){
                System.out.println((i+1)+")-. "+lista[i]);
            }    
        }
        
    }
    
    
}
