public class CajaEstructurada {
    public static double calcularVolumen(double largo, double ancho, double alto){
        return ancho * largo * alto;
    }

    public static void main(String[] args) {
        //Asignar valores de largo, ancho y alto/
        double largo = 5.0;
        double ancho = 3.0;
        double alto = 2.0;
        double volumen = calcularVolumen(largo,ancho,largo);
        System.out.println("El volumen de la caja es: " + volumen);
        //Asignar valores para calcular volumen de otra caja/
        largo = 10;
        ancho = 4;
        alto = 3;
        volumen = calcularVolumen(largo,ancho,alto);
        System.out.println("El volumen de la caja es: " + volumen);
    }
}
