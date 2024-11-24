package com.devsenior.mary_george;

import java.util.ArrayList;
import java.util.Arrays;
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
                                        System.out.println("Hasta pronto , somos aereolina spaceJmary");
                                        break;

                                default:
                                        break;
                        }

                } while (option != 0);
                System.out.println("Gracias por viajar con nosotros");

        }

        // Menu principal
        public static void ShowMenu() {
                System.out.println(BLUE + "\n---------MENU PRINCIPAL------" + RESET);
                System.out.println("1. Mostrar planetas");
                System.out.println("2. Selecciona una nave y planeta como destino");
                System.out.println("0. salir");
                System.out.print(YELLOW + "por favor elige una opción:\n" + RESET);
        }

        // Metodo para mostrar los planetas disponibles
        public static void ShowPlanets() {
                System.out.println(BLUE + "----------PLANETAS DISPONIBLES-------: \n" + RESET);
                for (int i = 0; i < planet.size(); i++) {
                        System.out.println(planet.get(i));
                }
        }

        
        public static void ShowNaves() {
                System.out.println(CYAN + "\n------<NAVES DISPONIBLES>-------" + RESET);
                System.out.println("1. Transbordador espacial");
                System.out.println("2. Nave espacial Orion");
                System.out.println("3. Sonda espacial Cassini-Huygens");
                System.out.println("4. Telescopio espacial James Webb");
                System.out.println("5. Sonda espacial Voyager 1"); 
                System.out.println("6. Rover Curiosity");
                System.out.println("7. Estación Espacial Internacional");
                selectNave();
        }


        public static void selectNave() {
                System.out.print(GREEN + "Elija una nave para su viaje:" + RESET);
                int option = sc.nextInt();
                
                if (option < 1 || option > 7) {
                        System.err.print(RED + "Opción no válida" + RESET);
                        return;
                }
                
                System.out.println(BLUE + "Has elegido la nave número " + option + RESET);
                System.out.println(YELLOW + "Masa de la nave: " + MasaNave.get(option-1) + " toneladas" + RESET);
                double combustibleNecesario = calcularCombustible(option, MasaNave);
                System.out.printf(CYAN + "Combustible necesario: %.2f galones%n" + RESET, combustibleNecesario);
        }

        /*
         * Método para permitir al usuario elegir una planeta destino
         * y mostrar su distancia desde la tierra
         */
        public static void selectPlanet() {

                System.out.println(CYAN + "\n---<PLANETAS DISPONIBLES DE DESTINO>---" + RESET);
                System.out.println("1. Mercurio");
                System.out.println("2. Venus");
                System.out.println("3. Marte");
                System.out.println("4. Jupiter");
                System.out.println("5. Saturno");
                System.out.println("6. Urano");
                System.out.println("7. Neptuno");
                System.out.print(GREEN + "Elije un planeta para tu viaje:" + RESET);
                int option = sc.nextInt();
                ShowNaves();
                switch (option) {

                        case 1:
                                System.out.println(BLUE + "Has elegido el planeta Mercurio" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                               
                                break;
                        case 2:
                                System.out.println(BLUE + "Has elegido el planeta Venus" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                         
                                break;
                        case 3:
                                System.out.println(BLUE + "Has elegido el planeta Marte" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 4:
                                System.out.println(BLUE + "Has elegido el planeta Jupiter" + RESET);

                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 5:
                                System.out.println(BLUE + "Has elegido el planeta Saturno" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 6:
                                System.out.println(BLUE + "Has elegido el planeta Urano" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 7:
                                System.out.println(BLUE + "Has elegido el planeta Neptuno" + RESET);
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
        }

        // Metodo para calcular el tiempo de viaje
        public static void TravelTime(int posicion) {
                double hoursTime = Distance.get(posicion - 1) / travelSpeed;
                double days = hoursTime / 24.0;
                double hours = (hoursTime % 24);
                System.out.printf("El tiempo estimado para llegar es de %.2f dias y %.2f horas%n", days, hours);

        }

        public static double calcularCombustible(int planetaElegido, ArrayList<Double> MasaNave) {
            // Constantes físicas
            double velocidadEscape = 11.2;  // km/s (velocidad de escape de la Tierra)
            double velocidadExhausto = 4.5; // km/s (velocidad típica de escape de los gases)
            
            // Obtener distancia del planeta seleccionado
            double distancia = Distance.get(planetaElegido - 1);
            
            // Masa de la nave (en toneladas; // Por ejemplo, similar al Curiosity Rover
            
            // Cálculo usando la ecuación de Tsiolkovsky
            // M_combustible = M_nave * (e^(deltaV/V_exhausto) - 1)
            double deltaV = velocidadEscape * (1 + (distancia / 1e8)); // Ajuste por distancia
            double masaCombustible = MasaNave.get(planetaElegido - 1) * (Math.exp(deltaV/velocidadExhausto) - 1);
            
            // Convertir a galones (densidad aproximada del combustible de cohete)
            double densidadCombustible = 0.8; // g/cm³
            double galones = (masaCombustible * 1000000) / (densidadCombustible * 3785.41); // 3785.41 cm³/galón
            
            return galones;
        }

        public static void  calcularOxigeno() {

                



        }
                

        



}
