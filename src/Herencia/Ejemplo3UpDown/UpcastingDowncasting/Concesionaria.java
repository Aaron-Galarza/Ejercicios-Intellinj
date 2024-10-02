package Herencia.Ejemplo3UpDown.UpcastingDowncasting;
import Herencia.Ejemplo3UpDown.Auto;
import Herencia.Ejemplo3UpDown.Vehiculo;

import java.util.ArrayList;

public class Concesionaria {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(){
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo a){
        //instanceof, sirve para preguntar si algo es verdadero o falso
        if (a instanceof Auto) {
            System.out.println("Se agrego un auto");
        }
        this.vehiculos.add(a);
    }

    @Override
    public String toString() {
        return "Concesionaria{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
