package ejercicio2;

public class LaunchContrato {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargarHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");
        contrato.setNombre("");
        contrato.setApellido("");

        Contrato c1 = contrato.clone();
        Contrato c2 = contrato.clone();
        Contrato c3 = contrato.clone();
        Contrato c4 = contrato.clone();
        Contrato c5 = contrato.clone();
        Contrato c6 = contrato.clone();
        Contrato c7 = contrato.clone();
        Contrato c8 = contrato.clone();
        Contrato c9 = contrato.clone();
        Contrato c10 = contrato.clone();
        Contrato c11 = contrato.clone();
        Contrato c12 = contrato.clone();
        Contrato c13 = contrato.clone();
        Contrato c14 = contrato.clone();
        Contrato c15 = contrato.clone();

        c1.setNombre("Ernesto");
        c1.setApellido("Loayza");

        c2.setNombre("Paul");
        c2.setApellido("Landaeta");

        c3.setNombre("Alexis");
        c3.setApellido("Marechal");

        c4.setNombre("Jhoni");
        c4.setApellido("Paricollo");

        c5.setNombre("Ian");
        c5.setApellido("Terceros");

        c6.setNombre("Rene");
        c6.setApellido("Rengel");

        c7.setNombre("Jhonatan");
        c7.setApellido("Crespo");

        c8.setNombre("Victor");
        c8.setApellido("Perez");

        c9.setNombre("Franz");
        c9.setApellido("Mancilla");

        c10.setNombre("Pablo");
        c10.setApellido("Espinoza");

        c11.setNombre("Jhoni");
        c11.setApellido("Capra");

        c12.setNombre("Ariel");
        c12.setApellido("Urquidi");

        c13.setNombre("Franco");
        c13.setApellido("Palenque");

        c14.setNombre("Hugo");
        c14.setApellido("Taborga");

        c15.setNombre("Shopia");
        c15.setApellido("Reyes");

        c1.showContrato();
        c2.showContrato();
        c3.showContrato();
        c4.showContrato();
        c5.showContrato();
        c6.showContrato();
        c7.showContrato();
        c8.showContrato();
        c9.showContrato();
        c10.showContrato();
        c11.showContrato();
        c12.showContrato();
        c13.showContrato();
        c14.showContrato();
        c15.showContrato();
    }
}
