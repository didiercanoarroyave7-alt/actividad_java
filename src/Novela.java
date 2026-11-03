public class Novela extends Libro {

    private String genero;

    public Novela(String isbn, String titulo, String autor, String genero) {
        super(isbn, titulo, autor);
        this.genero = genero;
    }

    @Override
    public void prestar(String usuario) {
        if (Disponible()) {
            Cambiar_Disponible(false);
            System.out.println("La novela fue prestada a: " + usuario);
        } else {
            System.out.println("La novela no esta disponible");
        }
    }

    @Override
    public void devolver() {
        Cambiar_Disponible(true);
        System.out.println("La novela fue devuelta");
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso > 0 ? diasRetraso * 500 : 0;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Novela: " + Titulo());
        System.out.println(Disponible() ? "Disponible" : "Prestada");
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Genero: " + genero);
    }
}