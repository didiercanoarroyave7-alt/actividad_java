
public class    ArcadeChallenge {

    public static void main(String[] args) {


        //1: REGISTRAR LOS TRES JUGADORES


        String[] nombres = {"Laura", "Andres", "Camila"};

        int[] edades = {19, 22, 20};

        int[] puntajesAcumulados = {1500, 2200, 2200};

        boolean[] vip = {true, false, true};

        System.out.println("    INFORMACION DEL JUEGO   ");


        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Jugador: " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Puntaje acumulado: "
                    + puntajesAcumulados[i]);
            System.out.println("VIP: " + (vip[i] ? "Si" : "No"));

            System.out.println("----------------------------------");
        }



        // 2puntuacion por videojuego

        String[] juegos = {
                "Carrera extrema",
                "Invasores espaciales",
                "Batalla de robots"
        };

        // Cada fila es un jugador.
        // Cada columna es un videojuego.

        int[][] puntuaciones = {
                {500, 800, 200},
                {900, 700, 600},
                {400, 950, 850}
        };

        System.out.println();
        System.out.println("TABLA DE PUNTUACIONES");

        System.out.printf("%-12s %10s %10s %10s%n",
                "Jugador", "Carrera", "Invasores", "Robots");

        for (int i = 0; i < puntuaciones.length; i++) {

            System.out.printf("%-12s %10d %10d %10d%n",
                    nombres[i],
                    puntuaciones[i][0],
                    puntuaciones[i][1],
                    puntuaciones[i][2]);
        }

        // Consultar la puntuacion de Camila en Invasores.
        // Camila esta en la fila 2 e Invasores en la columna 1.

        System.out.println();
        System.out.println("Puntaje de Camila en Invasores: "
                + puntuaciones[2][1]);



        // 3:CAMPEONATO DE DOS DIAS


        // Dimensiones: dia, ronda, jugador.

        int[][][] campeonato = {
                {
                        {100, 200, 300},
                        {150, 250, 350}
                },
                {
                        {200, 300, 400},
                        {250, 350, 450}
                }
        };

        System.out.println();
        System.out.println("CAMPEONATO: DIA 1 ");

        for (int ronda = 0; ronda < 2; ronda++) {

            System.out.println("Ronda " + (ronda + 1));

            for (int jugador = 0; jugador < 3; jugador++) {

                System.out.println(nombres[jugador] + ": "
                        + campeonato[0][ronda][jugador]
                        + " puntos");
            }

            System.out.println();
        }

        // Consultar al tercer jugador en la segunda ronda
        // del primer dia.

        System.out.println("Consulta de la matriz: "
                + campeonato[0][1][2] + " puntos");

        // Sumar todas las rondas de Laura.

        int totalLaura = 0;

        for (int dia = 0; dia < 2; dia++) {

            for (int ronda = 0; ronda < 2; ronda++) {

                totalLaura += campeonato[dia][ronda][0];
            }
        }

        System.out.println("Total de Laura en el campeonato: "
                + totalLaura + " puntos");



        // 4:ver quien es el ganador


        int[] totales = new int[nombres.length];

        int mayorPuntaje = 0;

        System.out.println();
        System.out.println("RESULTADOS FINALES ");

        // Sumar las puntuaciones de los tres videojuegos.

        for (int i = 0; i < puntuaciones.length; i++) {

            for (int j = 0; j < puntuaciones[i].length; j++) {

                totales[i] += puntuaciones[i][j];
            }

            System.out.println(nombres[i] + ": "
                    + totales[i] + " puntos");

            // Buscar el puntaje mas alto.

            if (totales[i] > mayorPuntaje) {

                mayorPuntaje = totales[i];
            }
        }

        // Contar cuantos jugadores tienen el puntaje mayor.

        int cantidadGanadores = 0;

        for (int i = 0; i < totales.length; i++) {

            if (totales[i] == mayorPuntaje) {

                cantidadGanadores++;
            }
        }

        // Anunciar al ganador o a los jugadores empatados.

        if (cantidadGanadores > 1) {

            System.out.print("Hay un empate entre ");

        } else {

            System.out.print("El ganador es ");
        }

        int impresos = 0;

        for (int i = 0; i < totales.length; i++) {

            if (totales[i] == mayorPuntaje) {

                if (impresos > 0) {

                    System.out.print(" y ");
                }

                System.out.print(nombres[i]);

                impresos++;
            }
        }

        System.out.println(" con " + mayorPuntaje + " puntos.");


        // adicional: consulta de puntuaciones


        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println();
        System.out.println("CONSULTAR PUNTUACION ");

        // Mostrar los jugadores disponibles.
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }

        System.out.print("Seleccione un jugador (1-3): ");
        int jugador = entrada.nextInt();

        // Mostrar los videojuegos disponibles.
        System.out.println();
        System.out.println("1. Carrera extrema");
        System.out.println("2. Invasores espaciales");
        System.out.println("3. Batalla de robots");

        System.out.print("Seleccione un videojuego (1-3): ");
        int juego = entrada.nextInt();

        // Validar las opciones antes de consultar la matriz.
        if (jugador >= 1 && jugador <= nombres.length
                && juego >= 1 && juego <= juegos.length) {

            System.out.println();
            System.out.println("RESULTADO DE LA CONSULTA ");
            System.out.println("Jugador: " + nombres[jugador - 1]);
            System.out.println("Videojuego: " + juegos[juego - 1]);
            System.out.println("Puntuacion: "
                    + puntuaciones[jugador - 1][juego - 1]);

        } else {
            System.out.println("Error: seleccione un jugador y un "
                    + "videojuego entre 1 y 3.");
        }

        entrada.close();


    }



}
