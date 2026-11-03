public class muestralibro {

    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca("Biblioteca El Saber");


        Libro novela = new Novela(
                "001", "Cien años de soledad",
                "Gabriel Garcia Marquez", "Novela"
        );

        Libro texto = new LibroTexto(
                "002", "Matematicas",
                "Baldor", "Matematicas"
        );

        Libro revista = new Revista(
                "003", "National Geographic",
                "Varios autores", 15
        );

        System.out.println("SISTEMA DE BIBLIOTECA ");


        biblioteca.registrarLibro(novela);
        biblioteca.registrarLibro(texto, "Estudio");
        biblioteca.registrarLibro(revista, "Revistas");

        System.out.println("PRESTAMOS");

        novela.prestar("Carlos");
        texto.prestar("Maria");
        revista.prestar("Pedro");

        System.out.println(" INFORMACION ");

        novela.mostrarInformacion();
        novela.mostrarTipo();

        texto.mostrarInformacion(true);
        texto.mostrarTipo();

        revista.mostrarInformacion();
        revista.mostrarTipo();

        System.out.println("ESTADO DE LOS LIBROS ");

        novela.mostrarEstado();
        texto.mostrarEstado();
        revista.mostrarEstado();

        System.out.println("MULTAS ");

        System.out.println("Multa novela: $" + novela.calcularMulta(3));
        System.out.println("Multa libro texto: $" + texto.calcularMulta(3));
        System.out.println("Multa revista: $" + revista.calcularMulta(3));

        System.out.println(" DEVOLUCIONES ");

        novela.devolver();
        texto.devolver();
        revista.devolver();


    }
}