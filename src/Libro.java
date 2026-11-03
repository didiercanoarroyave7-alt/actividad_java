public abstract class Libro implements GestionLibro {

    private String id_libro;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor) {
        this.id_libro = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }


    public String id_libro() {
        return id_libro;
    }

    public String Titulo() {
        return titulo;
    }

    public String Autor() {
        return autor;
    }

    public boolean Disponible() {
        return disponible;
    }

    // cambiar

    public void Cambiar_Disponible(boolean disponible) {
        this.disponible = disponible;
    }

    // SOBRECARGA
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("identificador: " + id_libro);
    }

    public void mostrarInformacion(boolean incluirAutor) {
        System.out.println("Titulo: " + titulo);

        if (incluirAutor) {
            System.out.println("Autor: " + autor);
        }
    }

    public abstract void mostrarTipo();
}