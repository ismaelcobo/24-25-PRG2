public package entregas.src.coboIsmael;

class ProfesorImpartidor {
    private String nombre;
    private String nombreAsignatura;
    private String codigoAsignatura;
    private int creditosAsignatura;

    public ProfesorImpartidor(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public void asignarAsignatura(String nombre, String codigo, int creditos) {
        this.nombreAsignatura = nombre;
        this.codigoAsignatura = codigo;
        this.creditosAsignatura = creditos;
    }

    public Examen crearExamen() {
        if (nombreAsignatura != null) {
            String[] preguntas = {
                "Vista pública clases",
                "Vista pública de objetos",
                "Vista privada de clases"
            };
            return new Examen("Examen Final", nombreAsignatura, preguntas);
        } else {
            System.out.println("No se puede crear el examen, no hay asignatura asignada.");
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }
}
