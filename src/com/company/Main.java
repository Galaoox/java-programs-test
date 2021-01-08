package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();
        if(age  >= 21){
            System.out.println("Ud.  es mayor de edad");
        } else {
            System.out.println("ud. es menor de edad");
        }


    }
}
