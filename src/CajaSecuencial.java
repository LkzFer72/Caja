public class CajaSecuencial {
    public static void main(String[] args) {
        double largo = 5.0;
        double ancho = 3.0;
        double alto = 2.0;

        double volumen = largo * ancho * alto;

        System.out.println(volumen);

        largo = 10;
        ancho = 4;
        alto = 3;

        volumen = largo * ancho * alto;

        System.out.println(volumen);
    }
}
