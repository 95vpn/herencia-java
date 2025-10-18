public class Persona {
    private String nombre;
    private int edad;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad)
    {
        if (edad >= 0 && edad <=120)
        {
            this.edad = edad;
        }
    }
}
