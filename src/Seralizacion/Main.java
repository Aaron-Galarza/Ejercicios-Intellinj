package Seralizacion;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Persona personaSerializada = new Persona("Juan", 30, 1234);

        System.out.println("Ingrese la ruta donde desea guardar el archivo: ");
        String ruta = sc.nextLine();

        //Siempre para Serializar un objeto se necesita usar este try-catch
        //FileOutputStream deja el objeto en una referencia Stream
        try (FileOutputStream fileOut = new FileOutputStream(ruta + "/persona.ser");
             //ObjectOutputStream utiliza la referencia para luego serializarlo
        ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            //Se serializa el objeto
            out.writeObject(personaSerializada);
            System.out.println("Objeto serializado y guarado en " + ruta + "/persona.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }

        Persona personaDeserializada = null;

        //Siempre para Deserializar un objeto se necesita usar este try-catch
        //FileInputStream deja el objeto en una referencia Stream
        try(FileInputStream fileIn = new FileInputStream(ruta + "/persona.ser");
            //ObjectInputStream utiliza la referencia para luego Deserializarlo
            ObjectInputStream in = new ObjectInputStream(fileIn)) {

            //Se Deserializa el objeto y se printea con toString
            personaDeserializada = (Persona) in.readObject();
            System.out.println("Objeto deserializado: " + personaDeserializada);

        } catch (IOException | ClassNotFoundException i){
            i.printStackTrace();
        }


    }
}
