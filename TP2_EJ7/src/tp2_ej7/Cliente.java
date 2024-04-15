/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej7;

/**
 *
 * @author Luis Mendoza
 */
public class Cliente {
    private long cuenta;
    private Persona datos;

    public Cliente(long cuenta, Persona datos) {
        this.cuenta = cuenta;
        this.datos = datos;
    }
    public Cliente(){
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }

    public long getCuenta() {
        return cuenta;
    }

    public Persona getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuenta=" + cuenta + ", datos=" + datos + '}';
    }
    
    
}
