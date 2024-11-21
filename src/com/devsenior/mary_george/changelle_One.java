package com.devsenior.mary_george;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class changelle_One {

        public static void RetoOne() {

                Scanner sc = new Scanner(System.in);

                ArrayList<String> planet = new ArrayList<>(
                                Arrays.asList("Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"));

                ArrayList<String> spaceships = new ArrayList<>(
                                Arrays.asList("exploradora", "Carga Pesada", "velocidad Maxima"));

                ArrayList<Double> Distance = new ArrayList<>(
                                Arrays.asList(91.0, 41.0, 78.0, 628.0, 1275.0, 2723.0, 4351.0));

                ArrayList<Double> speeds = new ArrayList<>(Arrays.asList(20000.0, 15000.0, 30000.0));

        }

        // Elecciones Menu
        public static void ShowMenu() {

                System.out.println("\n--Menu Principal---");
                System.out.println("1. Seleccionar un planeta destino");
                System.out.println("2. seleccionar una nave espacial");
                System.out.println("3. Iniciar la simulacioon del vuelo");
                System.out.println("4. mostrar planetas");
                System.out.println("5. salir");
                System.out.print("por favor elige una opción: ");

        }

        public static void selectNave(List<String> spaceships) {

                for (int i = 0; i < spaceships.size(); i++) {
                        System.out.println(spaceships.get(i));

                }
        }

        public static void selectPlanet(List<String> planet) {
                for (int i = 0; i < planet.size(); i++) {
                        System.out.println(planet.get(i));

                        // esta wea me funciona

                }
        }

        // TODO: PRACTICANDO GITHUB

        public static void calcularRecursos() {

        }

        // Metodos auxiliares
        public static void imprimirArreglosString(String[] arreglo) {

                // TODO: ESTE COMENTARIO DEBE APARECER

        }

        public static void lanzarEvento() {

        }

        public static void detenerNave() {

        }

}
