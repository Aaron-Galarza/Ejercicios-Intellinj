package Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaMetodos {
    public static void main(String[] args){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //metodo igual al forEach tradicional pero mas comprimido
        numeros.forEach(numero -> System.out.println(numero));

        //Estructuras condicionales basicas con lambda:

        //al menos uno
        boolean hayNumeroPares = numeros.stream().anyMatch(numero -> numero % 2 == 0);
        System.out.println("Hay al menos un numero par? " + hayNumeroPares);


        //todos
        boolean TodosNumeroPares = numeros.stream().allMatch(numero -> numero == 0);
        System.out.println("Todos los numeros son pares? " + TodosNumeroPares);


        //Manera comprimida de hacer un bucle for para printear cada uno de los elementos de un array
        List<String> numeroComoCadenas = numeros.stream().map(numero -> "Numero: " + numero).collect(Collectors.toList());
        numeroComoCadenas.forEach(System.out::println);

        //METODOS AJENOS A LA EXPRESION LAMBDA PERO UTILIZADOS CON ESTA

        //Collection.min()
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(8);

        int min = Collections.min(num);
        System.out.println("El numero minimo es: " + min);

        //Collecion.max()
        int max = Collections.max(num);
        System.out.println("El numero maximo es: " + max);

        //IntStram.sum() ----> solo funciona con tipos de datos primitivos
        int[] arrayNum = {1,2,3,4,5};
        Integer suma = IntStream.of(arrayNum).sum();

        //Collectors.joining()
        Stream<String> palabras = Stream.of("Hola", "Mundo", "Java");
        String resultado = palabras.collect(Collectors.joining(" "));
        System.out.println("Cadena concatenada: " + resultado);

    }
}
