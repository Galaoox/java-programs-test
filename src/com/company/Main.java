package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre, edad y altura: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        double heigth = scanner.nextDouble();


        System.out.println("Nombre: " + name + " Edad: " + age + " Altura: " + heigth);
    }
}
