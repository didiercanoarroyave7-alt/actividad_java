public class muestraanimales {

    public static void main(String[] args) {

        // Crear objeto perro
        perro Miperro = new perro();

        Miperro.nombre = "lurbo";
        Miperro.edad = 3;

        // Crear objeto gato
        gato Migato = new gato();

        Migato.nombre = "michi";
        Migato.edad = 2;

        // Mostrar información del perro
        System.out.println("El nombre del perro es: " + Miperro.nombre);
        System.out.println("La edad de mi perro es: " + Miperro.edad);

        Miperro.cenar();
        Miperro.dormir();
        Miperro.ladrar();

        // Mostrar información del gato
        System.out.println("El nombre del gato es: " + Migato.nombre);
        System.out.println("La edad de mi gato es: " + Migato.edad);

        Migato.cenar();
        Migato.dormir();
        Migato.maullar();
    }
}