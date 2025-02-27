public class MainFactory {

    public static void main(String[] args) {

        Forma forma1 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma1.dibujar();

        Forma forma2 = FormaFactory.getForma(TipoForma.RECTANGULO);
        forma2.dibujar();

        Forma forma3 = FormaFactory.getForma(TipoForma.TRIANGULO);
        forma3.dibujar();
    }
}
