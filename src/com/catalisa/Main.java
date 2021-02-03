package com.catalisa;

public class Main {

    public static void main(String[] args) {

        IO entradaSaida = new IO();
        Celsius converte = new Celsius();

        System.out.println("Conversor de Temperatura Celsisu para Fahrenheit\nDigite uma temperatura em Graus Celsius (ºC): ");
        converte.celsius = entradaSaida.leitorDados().nextDouble();
        System.out.println(converte.converterFahrenheit());

        System.out.println("Conversor de Temperatura Celsisu para Reaumur \nDigite uma temperatura em Graus Celsius (ºC): ");
        converte.celsius = entradaSaida.leitorDados().nextDouble();
        System.out.println(converte.converterRankine());

        System.out.println("Conversor de Temperatura Celsisu para Rankine\nDigite uma temperatura em Graus Celsius (ºC): ");
        converte.celsius = entradaSaida.leitorDados().nextDouble();
        System.out.println(converte.converterReaumur());
    }
}
