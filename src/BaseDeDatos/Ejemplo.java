package BaseDeDatos;
import java.io.IOException;
import java.sql.*;

public class Ejemplo {
    public static void main(String[] args) {

        // URL de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/futbol2"; // Elimina el espacio después de ':'
        String usuario = "root";
        String pass = "159753Aarongalarza12";

        // Conexión a la base de datos
        try (Connection conexion = DriverManager.getConnection(url, usuario, pass);
             Statement statement = conexion.createStatement()) {

            // Consulta SQL
            String consulta = "SELECT * FROM equipo";

            // Ejecutar consulta
            ResultSet resultado = statement.executeQuery(consulta);

            // Procesar el resultado de la consulta
            while (resultado.next()) {
                // Recuperar los valores de las columnas
                int idEquipo = resultado.getInt("ID_Equipo");
                int idDirecTecnico = resultado.getInt("ID_Direc_Tecnico");
                int idCategoria = resultado.getInt("ID_Categoria");
                String nombre = resultado.getString("Nombre");

                // Mostrar los valores recuperados
                System.out.println("ID_Equipo: " + idEquipo);
                System.out.println("ID_Direc_Tecnico: " + idDirecTecnico);
                System.out.println("ID_Categoria: " + idCategoria);
                System.out.println("Nombre: " + nombre);
                System.out.println("-------------------------");
            }

            // Cerrar el ResultSet
            resultado.close();

        } catch (SQLException e) {
            // Manejo de errores de SQL
            e.printStackTrace();
        }
    }
}
