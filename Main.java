void main() {
    Coche miCoche = new Coche("Toyota", 2020, 4);

    miCoche.mostrarInfo();
    miCoche.mostrarCantidadDePuertas();

    Persona p1 = new Persona();
    p1.setNombre("Juan");
    p1.setEdad(25);

    System.out.println("Nombre: " + p1.getNombre());
    System.out.println("Edad: " + p1.getEdad());


    Persona p2 = new Persona();
    p2.setNombre("Perez");
    p2.setEdad(34);

    System.out.println("Nombre: " + p2.getNombre());
    System.out.println("Edad: " + p2.getEdad());

    Gato gato = new Gato();
    gato.hacerSonido();

    Vehiculo v1 =new Moto("Suzuki", 2000);
    Vehiculo V2 = new Coche("toyota", 2022, 3);

    v1.encender();
    V2.encender();
}