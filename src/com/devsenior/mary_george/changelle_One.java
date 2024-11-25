package com.devsenior.mary_george;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class changelle_One {

        // Códigos de escape ANSI para colores
        public static final String RESET = "\033[0m"; // Reset
        public static final String RED = "\033[0;31m"; // RED
        public static final String GREEN = "\033[0;32m"; // GREEN
        public static final String YELLOW = "\033[0;33m"; // YELLOW
        public static final String BLUE = "\033[0;34m"; // BLUE
        public static final String CYAN = "\033[0;36m"; // CYAN

        static double travelSpeed = 100000.0;
        static Scanner sc = new Scanner(System.in);
        static ArrayList<String> planet = new ArrayList<>(
                        Arrays.asList("Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"));

        static ArrayList<Double> Distance = new ArrayList<>(
                        Arrays.asList(91691000.0, 41400000.0, 78340000.0, 628730000.0, 1429000000.0,
                                        2723950000.0, 4347000000.0));
        static String selectedNave;

        static ArrayList<Double> MasaNave = new ArrayList<>(Arrays.asList(2.040,26.5,5.7,6.2,0.722,0.899,420.0));

        static ArrayList<String> Naves = new ArrayList<>(
                        Arrays.asList("Transbordador espacial", "Nave espacial Orion", "Sonda espacial Cassini-Huygens",
                                        "Telescopio espacial James Webb", "Sonda espacial Voyager 1", "Rover Curiosity",
                                        "Estación Espacial Internacional"));

        public static void RetoOne() {

                System.out.println(GREEN + """
                                ===========================================================================
                                ===========================================================================
                                        [[[ BIENVENIDO AL SIMULADOR DE VIAJES INTERPLANETARIOS ]]]
                                ===========================================================================
                                ===========================================================================
                                        """ + RESET); 

                int option;
                do {
                        ShowMenu();
                        option = sc.nextInt();
                        switch (option) {
                                case 1:
                                        ShowPlanets();
                                        break;

                                case 2:
                                        selectPlanet();
                                        break;

                                case 0:
                                        System.out.println(BLUE + "Hasta pronto , somos aereolina spaceJmary" + RESET);
                                        break;

                                default:
                                        break;
                        }

                } while (option != 0);
                System.out.println(BLUE + "Gracias por viajar con nosotros" + RESET);

        }

        // Menu principal
        public static void ShowMenu() {
                System.out.println("\n" + BLUE + "╔════════════════════════════╗");
                System.out.println("║      MENU PRINCIPAL       ║");
                System.out.println("╚════════════════════════════╝" + RESET);
                System.out.println("\n1. Mostrar planetas");
                System.out.println("2. Selecciona una nave y planeta como destino");
                System.out.println("0. salir");
                System.out.println("\n" + YELLOW + "Por favor elige una opción:" + RESET);
        }

        // Metodo para mostrar los planetas disponibles
        public static void ShowPlanets() {
                System.out.println("\n" + BLUE + "╔════════════════════════════╗");
                System.out.println("║   PLANETAS DISPONIBLES    ║");
                System.out.println("╚════════════════════════════╝" + RESET);
                for (int i = 0; i < planet.size(); i++) {
                        System.out.println((i + 1) + ". " + planet.get(i));
                }
                System.out.println(); // Add empty line for spacing
        }

        
        public static void ShowNaves() {
                System.out.println("\n" + CYAN + "╔════════════════════════════╗");
                System.out.println("║    NAVES DISPONIBLES      ║");
                System.out.println("╚════════════════════════════╝" + RESET);
                System.out.println("\n1. Transbordador espacial");
                System.out.println("2. Nave espacial Orion");
                System.out.println("3. Sonda espacial Cassini-Huygens");
                System.out.println("4. Telescopio espacial James Webb");
                System.out.println("5. Sonda espacial Voyager 1"); 
                System.out.println("6. Rover Curiosity");
                System.out.println("7. Estación Espacial Internacional\n");
                selectNave();
        }


        public static void selectNave() {
                System.out.print(GREEN + "Elija una nave para su viaje: " + RESET);
                int option = sc.nextInt();
                System.out.println(); // Add empty line for spacing
                
                if (option < 1 || option > 7) {
                        System.out.println(RED + "⚠ Error: Opción no válida" + RESET);
                        return;
                }
                
                System.out.println(BLUE + "✓ Has elegido la nave número " + option + RESET);
                System.out.println();
                System.out.println(BLUE + " Masa de la nave: " + MasaNave.get(option-1) + " toneladas" + RESET);
                System.out.println(); // Add empty line for spacing
                Selectpasagger();
                double combustibleNecesario = calcularCombustible(option, MasaNave);
                System.out.println();
                System.out.printf(BLUE + "Combustible necesario: %.2f galones%n" + RESET, combustibleNecesario);
                System.out.println(); // Add empty line for spacing
        }

        public static void Selectpasagger(){
                System.out.print(YELLOW + "Ingrese el número de pasajeros a bordo: " + RESET);
                int pasajeros = sc.nextInt();
                System.out.println(); // Add empty line for spacing
                calcularOxigeno(pasajeros);
        }
        /*
         * Método para permitir al usuario elegir una planeta destino
         * y mostrar su distancia desde la tierra
         */
        public static void selectPlanet() {

                System.out.println("\n" + CYAN + "╔════════════════════════════╗");
                System.out.println("║      ELIGE TU DESTINO     ║");
                System.out.println("╚════════════════════════════╝" + RESET);
                System.out.println("\n1. Mercurio");
                System.out.println("2. Venus");
                System.out.println("3. Marte");
                System.out.println("4. Jupiter");
                System.out.println("5. Saturno");
                System.out.println("6. Urano");
                System.out.println("7. Neptuno\n");
                System.out.print(GREEN + "Elije un planeta para tu viaje: " + RESET);
                int option = sc.nextInt();
                ShowNaves();
                switch (option) {

                        case 1:
                                System.out.println(BLUE + "Has elegido el planeta Mercurio" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                               
                                break;
                        case 2:
                                System.out.println(BLUE + "Has elegido el planeta Venus" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                         
                                break;
                        case 3:
                                System.out.println(BLUE + "Has elegido el planeta Marte" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 4:
                                System.out.println(BLUE + "Has elegido el planeta Jupiter" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 5:
                                System.out.println(BLUE + "Has elegido el planeta Saturno" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 6:
                                System.out.println(BLUE + "Has elegido el planeta Urano" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 7:
                                System.out.println(BLUE + "Has elegido el planeta Neptuno" + RESET);
                                System.out.println();
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        default:
                                System.err.print(RED + "Opción no válida" + RESET);
                                break;
                }
        }

        // Este metodo permitirá mostrar los datos de distancias.
        public static void ShowDatesPlanets(int posicion) {
                System.out.printf("El cual está a una distancia de %,f Millones de kilometros%n ",
                                Distance.get(posicion - 1));
                                System.out.println();
        }

        // Metodo para calcular el tiempo de viaje
        public static void TravelTime(int posicion) {
                double hoursTime = Distance.get(posicion - 1) / travelSpeed;
                double days = hoursTime / 24.0;
                double hours = (hoursTime % 24);
                System.out.printf("El tiempo estimado para llegar es de %.2f dias y %.2f horas%n", days, hours);
                System.out.println();
                
                // Iniciar simulación de viaje
                simularViaje(posicion, days, hours);
                
        }

        private static void simularViaje(int planetaElegido, double dias, double horas) {
            double distanciaTotal = Distance.get(planetaElegido - 1);
            double tiempoTotalHoras = (dias * 24) + horas;
            
            System.out.println(CYAN + "╔════════════════════════════╗");
            System.out.println("║   INICIANDO SIMULACIÓN    ║");
            System.out.println("╚════════════════════════════╝" + RESET);
            System.out.println();
        
            for (int i = 0; i <= 10; i++) {
                int progreso = i * 10;
                
                // Barra de progreso
                System.out.print("\r" + BLUE + "Progreso del viaje: [");
                System.out.print("■".repeat(i));
                System.out.print("□".repeat(10 - i));
                System.out.print("] " + progreso + "%" + RESET);
                
                // Estado de la misión
                if (i % 2 == 0) {  // Cada 20%
                    System.out.println("\n");
                    System.out.println(YELLOW + "=== Estado Actual de la Misión ===" + RESET);
                    System.out.printf("Distancia recorrida: %,.0f kilómetros\n", (distanciaTotal * progreso / 100));
                    System.out.printf("Tiempo restante: %.1f horas\n", (tiempoTotalHoras * (100 - progreso) / 100));
                    System.out.println();
                    generarEventoAleatorio();
                }
            }
            
            System.out.println("\n" + GREEN + "¡Misión completada exitosamente!" + RESET);
            System.out.println();
        }
    
        private static void generarEventoAleatorio() {
                
                ArrayList<String> eventos = new ArrayList<>(List.of(
                    "⚠ ¡Alerta! Lluvia de meteoritos detectada. Activando escudos protectores...",
                    "⚠ ¡Precaución! Detectada inestabilidad en el sistema de propulsión. Iniciando ajustes...",
                    "⚠ ¡Advertencia! Niveles de radiación solar elevados. Activando protección adicional...",
                    "⚠ ¡Atención! Anomalía detectada en sistemas de navegación. Iniciando recalibración...",
                    "⚠ ¡Alerta! Perturbación gravitacional detectada. Corrigiendo trayectoria...",
                    "⚠ ¡Precaución! Variación en los niveles de presión. Estabilizando sistemas...",
                    "⚠ ¡Advertencia! Micrometeorito detectado en la trayectoria. Realizando maniobra evasiva..."));

                 int evento = (int)(Math.random() * eventos.size());
                 System.out.println("\n" + RED + eventos.get(evento) + RESET);
               
        }

        //UTILIZE LA ECUACION DE TSIOLKOVSKY porque es unica que me sirve

        public static double calcularCombustible(int planetaElegido, ArrayList<Double> MasaNave) {
            // Constantes físicas
            double velocidadEscape = 11.2;  // km/s (velocidad de escape de la Tierra)
            double velocidadExhausto = 4.5; // km/s (velocidad típica de escape de los gases)
            
            // Obtener distancia del planeta seleccionado
            double distancia = Distance.get(planetaElegido - 1);
        
            // M_combustible = M_nave * (e^(deltaV/V_exhausto) - 1)
            double deltaV = velocidadEscape * (1 + (distancia / 1e8)); // Ajuste por distancia

            double masaCombustible = MasaNave.get(planetaElegido - 1) * (Math.exp(deltaV/velocidadExhausto) - 1);
            
            // Convertir a galones (densidad aproximada del combustible de cohete)
            double densidadCombustible = 0.8; // g/cm³

            double galones = (masaCombustible * 1000000) / (densidadCombustible * 3785.41); // 3785.41 cm³/galón
            
            return galones;
        }

        public static void  calcularOxigeno(int pasajeros) {

                double oxigenoNecesario = 0.84 * pasajeros;
                System.out.printf(CYAN + "Oxigeno necesario: %.2f toneladas%n" + RESET, oxigenoNecesario);
                // 0.84 es la cantidad de oxigeno que consumen se estima que una persona consume en un día.
        }
                

        



}
