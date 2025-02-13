public class PruebaCaja {
    public static void main(String[] args) {
        //instanciar objeto CajaPOO/
        CajaPOO miCaja = new CajaPOO();
        miCaja.largo = 5.0;
        miCaja.ancho = 3.0;
        miCaja.alto = 2.0;

        System.out.println("El volumen de la caja es: " + miCaja.calcularVolumen());
    }
}
