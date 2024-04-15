/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej8;

/**
 *
 * @author Luis Mendoza
 */
public class Vendedor {
    private Persona dato;
    private int legajo;
    private String zonDeVenta;
    private double[] ventasMes = new double[13];
    private double comision;

    public Vendedor() {
        int i;
        for (i = 1; i <= 12; i++) {
            ventasMes[i] = 0;
        }
        this.comision = 0;
    }

    public Vendedor(Persona dato, String zonDeVenta, int legajo) {
        int i;
        this.dato = dato;
        this.zonDeVenta = zonDeVenta;
        this.legajo = legajo;
        for (i = 1; i <= 12; i++) {
            ventasMes[i] = 0;
        }
        this.comision = 0;
    }
    public void nuevoVendedor(Persona dato, String zonDeVenta, int legajo) {
        int i;
        this.dato = dato;
        this.zonDeVenta = zonDeVenta;
        this.legajo = legajo;
        for (i = 1; i <= 12; i++) {
            ventasMes[i] = 0;
        }
        this.comision = 0;
    }

    public Persona getDato() {
        return dato;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getZonDeVenta() {
        return zonDeVenta;
    }

    public double getComision() {
        return comision;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonDeVenta(String zonDeVenta) {
        this.zonDeVenta = zonDeVenta;
    }
    
    public void VentasMes(int mesActual, double vendido) {
        if(mesActual>=1 && mesActual<=12 && vendido>=0) this.ventasMes[mesActual] = vendido;
        else System.out.println("Mes o monto ingresado no valido.");
    }

    public double totalAnual() {
        int i = 1;
        boolean ban = false;
        double c = 0;
        while (i <= 12 && ban == false) {
            if (this.ventasMes[i] == 0) {
                ban = true;
                c = 0;
                System.out.println("\nFaltan cargar ventas mensuales.");
            } else {
                c += this.ventasMes[i];
                i++;
            }
        }
        return c;
    }

    public void Comision() {
        double com = 0;
        double t = totalAnual();
        if (t < 50000 && t >= 0) {
            com = 0;
        } else if (t >= 50000 && t < 75000) {
            com = 0.15*t;
        } else if (t >= 75000 && t <= 100000) {
            com = 0.2*t;
        } else {
            com = 0.3*t;
        }
        this.comision = com;
    }

    public void mostrar(){
        int i;
        System.out.println("Vendedor: "+dato);
        System.out.println("Legajo: "+legajo);
        System.out.println("Zona de venta: "+zonDeVenta);
        for (i = 1; i <= 12; i++) {
            System.out.println("Mes:"+i+" $"+ventasMes[i]);
        }
        //System.out.println("Total anual: $",this.TotalAnual());
        //System.out.println("Comision : $",this.Comision());
    }
}
