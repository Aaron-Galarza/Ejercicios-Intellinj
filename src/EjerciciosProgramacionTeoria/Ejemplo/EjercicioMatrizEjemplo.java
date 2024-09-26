package EjerciciosProgramacionTeoria.Ejemplo;

public class EjercicioMatrizEjemplo {
    public static void main(String[] args) {


        int[][] Matriz1 = {{1, 2, 3, 4}, {4, 3, 2, 1}};

        //for para las columnas
        for (int i = 0; i < Matriz1.length; i++) {
            //for para las filas
            for (int j = 0; j < Matriz1[i].length; j++) {

                System.out.print(Matriz1[i][j]);

            }

            System.out.println();

        }
    }
}
