public class ejemplo {


        public static void main(String[] args) {

            try {

                int resultado = 10 / 2;

                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {

                System.out.println("Ocurrio un error");

            } finally {

                System.out.println("Finaliza la operación");

            }
        }

}
