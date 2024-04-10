/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_eje2;

/**
 *
 * @author mesue
 */
public class Fecha {
    private int dia,mes,anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public void reiniciar(int d,int m,int a){
        this.dia=d;
        this.mes=m;
        this.anio=a;
    }
    public void adelantar(int d){
        this.dia+=d;
        if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
            this.mes+=1;
            this.dia-=31;
            if(this.mes>12){
                this.mes=1;
                this.anio+=1;
            }
        }
        if(this.mes==4||this.mes==6||this.mes==9||this.mes==11) {
            this.dia-=30;
            this.mes+=1;
            if(this.mes>12){
                this.mes=1;
                this.anio+=1;
            }
        }
    }
    public boolean Validar(){
        boolean b=true;
        while(b==true){
        if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
            if(this.dia<1||this.dia>31){
                b=false;
                return b;
            }
        }
        if(this.mes==4||this.mes==6||this.mes==9||this.mes==11){
            if(this.dia<1||this.dia>30){
                b=false;
                return b;
            }
        }
        if(this.anio<0){
            b=false;
            return b;
        }
        if(this.mes<1||this.mes>12){
            b=false;
            return b;
        }
        } 
        return b;
        
    }
    public void Normalizar(){
        if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
            this.mes+=1;
            this.dia-=31;
            if(this.mes>12){
                this.mes=1;
                this.anio+=1;
            }
        }
        if(this.mes==4||this.mes==6||this.mes==9||this.mes==11) {
            this.dia-=30;
            this.mes+=1;
            if(this.mes>12){
                this.mes=1;
                this.anio+=1;
            }
        }
    }
    public int dias(int m ){
        if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
            return 31;
        }
        if(this.mes==4||this.mes==6||this.mes==9||this.mes==11){
            return 30;
        }
    }
    public void Imprimir(){
        System.out.println("dias:"+this.dia);
        System.out.println("mes:"+this.mes);
        System.out.println("año:"+this.anio);
    }
    public boolean bisiesto(){
        boolean b;
        if(this.anio%4==0&&this.anio%100!=0){
            b=true;
        }
        return b;
    }
    
}

