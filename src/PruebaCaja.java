public class PruebaCaja {
    public static void main(String[] args) {
        //instanciar objeto CajaPOO/
        CajaPOO miCaja = new CajaPOO();
        miCaja.largo = 5.0;
        miCaja.ancho = 3.0;
        miCaja.alto = 2.0;

        System.out.println("El volumen de la caja es: " + miCaja.calcularVolumen());

        //Caja 2/
        CajaPOO2 miCajax = new CajaPOO2();
        miCajax.largo = 10.0;
        miCajax.ancho = 4.0;
        miCajax.alto = 5.0;

        System.out.println("El volumen de la caja es: " + miCajax.calcularVolumen());

        System.out.println("El volumen de la caja 1 es "+miCaja.calcularVolumen());
        System.out.println("El volumen de la caja 2 es "+miCajax.calcularVolumen());

        CajaPOO2 miCajay = new CajaPOO2();
        miCajay.setDimensiones(5, 3, 2);
        System.out.println("El volumen de mi caja 3 es "+miCajay.calcularVolumen());

        CajaPOO2 miCajaz = new CajaPOO2();
        miCajaz.setDimensiones(10, 4, 5);
        System.out.println("El volumen de mi caja 4 es "+miCajaz.calcularVolumen());

        //Instanciar CajaPOO3/
        CajaPOO3 miCajaw = new CajaPOO3(5, 3, 2);
        System.out.println("El volumen de mi caja 5 es "+miCajaw.calcularVolumen());

        CajaPOO3 miCajav = new CajaPOO3(10, 4, 9);
        System.out.println("El volumen de la caja 6 es "+miCajav.calcularVolumen());
    }
}
