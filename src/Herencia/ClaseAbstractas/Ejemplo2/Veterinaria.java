package Herencia.ClaseAbstractas.Ejemplo2;

class Veterinaria {
    public static void main(String[] args) {
        Mascota gato = new Gato("Max");

        gato.tipoDeAnimal();
        gato.emitirSonido();

        System.out.println(gato.getNombre());

    }
}

abstract class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tipoDeAnimal();

    public abstract void emitirSonido();

    public String getNombre() {
        return nombre;
    }
}

class Gato extends Mascota {


    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un felino");
    }

    @Override
    public void emitirSonido() {
        System.out.println("miau, miau, miau");
    }
}