package tarea2;

public class Evaluacion {
    private int idEvaluacion;
    private int cantidadPreguntasVF;
    private int cantidadPreguntasAlternativas;
    private int tiempo;
    private int puntajeTotal;
    private int puntajeObtenido;

    public Evaluacion(int idEvaluacion, int cantidadPreguntasVF, int cantidadPreguntasAlternativas, int tiempo, int puntajeTotal) {
        this.idEvaluacion = idEvaluacion;
        this.cantidadPreguntasVF = cantidadPreguntasVF;
        this.cantidadPreguntasAlternativas = cantidadPreguntasAlternativas;
        this.tiempo = tiempo;
        this.puntajeTotal = puntajeTotal;
    }
    
    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public int getCantidadPreguntasVF() {
        return cantidadPreguntasVF;
    }

    public void setCantidadPreguntasVF(int cantidadPreguntasVF) {
        this.cantidadPreguntasVF = cantidadPreguntasVF;
    }

    public int getCantidadPreguntasAlternativas() {
        return cantidadPreguntasAlternativas;
    }

    public void setCantidadPreguntasAlternativas(int cantidadPreguntasAlternativas) {
        this.cantidadPreguntasAlternativas = cantidadPreguntasAlternativas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }
}
