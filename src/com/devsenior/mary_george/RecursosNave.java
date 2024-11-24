package com.devsenior.mary_george;

import java.util.HashMap;
import java.util.Map;

public class RecursosNave {
    private double combustibleDisponible;
    private double oxigenoDisponible;
    private double consumoCombustiblePorKm;
    private double consumoOxigenoPorHora;
    private static final Map<String, Double> FACTORES_DIFICULTAD = new HashMap<>();

    static {
        FACTORES_DIFICULTAD.put("Mercurio", 1.3);
        FACTORES_DIFICULTAD.put("Venus", 1.2);
        FACTORES_DIFICULTAD.put("Marte", 1.1);
        FACTORES_DIFICULTAD.put("Júpiter", 1.5);
        FACTORES_DIFICULTAD.put("Saturno", 1.6);
        FACTORES_DIFICULTAD.put("Urano", 1.8);
        FACTORES_DIFICULTAD.put("Neptuno", 2.0);
    }

    public RecursosNave(String tipoNave) {
        switch (tipoNave) {
            case "Galileo":
                inicializarRecursos(1000, 200, 0.001, 0.5);
                break;
            case "Mariner 9":
                inicializarRecursos(1200, 250, 0.0008, 0.4);
                break;
            case "New Horizons":
                inicializarRecursos(1500, 300, 0.0006, 0.3);
                break;
            case "AresOne":
                inicializarRecursos(2000, 400, 0.0005, 0.25);
                break;
            case "Transit":
                inicializarRecursos(1800, 350, 0.0007, 0.35);
                break;
            case "Voyager 1":
                inicializarRecursos(2500, 500, 0.0004, 0.2);
                break;
            case "Voyager 2":
                inicializarRecursos(2500, 500, 0.0004, 0.2);
                break;
            default:
                inicializarRecursos(1000, 200, 0.001, 0.5);
        }
    }

    private void inicializarRecursos(double combustible, double oxigeno, double consumoComb, double consumoOx) {
        this.combustibleDisponible = combustible;
        this.oxigenoDisponible = oxigeno;
        this.consumoCombustiblePorKm = consumoComb;
        this.consumoOxigenoPorHora = consumoOx;
    }

    public double calcularCombustibleNecesario(String planeta, double distancia) {
        double factorDificultad = FACTORES_DIFICULTAD.getOrDefault(planeta, 1.0);
        return distancia * consumoCombustiblePorKm * factorDificultad;
    }

    public double calcularOxigenoNecesario(double tiempoViaje) {
        return tiempoViaje * consumoOxigenoPorHora;
    }

    public boolean verificarRecursosSuficientes(String planeta, double distancia, double tiempoViaje) {
        double combustibleNecesario = calcularCombustibleNecesario(planeta, distancia);
        double oxigenoNecesario = calcularOxigenoNecesario(tiempoViaje);
        
        return combustibleDisponible >= combustibleNecesario && oxigenoDisponible >= oxigenoNecesario;
    }

    public String obtenerEstadoRecursos(String planeta, double distancia, double tiempoViaje) {
        double combustibleNecesario = calcularCombustibleNecesario(planeta, distancia);
        double oxigenoNecesario = calcularOxigenoNecesario(tiempoViaje);
        
        StringBuilder estado = new StringBuilder();
        estado.append("\n=== Estado de Recursos ===\n");
        estado.append(String.format("Combustible disponible: %.2f unidades\n", combustibleDisponible));
        estado.append(String.format("Combustible necesario: %.2f unidades\n", combustibleNecesario));
        estado.append(String.format("Oxígeno disponible: %.2f unidades\n", oxigenoDisponible));
        estado.append(String.format("Oxígeno necesario: %.2f unidades\n", oxigenoNecesario));
        
        return estado.toString();
    }

    public void consumirRecursos(String planeta, double distancia, double tiempoViaje) {
        double combustibleNecesario = calcularCombustibleNecesario(planeta, distancia);
        double oxigenoNecesario = calcularOxigenoNecesario(tiempoViaje);
        
        this.combustibleDisponible -= combustibleNecesario;
        this.oxigenoDisponible -= oxigenoNecesario;
    }
}
