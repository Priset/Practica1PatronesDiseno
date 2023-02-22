package ejercicio8;


public class CuentaDeBanco {
    private int saldo;
    private static CuentaDeBanco instance = null;

    public CuentaDeBanco() {
        saldo = 0;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CuentaDeBanco();
        }
    }
    public static CuentaDeBanco getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void prestar(int monto){
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Prestamo realizado con exito.");
            System.out.println("El monto actualizado de la cuenta de Banco es de: " + saldo);
        } else {
            System.out.println("Prestamo fallido.");
            System.out.println("Saldo del banco insuficiente para el prestamo.");
        }
    }
    public void principioDeMes(int dinero) {
        System.out.println("El monto actual de la cuenta de Banco es de: "+saldo);
        saldo = saldo+dinero;
        System.out.println("El monto actualizado de la cuenta de Banco es de: "+saldo);
    }
}
