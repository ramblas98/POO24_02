/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_eje8;

import java.util.Scanner;

/**
 *
 * @author mesue
 */
public class Vendedor {
     Scanner teclado= new Scanner(System.in); 
    // double[] ve1= new double [12];
    private PERDONA datoPersona;
    private int legajo;
    private String zonaDeVenta;
    private double ventasMensusales[];

    public Vendedor(PERDONA datoPersona, int legajo, String zonaDeVenta) {
        this.datoPersona = datoPersona;
        this.legajo = legajo;
        this.zonaDeVenta = zonaDeVenta;
        this.ventasMensusales =new double[12] ;
    }
      public Vendedor() {
          this.ventasMensusales =new double[12] ;
    }

    public PERDONA getDatoPersona() {
        return datoPersona;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getZonaDeVenta() {
        return zonaDeVenta;
    }

    public double[] getVentasMensusales() {
        return ventasMensusales;
    }

    public void setDatoPersona(PERDONA datoPersona) {
        this.datoPersona = datoPersona;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonaDeVenta(String zonaDeVenta) {
        this.zonaDeVenta = zonaDeVenta;
    }

    public void setVentasMensusales(double ven,int p) {
        this.ventasMensusales[p]=ven;
    }
      
      public double totalAnual(){
          double b=0;
          for(int i=0;i<12;i++){
              b+=this.ventasMensusales[i];
          }
          return b;
      }
      public double Comision(){
          double r=totalAnual();
          if(r>=500000&&r<75000){
              r=r*0.15;
          }
          if(r>=75000&&r<100000){
              r=r*0.20;
          }
          if(r>=100000){
              r=r*0.30;
          }
          return r;
      }

    @Override
    public String toString() {
        return "Vendedor{" + "datoPersona=" + datoPersona + ", legajo=" + legajo + ", zonaDeVenta=" + zonaDeVenta + ", ventasMensusales=" + totalAnual() + '}';
    }
    
    
}
