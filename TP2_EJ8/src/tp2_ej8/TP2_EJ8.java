/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej8;

/**
 *
 * @author Luis Mendoza
 */
public class TP2_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double comi;
        double t;
        Persona nico = new Persona("Nicolas", "Monteagudo", 45019904);
        Persona fran = new Persona("Franco", "Lugo", 44015609);
        Persona mario = new Persona("Mario", "Aveldaño", 45056065);
        Persona luis = new Persona("Luis","Mendoza",45551365);
        
        Vendedor Nico = new Vendedor();
        Vendedor Franco = new Vendedor(fran, "Colonia", 4401);
        Vendedor Mario = new Vendedor(mario, "Picha", 4505);
        Vendedor Luis = new Vendedor(luis,"Tartagal",4410);
        
        Nico.nuevoVendedor(nico, "oran", 4501);
        Nico.VentasMes(1, 7542.10);
        Nico.VentasMes(2, 1);
        Nico.VentasMes(3, 1);
        Nico.VentasMes(4, 1);
        Nico.VentasMes(5, 9832.76);
        Nico.VentasMes(6, 5623.12);
        Nico.VentasMes(7, 5521.34);
        Nico.VentasMes(8, 7390.66);
        Nico.VentasMes(9, 5876.22);
        Nico.VentasMes(10, 10234.76);
        Nico.VentasMes(11, 6912.47);
        t = Nico.totalAnual();
        System.out.print("Total anual conseguido por Nico: $"+t);
        System.out.println();
        Nico.VentasMes(12, 8376.87);
        System.out.println("Total anual conseguido por Nico: $"+Nico.totalAnual());
        
        System.out.println();
        Franco.VentasMes(1, 15289.32);
        Franco.VentasMes(2, 9754.21);
        Franco.VentasMes(3, 7501.67);
        Franco.VentasMes(4, 6189.54);
        Franco.VentasMes(5, 10000);
        Franco.VentasMes(6, 5600.78);
        Franco.VentasMes(7, 9376.45);
        Franco.VentasMes(8, 6923.87);
        Franco.VentasMes(9, 8056.32);
        Franco.VentasMes(10, 5743.98);
        Franco.VentasMes(11, 10010.56);
        Franco.VentasMes(12, 6698.21);
        System.out.println("Total anual conseguido por Franco: $"+Franco.totalAnual());
        System.out.println();
        
        Luis.VentasMes(1, 16289.32);
        Luis.VentasMes(2, 10754.21);
        Luis.VentasMes(3, 8501.67);
        Luis.VentasMes(4, 7189.54);
        Luis.VentasMes(5, 11000);
        Luis.VentasMes(6, 6600.78);
        Luis.VentasMes(7, 9976.45);
        Luis.VentasMes(8, 8923.87);
        Luis.VentasMes(9, 8056.32);
        Luis.VentasMes(10, 7743.98);
        Luis.VentasMes(11, 11010.56);
        Luis.VentasMes(12, 7698.21);
        System.out.println("Total anual conseguido por Luis: $"+Luis.totalAnual());
        System.out.println();
        
        
        Mario.VentasMes(1, 7301.45);
        Mario.VentasMes(2, 9912.34);
        Mario.VentasMes(3, 5245.67);
        Mario.VentasMes(4, 8876.32);
        Mario.VentasMes(5, 5998.76);
        Mario.VentasMes(6, 9789.12);
        Mario.VentasMes(7, 5123.45);
        Mario.VentasMes(8, 8590.76);
        Mario.VentasMes(9, 5432.89);
        Mario.VentasMes(10, 10234.56);
        Mario.VentasMes(11, 6790.23);
        Mario.VentasMes(12, 7289.01);
        System.out.println("Total anual conseguido por Mario: $"+Mario.totalAnual());
        System.out.println();
        Mario.VentasMes(0, 2);
        Nico.VentasMes(13, -50000);
        
        
        Mario.Comision();
        Nico.Comision();
        Franco.Comision();
        Luis.Comision();
        
        System.out.println();
        System.out.println("Comision de Nico (0.15%): $"+Nico.getComision());
        System.out.println("Comision de Mario (0.2%): $"+Mario.getComision());
        System.out.println("Comision de Franco: (0.3%): $"+Franco.getComision());
        System.out.println("Comision de Luis: (0.3%): $"+Luis.getComision());
        
        System.out.println();
        
        Luis.mostrar();
        Franco.mostrar(); 
        Nico.mostrar();
        Mario.mostrar(); 
    }
}
    

