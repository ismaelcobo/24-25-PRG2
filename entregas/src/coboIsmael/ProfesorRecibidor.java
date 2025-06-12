public package entregas.src.coboIsmael;

class ProfesorRecibidor {
    private String nombre;
    private Examen examenVigilado;

    public ProfesorRecibidor(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public void vigilarExamen(Examen examen) {
        this.examenVigilado = examen;
    }

    public String getNombre() {
        return nombre;
    }
}
