/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej4;

public class Nodo {
    private int dato;
    private Nodo sgte;

    public int GetDato(){
        return dato;
    }
    public Nodo GetSgte(){
        return sgte;
    }
    
    public boolean ultimo(Nodo desde){
        if (desde.sgte == null) {
            return true;
        } else return   false;
    }
        

    public Nodo buscarUltimo(Nodo desde) {
        Nodo a = null;
        Nodo aux = desde;
        while (aux != null) {
            a = aux;
            aux = aux.sgte;
        }
        return a;
    }

    public Nodo buscarSiguiente(Nodo desde, int x) {
        Nodo aux = desde;
        while (aux != null && aux.dato != x) {
            aux = aux.sgte;
        }
        return aux;
    }

    public Nodo buscarAnterior(Nodo desde, int x) {
        Nodo aux = desde;
        Nodo ant = null;
        while (aux != null && aux.dato != x) {
            ant = aux;
            aux = aux.sgte;
        }
        return ant;
    }
    public Nodo buscarUltimoMenor(int x) {
        Nodo ant = null;
        Nodo i = this;
        while (i.dato<=x && i != null) {
            ant = i;
            i = i.sgte;
        }
        return ant;
    }
    public Nodo buscarUltimoMayor(int x) {
        Nodo ant = null;
        Nodo i = this;
        while (i.dato<=x && i != null) {
            i = i.sgte;
        }
        return i;
    }
    
}

