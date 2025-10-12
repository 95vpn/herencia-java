public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, int anio, int puertas)
    {
        super(marca, anio);
        this.puertas = puertas;
    }

    public void mostrarCantidadDePuertas()
    {
        System.out.println("Puertas: " + puertas);
    }
}
