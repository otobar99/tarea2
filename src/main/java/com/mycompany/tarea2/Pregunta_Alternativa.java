package tarea2;

public class Pregunta_Alternativa extends Pregunta_VF{
    private String[] alternativas = new String[4];

    public Pregunta_Alternativa(String[] alternativas, int idEvaluacion, String enunciado, String nivelTaxonomico, int respuestaCorrecta, int puntaje, int respuestaUsuario) {
        super(idEvaluacion, enunciado, nivelTaxonomico, respuestaCorrecta, puntaje, respuestaUsuario);
        this.alternativas = alternativas;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }
}
