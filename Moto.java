public class Moto extends Vehiculo{
    public Moto(String marca, int anio) {
        super(marca, anio);
    }

    @Override
    public void encender()
    {
        System.out.println("Presionando boton");
    }
}
