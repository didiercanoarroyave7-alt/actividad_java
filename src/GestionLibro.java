public interface GestionLibro {

    void prestar(String usuario);

    void devolver();

    double calcularMulta(int diasRetraso);

    void mostrarEstado();

}
