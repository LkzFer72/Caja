public class CajaPOO3 {
    public double largo;
    public double ancho;
    public double alto;

    public double calcularVolumen(){
        return largo*ancho*alto;
    }
    public void setDimensiones(double largo, double alto, double ancho){
        this.largo = largo;
        this.ancho = ancho;
        this.alto= alto;

    }
    public CajaPOO3(double largo, double alto, double ancho){
        this.largo = largo;
        this.ancho = ancho;
        this.alto= alto;

    }

}
