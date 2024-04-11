/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;
import java.lang.Math;

public class ListaEnlazada {
    private Nodo primero;
    public ListaEnlazada(){
        primero = null;
    }
    public boolean estaVacia(){
        if(primero == null) return true; else return false;
    }
    public int cantidadNodos(){
        Nodo a = primero;
        int c=0;
        while(a!=null){
            c++;
            a=a.GetSgte();            
        }
        return c;
    }
    public void agregarPrimero(int x){
        primero = new Nodo();
        primero.setDato(x);
        primero.setSgte(null);
    }
    public void agregarUltimo(int x){
        if(!this.estaVacia()){
            Nodo ultimo = new Nodo();
            ultimo = ultimo.buscarUltimo(primero);
            // ó Nodo ultimo = primero.buscarUltimo(primero); si anda
            Nodo nuevo = new Nodo();
            nuevo.setSgte(null);
            nuevo.setDato(x);
            ultimo.setSgte(nuevo);
        }else this.agregarPrimero(x);
            
    }
    public void agregarMayor(int x){
        if(this.estaVacia()){
            this.agregarPrimero(x);
        }else{
            Nodo nuevo = new Nodo();
            nuevo.setDato(x);
            Nodo ultimo = new Nodo();
            ultimo = ultimo.buscarUltimo(primero);
            if(this.primero.GetDato()>=x){
                nuevo.setSgte(this.primero);
                this.primero = nuevo;
            }else if(ultimo.GetDato()<=x){
                nuevo.setSgte(null);
                ultimo.setSgte(nuevo);
            }else{
                Nodo ant = new Nodo();
                Nodo sgte = new Nodo();
                ant = ant.buscarUltimoMenor(primero, x);
                sgte = sgte.buscarUltimoMayor(primero, x);
                nuevo.setSgte(sgte);
                ant.setSgte(nuevo);
            }
        }
    }
    public void agregarMenor(int x){
        if(this.estaVacia()){
            this.agregarPrimero(x);
        }else{
            Nodo nuevo = new Nodo();
            nuevo.setDato(x);
            Nodo ultimo = new Nodo();
            ultimo = ultimo.buscarUltimo(primero);
            if(primero.GetDato()<=x){
                nuevo.setSgte(primero);
                primero = nuevo;
            }else if(ultimo.GetDato()>=x){
                nuevo.setSgte(null);
                ultimo.setSgte(nuevo);
            }else{
                Nodo ant = new Nodo();
                Nodo sgte = new Nodo();
                ant = ant.buscarUltimoMayor(primero, x);
                sgte = sgte.buscarUltimoMenor(primero, x);
                nuevo.setSgte(sgte);
                ant.setSgte(nuevo);
            }
        }
    }
    public int eliminar(int x){
        int c=0;
        if(!this.estaVacia()){
            Nodo eliminado = new Nodo();
            Nodo ultimo = new Nodo();
            Nodo ant = new Nodo(); Nodo sig = new Nodo();
            eliminado = eliminado.buscarSiguiente(primero, x);
            while(eliminado!=null){
                
                ultimo = ultimo.buscarUltimo(primero);
                if(primero.GetDato()==x){
                   
                    primero = primero.GetSgte();
                }else if(ultimo.GetDato()==x){
                    //no funciona el contador porque buscar anterior devuelve el nodo anterior a x y se desvinculan los datos repetidos en adelante
                    ant = ant.buscarAnterior(primero,x);
                    //System.out.print("SIIII :"+ant.GetDato()+" ");
                    ant.setSgte(null);
                }else{
                    
                    ant = ant.buscarAnterior(primero, x);
                    sig = sig.buscarSiguiente(sig, x);
                    ant.setSgte(sig);
                }
                c++;
                eliminado = eliminado.buscarSiguiente(primero, x);
            }
        }else System.out.println("Lista enlazada vacia");
        return c;
    }
    
    
    public void mostrar(){
        
        if(!this.estaVacia()){
            Nodo aux = primero;
            while(aux!=null){
                System.out.print("["+aux.GetDato()+"]");
                aux = aux.GetSgte();
            }
        }else System.out.println("Lista enlazada vacia");
    }
    public int cambiarValor(int dActual, int dNuevo){
        int c=0;
        if(!this.estaVacia()){
            Nodo modificado = new Nodo(); Nodo ant = new Nodo(); Nodo sgte = new Nodo();
            modificado = modificado.buscarSiguiente(primero, dActual);
            while(modificado!=null){
                c++;
                modificado.setDato(dNuevo);
                modificado = modificado.buscarSiguiente(primero, dActual);
            }
        }else System.out.println("Lista enlazada vacia");
        return c;
    }
    public ListaEnlazada ascendente(ListaEnlazada lista){
        ListaEnlazada ordAsc = new ListaEnlazada();
        if(!lista.estaVacia()){
            Nodo aux = lista.primero;
            while(aux!=null){
                ordAsc.agregarMayor(aux.GetDato());
                aux = aux.GetSgte();
            }
        }   
        return ordAsc;    
    }
    public ListaEnlazada descendente(ListaEnlazada lista){
        ListaEnlazada ordDesc = new ListaEnlazada();
        if(!lista.estaVacia()){
            Nodo aux = lista.primero;
            while(aux!=null){
                ordDesc.agregarMenor(aux.GetDato());
                aux = aux.GetSgte();
            }
        }   
        return ordDesc;    
    }
}
