/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;

public class Fecha {

    private int dia, mes, año;

    public Fecha() {
        this.dia = this.mes = 1;
        this.año = 2024;
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

    public void reiniciar(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.año = a;
    }

    public void adelantar(int d) {
        this.dia += d;
        this.normalizar();
    }

    public void imprimir() {
        System.out.println("Dia: " + dia + ", Mes: " + mes + ", Anio: " + año);
    }

    public boolean valida() {
        if (año < 1) {
            return false;
        }
        if (mes < 1 || mes >= 13) {
            return false;
        }
        if (dia < 1 || dia > dias(mes)) {
            return false;
        }
        return true;
    }

    public void normalizar() {
        if (año < 1) {
            año = 1;
        }
        if (mes < 1) {
            mes = 1;
        } else if (mes > 12) {
            mes = 12;
        }
        if (dia < 1 || dia > dias(mes)) {
            dia %= dias(mes);
            if (mes == 12) {
                mes = 1;
                año++;
            } else {
                mes++;
            }
        }

    }

    public int dias(int mes) {
        int c = 0;
        switch (mes) {
            case 2:
                if (bisiesto(año)) {
                    c = 29;
                } else {
                    c = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                c = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                c = 30;
                break;
        }
        return c;
    }

    public boolean bisiesto(int anio) {
        if (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

}
