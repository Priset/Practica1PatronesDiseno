package ejercicio10;

public class LaunchControl {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("55KLW","Sedan","Hyundai");
        Vehiculo vh2 = new Vehiculo("7897OPL","Full Version","Toyota");
        Vehiculo vh3 = new Vehiculo("121QWE","Low Version","Corolla");
        Vehiculo vh4 = new Vehiculo("7235CIA","Medium Version","Mitsubishi");
        Vehiculo vh5 = new Vehiculo("20133RTY","Vagoneta","Tesla");
        Vehiculo vh6 = new Vehiculo("9788TYY","Camioneta","Mercedez");

        System.out.println("**************************");
        vh1.registro();
        vh1.pagar();
        vh2.registro();
        vh2.pagar();
        vh3.registro();
        vh3.pagar();
        vh4.registro();
        vh4.pagar();
        vh5.registro();
        vh5.pagar();
        vh6.registro();
        vh6.pagar();
        System.out.println("**************************");
    }
}
