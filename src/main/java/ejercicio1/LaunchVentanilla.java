package ejercicio1;

public class LaunchVentanilla {
    public static void main(String[] args) {
        System.out.println("************************");
        Cajero cajero = new Cajero("8781KJ");
        cajero.registrarse();
        System.out.println("***********Estudiante 1*************");
        Estudiante est1 = new Estudiante("Juan", "789779");
        est1.registrarse();
        est1.pagoColegiatura(1500);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 2*************");
        Estudiante est2 = new Estudiante("Pedro", "50504");
        est2.registrarse();
        est2.pagoColegiatura(1700);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 3*************");
        Estudiante est3 = new Estudiante("Jhon", "1041710");
        est3.registrarse();
        est3.pagoColegiatura(1000);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 4*************");
        Estudiante est4 = new Estudiante("Nicolas", "50504");
        est4.registrarse();
        est4.pagoColegiatura(2700);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 5*************");
        Estudiante est5 = new Estudiante("Pablo", "117777");
        est5.registrarse();
        est5.pagoColegiatura(3300);
        VentanillaPago.getInstance().montoActual();
    }
}
