package ejercicio4;

public class FactoryCurso {
    public static Curso make(String type){
        Curso curso;
        switch (type.toLowerCase()){
            case "matematicas":
                curso = new Matematicas();
                break;
            case "historia":
                curso = new Historia();
                break;
            case "lenguaje":
                curso = new Lenguaje();
                break;
            default:
                curso = new Ingles();
                break;
        }
        return curso;
    }
}
