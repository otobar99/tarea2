package tarea2;

public class Pregunta_VF {
    private int idEvaluacion;
    private String enunciado;
    private String nivelTaxonomico;
    private int respuestaCorrecta;
    private int puntaje;
    private int respuestaUsuario;

    public Pregunta_VF(int idEvaluacion, String enunciado, String nivelTaxonomico, int respuestaCorrecta, int puntaje, int respuestaUsuario) {
        this.idEvaluacion = idEvaluacion;
        this.enunciado = enunciado;
        this.nivelTaxonomico = nivelTaxonomico;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntaje = puntaje;
        this.respuestaUsuario = respuestaUsuario;
    }
    
    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getNivelTaxonomico() {
        return nivelTaxonomico;
    }

    public void setNivelTaxonomico(String nivelTaxonomico) {
        this.nivelTaxonomico = nivelTaxonomico;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getRespuestaUsuario() {
        return respuestaUsuario;
    }

    public void setRespuestaUsuario(int respuestaUsuario) {
        this.respuestaUsuario = respuestaUsuario;
    }
    
}
