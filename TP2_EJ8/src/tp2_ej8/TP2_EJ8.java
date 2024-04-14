
package tp2_ej8;

public class TP2_EJ8 {

    public static void main(String[] args) {
        double comi;
        double t;
        Persona nico = new Persona("Nicolas", "Monteagudo", 45019904);
        Persona fran = new Persona("Franco", "Lugo", 44015609);
        Persona mario = new Persona("Mario", "Aveldaño", 45056065);
        
        Vendedor Nico = new Vendedor();
        Vendedor Franco = new Vendedor(fran, "Colonia", 4401);
        Vendedor Mario = new Vendedor(mario, "Picha", 4505);
        
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
        System.out.println();
        System.out.println("Comision de Nico : "+100*Nico.getComision()+"%");
        System.out.println("Comision de Mario: "+100*Mario.getComision()+"%");
        System.out.println("Comision de Franco: "+100*Franco.getComision()+"%");
    }

}
