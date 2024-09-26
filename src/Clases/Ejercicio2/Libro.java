package Clases.Ejercicio2;

import java.util.Scanner;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    Scanner sc = new Scanner(System.in);

    public Libro (){
        this.setTitulo();
        this.setAutor();
        this.setISBN();
        this.setNumPaginas();
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN() {

        do {

            System.out.println("Ingrese el numero de identificacion del libro");
            int ISBN = sc.nextInt();
            if (ISBN <= 0) {
                System.out.println("Ingrese un numero superior a 0");

            }else {
                this.ISBN = ISBN;
                break;
            }


        }while (true);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo() {
        do {

            System.out.println("Ingrese el titulo del libro");
            String titulo = sc.nextLine();

            if (titulo.isEmpty()) {
                System.out.println("Ingrese un titulo por favor");

            }else {
                this.titulo = titulo;
                break;
            }


        }while (true);

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor() {

        do {

            System.out.println("Ingrese el autor del libro");
            String autor = sc.next();

            if (autor == null) {
                System.out.println("Ingrese el autor por favor");

            }else {
                this.autor = autor;
                break;
            }


        }while (true);

    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas() {

        do {

            System.out.println("Ingrese el numero de paginas del libro");
            int numPaginas = sc.nextInt();
            if (numPaginas <= 0) {
                System.out.println("Ingrese un numero superior a 0");

            }else {
                this.numPaginas = numPaginas;
                break;

            }


        }while (true);

    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }


}
