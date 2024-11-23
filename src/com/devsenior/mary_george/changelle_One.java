package com.devsenior.mary_george;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class changelle_One {

        // Códigos de escape ANSI para colores en la terminal
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

        static ArrayList<String> naves = new ArrayList<>(
                        Arrays.asList("Galileo", "Mariner 9", "New Horizons,", "AresOne"));
        static String selectedNave;

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
                                        selectNave();
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
                System.out.println(BLUE + "---------- NAVES DISPONIBLES -------: \n" + RESET);
                for (int i = 0; i < naves.size(); i++) {
                        System.out.println(naves.size());
                }

        }

        // Metodo select nave and ShowDataNave fueron separados por partes e ingresados
        // en el
        // swicht principal

        public static void selectNave() {
                System.out.println(CYAN + "\n------<NAVES DISPONIBLES>-------" + RESET);
                for (int i = 0; i < naves.size(); i++) {
                        System.out.println((i + 1) + ". " + naves.get(i));
                }
                System.out.print("Elije una nave para su viaje: ");
                int option = sc.nextInt();
        }

        public static void ShowDataNave(int option) {

                if (option >= 1 && option <= naves.size()) {
                        selectedNave = naves.get(option - 1);
                        System.out.println(YELLOW + "Has elgido la nave " + selectedNave + RESET);
                } else {
                        System.out.println(RED + "Opción no valida" + RESET);
                }

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

                switch (option) {

                        case 1:
                                System.out.println(BLUE + "Has elgido el planeta Mercurio" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 2:
                                System.out.println(BLUE + "Has elgido el planeta Venus" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 3:
                                System.out.println(BLUE + "Has elgido el planeta Marte" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 4:
                                System.out.println(BLUE + "Has elgido el planeta Jupiter" + RESET);

                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 5:
                                System.out.println(BLUE + "Has elgido el planeta Saturno" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 6:
                                System.out.println(BLUE + "Has elgido el planeta Urano" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        case 7:
                                System.out.println(BLUE + "Has elgido el planeta Neptuno" + RESET);
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                ShowDataNave(option);

                                break;
                        default:
                                System.err.print(RED + "Opción no valida" + RESET);
                                break;
                }
        }

        // Este metodo permitirá mostrar los datos de distancias.
        public static void ShowDatesPlanets(int posicion) {
                System.out.printf("El cual está a una distancia de %,f Millones de kilometros%n ",
                                Distance.get(posicion - 1));
        }

        // Metodo para pedir al usuario que ingrese los kilometros

        // Metodo para calcular el tiempo de viaje
        public static void TravelTime(int posicion) {
                double hoursTime = Distance.get(posicion - 1) / travelSpeed;
                double days = hoursTime / 24.0;
                double hours = (hoursTime % 24);
                System.out.printf("El tiempo estimado para llegar es de %.2f dias y %.2f horas%n", days, hours);

        }

}
