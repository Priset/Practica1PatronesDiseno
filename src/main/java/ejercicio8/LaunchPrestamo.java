package ejercicio8;

public class LaunchPrestamo {
    public static void main(String[] args) {
        CuentaDeBanco.getInstance().principioDeMes(20000);
        System.out.println("************************");
        Cajero cajero = new Cajero();
        cajero.getPrestamoCreditos().prestamo(700);
        cajero.getPrestamoNegocios().prestamo(150);
        System.out.println("************************");
        Cajero cajero2 = new Cajero();
        cajero2.getPrestamoFinanciamiento().prestamo(9000);
        cajero2.getPrestamoVivienda().prestamo(999);
        System.out.println("************************");
        Cajero cajero3 = new Cajero();
        cajero3.getPrestamoNegocios().prestamo(1000);
        cajero3.getPrestamoCreditos().prestamo(5000);
        System.out.println("************************");
        Cajero cajero4 = new Cajero();
        cajero4.getPrestamoVivienda().prestamo(30000);

    }
}
