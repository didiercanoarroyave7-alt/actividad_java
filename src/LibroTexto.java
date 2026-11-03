public class LibroTexto extends Libro {

    private String materia;

    public LibroTexto(String id_libro, String titulo, String autor, String materia) {
        super(id_libro, titulo, autor);
        this.materia = materia;
    }

    @Override
    public void prestar(String usuario) {
        if (Disponible()) {
            Cambiar_Disponible(false);
            System.out.println("Libro de texto prestado a: " + usuario);
        } else {
            System.out.println("El libro de texto no esta disponible");
        }
    }

    @Override
    public void devolver() {
        Cambiar_Disponible(true);
        System.out.println("El libro de texto fue devuelto");
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso > 0 ? diasRetraso * 1000 : 0;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Libro de texto: " + Titulo());
        System.out.println(Disponible() ? "Disponible" : "Prestado");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Materia: " + materia);
    }
}