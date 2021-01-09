package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese  un dia de la semana (numero): ");
        int num = scanner.nextInt();
        String day;
        switch(num){
            case 1:
                day = "Lunes";
                break;
            case 2:
                day = "Martes";
                break;
            case 3:
                day = "Miercoles";
                break;
            case 4:
                day = "Jueves";
                break;
            case 5:
                day = "Viernes";
                break;
            case 6:
                day = "Sabado";
                break;
            case 7:
                day = "Domingo";
                break;
            default:
                day = "Dia incorrecto... el valor debe ser entre el 1 y el 7.";
        }
        System.out.println(day);


    }
}
