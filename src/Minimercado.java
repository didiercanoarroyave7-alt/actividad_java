
import java.util.Scanner;

public class Minimercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] productos = {"Arroz", "Leche", "Pan", "Huevos", "Aceite"};
        int[] precios = {4000, 3500, 2000, 6000, 9000};
        int[] stock = {10, 8, 15, 5, 4};

        double total = 0;
        String seguir = "s";

        System.out.println("MINIMERCADO");


        while (seguir.equalsIgnoreCase("s")) {

            System.out.println("MENU LB");

            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + ". " + productos[i]
                        + " - $" + precios[i]
                        + " (Stock: " + stock[i] + ")");
            }

            System.out.print("Elige un producto (1-5): ");
            int opcion = sc.nextInt() - 1;


            if (opcion < 0 || opcion >= productos.length) {
                System.out.println("Producto no valido.");

            } else {

                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();


                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero.");


                } else if (cantidad > stock[opcion]) {
                    System.out.println("No hay suficiente "
                            + productos[opcion]
                            + ". Solo quedan " + stock[opcion]);

                } else {

                    stock[opcion] = stock[opcion] - cantidad;


                    total = total + (precios[opcion] * cantidad);

                    System.out.println("Agregaste " + cantidad
                            + " unidad(es) de " + productos[opcion]);

                    System.out.println("Total acumulado: $" + total);
                }
            }

            System.out.print("Quieres elegir otro producto? (s/n): ");
            seguir = sc.next();
        }

        // subtotal
        System.out.println("\nSubtotal: $" + total);


        if (total > 20000) {
            double descuento = total * 0.10;
            total = total - descuento;

            System.out.println("Descuento del 10%: $" + descuento);
            System.out.println("Total con descuento: $" + total);

        } else {
            System.out.println("No aplica descuento. La compra no supera $20000.");
        }


        if (total > 0) {

            System.out.print("Con cuanto pagas? $");
            double pago = sc.nextDouble();


            if (pago >= total) {
                double cambio = pago - total;

                System.out.println("Compra exitosa.");
                System.out.println("Tu cambio es: $" + cambio);

            } else if (pago >= 0) {
                double faltante = total - pago;

                System.out.println("Dinero insuficiente.");
                System.out.println("Te faltan: $" + faltante);

            } else {
                System.out.println("El pago no puede ser negativo.");
            }

        } else {
            System.out.println("No compraste nada. Vuelve pronto.");
        }

        sc.close();
    }
}
