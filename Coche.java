public class Coche extends Vehiculo {

    private int puertas;

    //hereda marca y mostrarinfo
    //agega puertas
    public Coche(String marca, int anio, int puertas)
    {
        super(marca, anio);
        this.puertas = puertas;
    }

    public void mostrarCantidadDePuertas()
    {
        System.out.println("Puertas: " + puertas);
    }

    public void encender()
    {
        System.out.println("Girando la llave");
    }
}
