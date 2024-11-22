package com.devsenior.mary_george;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class changelle_One {

        static double travelSpeed = 100000.0;
        static Scanner sc = new Scanner(System.in);
        static ArrayList<String> planet = new ArrayList<>(
                        Arrays.asList("Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"));

        static ArrayList<Double> Distance = new ArrayList<>(
                        Arrays.asList(91691000.0, 41400000.0, 78340000.0, 628730000.0, 1429000000.0,
                                        2723950000.0, 4347000000.0));

        public static void RetoOne() {

                System.out.println("""
                                ===========================================================================
                                ===========================================================================
                                        [[[ BIENVENIDO AL SIMULADOR DE VIAJES INTERPLANETARIOS ]]]
                                ===========================================================================
                                ===========================================================================
                                        """);

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
                                        System.out.println("Error");
                                        break;

                                default:
                                        break;
                        }

                } while (option != 0);
                System.out.println("Gracias por viajar con nosotros");

        }

        // Menu principal
        public static void ShowMenu() {
                System.out.println("\n--Menu Principal---");
                System.out.println("1. Mostrar planetas");
                System.out.println("2. Seleccionar un planeta interplanetario destino");
                System.out.println("0. salir");
                System.out.print("por favor elige una opción: ");
        }

        // Metodo para mostrar los planetas disponibles
        public static void ShowPlanets() {
                System.out.println("Planetas Disponibles: \n");
                for (int i = 0; i < planet.size(); i++) {
                        System.out.println(planet.get(i));
                }
        }

        /*
         * Método para permitir al usuario elegir una planeta destino
         * y mostrar su distancia desde la tierra
         */
        public static void selectPlanet() {
                System.out.println("\n--Planetas Destino---");
                System.out.println("1. Mercurio");
                System.out.println("2. Venus");
                System.out.println("3. Marte");
                System.out.println("4. Jupiter");
                System.out.println("5. Saturno");
                System.out.println("6. Urano");
                System.out.println("7. Neptuno");
                System.out.print("Elije una planeta para su viaje: ");
                int option = sc.nextInt();

                switch (option) {

                        case 1:
                                System.out.println("Has elgido el planeta Mercurio");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 2:
                                System.out.println("Has elgido el planeta Venus");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 3:
                                System.out.println("Has elgido el planeta Marte");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 4:
                                System.out.println("Has elgido el planeta Jupiter");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 5:
                                System.out.println("Has elgido el planeta Saturno");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 6:
                                System.out.println("Has elgido el planeta Urano");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        case 7:
                                System.out.println("Has elgido el planeta Neptuno");
                                ShowDatesPlanets(option);
                                TravelTime(option);
                                break;
                        default:
                                System.out.println("Opción no valida");
                                break;
                }
        }

        // Este metodo permitirá mostrar los datos de distancias.
        public static void ShowDatesPlanets(int posicion) {
                System.out.printf("El cual está a una distancia de %,f Millones de kilometros%n ", Distance.get(posicion - 1));
        }

        // Metodo para calcular el tiempo de viaje
        public static void TravelTime(int posicion) {
                double hoursTime = Distance.get(posicion - 1) / travelSpeed;
                double days = hoursTime / 24.0;
                double hours =  (hoursTime % 24);
                System.out.printf("El tiempo estimado para llegar es de %.2f dias y %.2f horas%n", days, hours);

                
        }

}
