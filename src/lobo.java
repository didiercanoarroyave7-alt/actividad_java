public class lobo implements caminante {

    @Override
    public void caminar() {
        System.out.println("El lobo esta caminando");
    }

    @Override
    public void correr() {
        System.out.println("El lobo esta corriendo");
    }

    @Override
    public void comer() {
        System.out.println("El lobo esta comiendo");
    }

    @Override
    public void ladrar() {
        System.out.println("El lobo esta aullando");
    }
}