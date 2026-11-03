public class Biblioteca {

    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    // Recibir libro
    public void registrarLibro(Libro libro) {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libro registrado: " + libro.getTitulo());
    }

    // SOBRECARGA
    public void registrarLibro(Libro libro, String seccion) {
        System.out.println("Libro registrado: " + libro.getTitulo());
        System.out.println("Seccion: " + seccion);
    }
}
