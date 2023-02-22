package ejercicio4;

public class LaunchCurso {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.setNombre("Arturo");
        est1.setCi("7842132");

        String curso = "matematicas";
        FactoryCurso.make(curso).inscribir(est1);

        Estudiante est2 = new Estudiante();
        est2.setNombre("Jose");
        est2.setCi("22222");

        String curso2 ="lenguaje";
        FactoryCurso.make(curso2).inscribir(est2);

        Estudiante est3 = new Estudiante();
        est3.setNombre("Maria Jose");
        est3.setCi("333333");

        String curso3 ="ingles";
        FactoryCurso.make(curso3).inscribir(est3);

        Estudiante est4 = new Estudiante();
        est4.setNombre("Natalia");
        est4.setCi("1414141");

        String curso4 ="historia";
        FactoryCurso.make(curso4).inscribir(est4);

        Estudiante est5 = new Estudiante();
        est5.setNombre("Marco");
        est5.setCi("20230");

        String curso5 ="matematicas";
        FactoryCurso.make(curso5).inscribir(est5);
    }
}
