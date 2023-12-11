package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreGimnasio = "Gimnasio el bicho SIUU";
        String nombreCleinte;
        String estadoCivilCliente;
        String documentoIdentidad;
        String objetivo;
        double valorMensualidad;
        double imc;
        double peso;
        double estatura;

        Scanner leerDato = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombreCleinte=leerDato.nextLine();

        System.out.println("Ingresa tu estado civil");
        estadoCivilCliente=leerDato.nextLine();

        System.out.println("Ingresa tu documento de identidad");
        documentoIdentidad=leerDato.nextLine();

        System.out.println("Ingresa el objetivo al ingresar al gimnasio");
        objetivo=leerDato.nextLine();

        System.out.println("Ingresa el valor de la mensualidad");
        valorMensualidad=leerDato.nextDouble();

        System.out.println("Ingresa tu indice de masa corporal");
        imc=leerDato.nextDouble();

        System.out.println("Ingresa tu peso");
        peso=leerDato.nextDouble();

        System.out.println("Ingresa su estatura");
        estatura=leerDato.nextDouble();

    }
}