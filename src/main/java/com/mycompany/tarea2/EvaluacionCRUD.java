package tarea2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EvaluacionCRUD {
    public Evaluacion obtenerEvaluacionPorId(int idEvaluacion) {
        Evaluacion evaluacion = null;
        String sql = "SELECT id_evaluacion, cantidad_preguntas_vf, cantidad_preguntas_alternativas, " +
                     "tiempo, puntaje_total " +
                     "FROM evaluaciones WHERE id_evaluacion = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            if (conn != null) {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, idEvaluacion);
                rs = pstmt.executeQuery();

                if (rs.next()) { // Si se encuentra un resultado
                    evaluacion = new Evaluacion(
                        rs.getInt("id_evaluacion"),
                        rs.getInt("cantidad_preguntas_vf"),
                        rs.getInt("cantidad_preguntas_alternativas"),
                        rs.getInt("tiempo"),
                        rs.getInt("puntaje_total")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener evaluación por ID: " + e.getMessage());
        } finally {
            Conexion.cerrarConexion();
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos en obtenerEvaluacionPorId: " + e.getMessage());
            }
        }
        return evaluacion;
    }
    
    public Evaluacion[] obtenerEvaluaciones() {
        int contador = 0;
        String sql = "SELECT COUNT(*) FROM evaluaciones";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar();
            if (conn != null) {
                pstmt = conn.prepareStatement(sql);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    contador = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener cantidad de evaluaciones: " + e.getMessage());
        } finally {
            Conexion.cerrarConexion();
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos en cantidad de evaluaciones: " + e.getMessage());
            }
        }
        Evaluacion[] evaluaciones = new Evaluacion[contador];
        int i=0;
        sql = "SELECT id_evaluacion, cantidad_preguntas_vf, cantidad_preguntas_alternativas, " +
                     "tiempo, puntaje_total " +
                     "FROM evaluaciones";
        conn = null;
        pstmt = null;
        rs = null;

        try {
            conn = Conexion.conectar();
            if (conn != null) {
                pstmt = conn.prepareStatement(sql);
                rs = pstmt.executeQuery();

                while(rs.next()) { // Si se encuentra un resultado
                    evaluaciones[i++] = new Evaluacion(
                        rs.getInt("id_evaluacion"),
                        rs.getInt("cantidad_preguntas_vf"),
                        rs.getInt("cantidad_preguntas_alternativas"),
                        rs.getInt("tiempo"),
                        rs.getInt("puntaje_total")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener evaluaciones" + e.getMessage());
        } finally {
            Conexion.cerrarConexion();
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos en obtenerEvaluaciones: " + e.getMessage());
            }
        }
        return evaluaciones;
    }

    public Pregunta_VF[] obtenerPreguntasPorEvaluacion(int idEvaluacion, int n_preguntas) {
        Pregunta_VF[] preguntas = new Pregunta_VF[n_preguntas];
        String sql = "SELECT id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje " +
                     "FROM preguntasVF WHERE id_evaluacion = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql2 = "SELECT id_evaluacion, enunciado, nivel_taxonomico, " +
                     "opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje " +
                     "FROM preguntasAlternativas WHERE id_evaluacion = ?";
        PreparedStatement pstmt2 = null;
        ResultSet rs2 = null;
        int n = 0;

        try {
            conn = Conexion.conectar();
            if (conn != null) {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, idEvaluacion);
                rs = pstmt.executeQuery();

                while (rs.next()) {
                    preguntas[n++] = new Pregunta_VF(
                        rs.getInt("id_evaluacion"),
                        rs.getString("enunciado"),
                        rs.getString("nivel_taxonomico"),
                        rs.getInt("respuesta_correcta"),
                        rs.getInt("puntaje"),
                        -1
                    );
                }
                pstmt2 = conn.prepareStatement(sql2);
                pstmt2.setInt(1, idEvaluacion);
                rs2 = pstmt2.executeQuery();
                while (rs2.next()) {
                    String[] alternativasArray = new String[4];
                    alternativasArray[0] = rs2.getString("opcion_a");
                    alternativasArray[1] = rs2.getString("opcion_b");
                    alternativasArray[2] = rs2.getString("opcion_c");
                    alternativasArray[3] = rs2.getString("opcion_d");
                    preguntas[n++] = new Pregunta_Alternativa(
                        alternativasArray,
                        rs2.getInt("id_evaluacion"),
                        rs2.getString("enunciado"),
                        rs2.getString("nivel_taxonomico"),
                        rs2.getInt("respuesta_correcta"),
                        rs2.getInt("puntaje"),
                        -1
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener preguntas VF: " + e.getMessage());

        } finally {
            Conexion.cerrarConexion();
            try {
                if (rs2 != null) rs2.close();
                if (pstmt2 != null) pstmt2.close();
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos en obtenerPreguntasVFPorEvaluacion: " + e.getMessage());
            }
        }
        return preguntas;
    }
}
