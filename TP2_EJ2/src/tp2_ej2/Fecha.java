/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;

/**
 *
 * @author magali.17.reina@gmail.com
 */
public class Fecha {
    private int dia, mes, anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dias) {
        this.dia = dias;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Métodos de instancia
    
    public void reiniciar(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public void adelantar(int d){
        if(this.valida() == true){
            int actual = this.mes;
            int s = this.dia + d;
            int r;
            if(d >= 0){
            
                if(s > dias(actual)) this.mes++;
               
                if(this.mes > 12){
                    this.anio = this.anio+1;
                    this.mes = 1;
                    if(this.dia == 31) this.dia = d;
                    else this.dia = this.dia + d - dias(actual);
                }else{
                    if(s == dias(actual)){
                        this.mes = this.mes+1;
                        this.dia = 1;
                    }else{
                        if(s > dias(actual)) r = s - dias(actual);
                        else r =  this.dia + d;
                        this.dia = r;
                    }
                }
            }
        }else System.out.println("Fecha no valida");
    }
    
    public void imprimir(){
        if(this.valida()==true) System.out.printf("%d/%d/%d\n", this.dia, this.mes, this.anio);
        else System.out.println("Fecha no valida");
    }
    
    public boolean valida(){
        return (this.dia >= 1 && this.dia <= dias(this.mes) && this.mes >= 1 && this.mes <= 12);
    }
    
    public void normalizar(){
        while(this.dia > dias(this.mes)){
            this.dia = this.dia - dias(this.mes);
            this.mes++;
            
            if(this.mes > 12){
                this.mes = 1;
                this.anio++;
            }
        }
        
        while(this.dia < 1){
            this.dia = this.dia - dias(this.mes - 1);
            this.mes--;
            
            if(this.mes < 1){
                this.mes = 12;
                this.anio--;
            }
        }
    }
    
    public int dias(int m){
        switch(m){
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4: 
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: if(bisiesto(this.anio) == true) return 29;
                    else return 28;
            default: return 0;
        }
    }
    
    public static boolean bisiesto(int a){
        if(a % 4 == 0){
            if(a % 400 == 0){
                return true;
            }else if(a % 100 == 0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
