/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;

public class Nodo {
    private int dato;
    private Nodo sgte;
    
    public int GetDato(){
        return dato;
    }
    public Nodo GetSgte(){
        return sgte;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    
    public boolean ultimo(Nodo desde){
        if (desde.sgte == null) {
            return true;
        } else return   false;
    }   

    public Nodo buscarUltimo(Nodo desde) {
        Nodo aux = desde;
        Nodo an = null;
        while (aux!= null ) {
            an = aux;
            aux = aux.sgte;
        }
        return an;
    }
    public Nodo buscarSiguiente(Nodo desde, int x) {
        Nodo aux = desde;
        while (aux != null && aux.dato != x) {
            aux = aux.sgte;
        }
        return aux;
    }
    public boolean buscarSiguienteBol(Nodo desde, int x){
        Nodo aux = desde;
        while (aux != null && aux.dato != x) {
            aux = aux.sgte;
        }
        if(aux==null) return false;
        else return true;
    }
    public Nodo buscarNodoSiguiente(Nodo desde, Nodo x) {
        Nodo aux = desde;
        if(aux.sgte == x) return aux.sgte;
        else{
            while (aux != null && aux.sgte != x) {
                aux = aux.sgte;
            }
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
    public Nodo buscarNodoAnterior(Nodo desde, Nodo x) {
        Nodo aux = desde;
        if(aux.sgte == x) return aux;
        else{
            while (aux != null && aux.sgte != x) {
                aux = aux.sgte;
            }
        }  
        if(aux==null){
            System.out.print("noo");
            return desde;
        }else return aux;
    }
    
    public Nodo buscarUltimoMenor(Nodo desde, int x) {
        Nodo ant = null;
        Nodo i = desde;
        while (i != null && i.dato<=x) {
            ant = i;
            i = i.sgte;
        }
        return ant;
    }
    
    public Nodo buscarUltimoMayor(Nodo desde, int x ) {
        Nodo ant = null;
        Nodo i = desde;
        while ( i != null && i.dato<=x) {
            i = i.sgte;
        }
        return i;
    }
}
