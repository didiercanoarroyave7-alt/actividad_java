public class Revista extends Libro {

    private int numeroEdicion;

    public Revista(String isbn, String titulo, String autor, int numeroEdicion) {
        super(isbn, titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void prestar(String usuario) {
        if (Disponible()) {
            Cambiar_Disponible(false);
            System.out.println("Revista prestada a: " + usuario);
        } else {
            System.out.println("La revista no esta disponible");
        }
    }

    @Override
    public void devolver() {
        Cambiar_Disponible(true);
        System.out.println("La revista fue devuelta");
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso > 0 ? diasRetraso * 300 : 0;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Revista: " + Titulo());
        System.out.println(Disponible() ? "Disponible" : "Prestada");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Numero de edicion: " + numeroEdicion);
    }
}