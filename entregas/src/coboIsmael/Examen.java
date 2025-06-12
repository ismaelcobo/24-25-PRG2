public package entregas.src.coboIsmael;

class Examen {
    private String titulo;
    private String asignatura;
    private String[] preguntas;

    public Examen(String titulo, String asignatura, String[] preguntas) {
        this.titulo = titulo;
        this.asignatura = asignatura;
        this.preguntas = preguntas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getPreguntas() {
        return preguntas;
    }
}
