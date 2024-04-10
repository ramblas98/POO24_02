/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza
 */
public class Fecha {
    Scanner teclado = new Scanner(System.in);
    private int dia,mes,año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public Fecha(){
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + año + '}';
    }

    public void iniciar(){
        System.out.println("Dia:");
        this.dia = teclado.nextInt();
        System.out.println("Mes: ");
        this.mes = teclado.nextInt();
        System.out.println("Año: ");
        this.año = teclado.nextInt();
    }
    public void adelantar(int d){
        this.dia += d;
    }
    public void imprimir(){
        System.out.println("Fecha: " + this.dia + "/" + this.mes + "/" + this.año+ " ");
    }
    
    
    public static boolean valida(Fecha a){
      if(a.dia<=31){
          if(a.mes<=12){
              if(a.año>=1){
                return true;
              }
              else return false;
          }
          else return false;
        }
       return false;
    }
    
    public static boolean bisiesto(int a){
       if(a%400==0)return true;
       else if(a%4==0){
           if(a%100==0) return false;
           else return true;
       }
       else return false;
    }
    
    public void normalizar(Fecha a){
        while(Fecha.valida(a)== false){
            System.out.println("Ingresar una fecha valida:");
            a.iniciar();
        }
        dia = a.dia;
        mes = a.mes;
        año = a.año;
    }
}
