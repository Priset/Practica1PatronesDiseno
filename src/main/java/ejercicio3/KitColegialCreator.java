package ejercicio3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial();
        Mochila mochila = new Mochila();
        mochila.setTamano("Grande");
        mochila.setNumeroBolsillos(15);
        kit.setMochila(mochila);

        Libros libros = new Libros();
        libros.setTipo("Matematicas");
        libros.setAutor("Chungara");
        kit.setLibros(libros);

        Computadora computadora = new Computadora();
        computadora.setMarca("Asus");
        computadora.setOs("Windows");
        kit.setComputadora(computadora);
        return kit;
    }
}
