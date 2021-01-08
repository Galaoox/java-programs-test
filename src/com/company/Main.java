package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int num = scanner.nextInt();
        int resto = num % 2;
        String msg = resto == 0 ? "El valor ingresado es par" : "El valor ingresado es impar";
        System.out.println(num + " " + msg);


    }
}
