package ejercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class LaunchEmpresa {
    public static void main(String[] args) {
            Profix profix = new Profix("Soria Queton");
        List<Empleado> empleadosProfix = List.of(new Empleado("Soria","771123"),
                new Empleado("Queton", "22214"), new Empleado("Loayza", "00012K"));
        profix.setEmpleados(empleadosProfix);

        Medusa medusa = new Medusa("Jhoni Bravo");
        Empleado[] empleadosMedusa = { new Empleado("Mamani", "KKL85"),
                new Empleado("Reyes", "LL751") };
        medusa.setEmpleado(empleadosMedusa);

        Ares ares = new Ares("Kenny Simpson");
        Vector<Empleado> empleadosAres = new Vector<>();
        empleadosAres.add(new Empleado("Scooby", "OO8410"));
        empleadosAres.add(new Empleado("Jairo", "PPP00"));
        ares.setEmpleados(empleadosAres);

        Dradler dradler = new Dradler("Pablo Lozano");
        Stack<Empleado> empleadosDradler = new Stack<>();
        empleadosDradler.push(new Empleado("Espinoza", "KLJUJ710"));
        empleadosDradler.push(new Empleado("Lozano", "QQ42"));
        dradler.setEmpleados(empleadosDradler);

        HashMap<String, Empleado> listaFinal = new HashMap<>();
        Iterator iterator = profix.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = medusa.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = ares.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = dradler.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        listaFinal.get("00012K").showInfo();
        listaFinal.get("QQ42").showInfo();
        listaFinal.get("LL751").showInfo();
        listaFinal.get("PPP00").showInfo();
    }
}
