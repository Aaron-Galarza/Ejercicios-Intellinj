package EjerciciosProgramacionTeoria;
import java.util.Arrays;

public class Ejercicio {
    public static void main(String[] args) {
        int[] arr1 = {51, 30, 24, 23, 17};
        int[] arr2 = {60, 41, 22, 12, 9};
        int[] arr3 = new int[arr1.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        // Sumar elementos de los arreglos del menor al mayor, hasta el límite de la longitud de arr1
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        // Mostrar el resultado
        System.out.println("Suma de los elementos de los arreglos:");
        for (int s : arr3) {
            System.out.print(s + " ");
        }

    }
}