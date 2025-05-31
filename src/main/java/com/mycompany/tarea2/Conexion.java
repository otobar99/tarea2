
package tarea2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/tarea_2";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "asdf123";
    private static Connection conexion = null;
    
    public static Connection conectar() {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                System.out.println("Conexión a la base de datos establecida correctamente.");
            } catch (ClassNotFoundException e) {
                System.err.println("Error: Driver JDBC de MySQL no encontrado. Asegúrate de haberlo añadido a las librerías del proyecto.");
            } catch (SQLException e) {
                System.err.println("Error al conectar a la base de datos:");
                System.err.println("SQLState: " + e.getSQLState());
                System.err.println("Código de error: " + e.getErrorCode());
                System.err.println("Mensaje: " + e.getMessage());
            }
        }
        return conexion;
    }
    
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                conexion = null;
                System.out.println("Conexión a la base de datos cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión a la base de datos:");
            }
        }
    }
}
