public package entregas.src.coboIsmael;

class Universidad {
    private String nombre;
    private ProfesorImpartidor profesorImpartidor;
    private ProfesorRecibidor profesorRecibidor;
    private String nombreAsignatura;
    private String codigoAsignatura;
    private int creditosAsignatura;
    private Examen examen;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void contratarProfesorImpartidor(String nombreCompleto) {
        profesorImpartidor = new ProfesorImpartidor(nombreCompleto);
    }

    public void contratarProfesorRecibidor(String nombreCompleto) {
        profesorRecibidor = new ProfesorRecibidor(nombreCompleto);
    }

    public void crearAsignatura(String nombre, String codigo, int creditos) {
        this.nombreAsignatura = nombre;
        this.codigoAsignatura = codigo;
        this.creditosAsignatura = creditos;
    }

    public void asignarAsignaturaAProfesor() {
        if (profesorImpartidor != null) {
            profesorImpartidor.asignarAsignatura(nombreAsignatura, codigoAsignatura, creditosAsignatura);
        }
    }

    public void crearExamen() {
        if (profesorImpartidor != null) {
            examen = profesorImpartidor.crearExamen();
        }
    }

    public void asignarVigilante() {
        if (profesorRecibidor != null && examen != null) {
            profesorRecibidor.vigilarExamen(examen);
        }
    }

    public void mostrarEscenario() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Profesor: " + profesorImpartidor.getNombre());
        System.out.println("Asignatura: " + nombreAsignatura + " - " + codigoAsignatura + " - " + creditosAsignatura + " créditos");
        System.out.println("Examen: " + examen.getTitulo());
        System.out.println("Vigilado por: " + profesorRecibidor.getNombre());
        String[] preguntas = examen.getPreguntas();
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": \"" + preguntas[i] + "\"");
        }
    }
}
