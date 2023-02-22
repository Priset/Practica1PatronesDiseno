package ejercicio3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar();
        Mochila mochila = new Mochila();
        mochila.setTamano("Mediana");
        mochila.setNumeroBolsillos(10);
        kit.setMochila(mochila);

        Deportivo deportivo = new Deportivo();
        deportivo.setTalla("L");
        deportivo.setColor("Plomo");
        deportivo.setNumeroPrendas(3);
        kit.setDeportivo(deportivo);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Carta Anillado");
        cuaderno.setNumeroHojas(200);
        kit.setCuaderno(cuaderno);
        return kit;
    }
}
