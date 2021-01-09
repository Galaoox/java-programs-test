package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Defino las contantes
        // Las constantes van con publi static y final pero en este caso solo usare el final
         final int LUNES = 1;
         final int MARTES = 2;
         final int MIERCOLES = 3;
         final int JUEVES = 4;
         final int VIERNES = 5;
         final int SABADO = 6;
         final int DOMINGO = 7;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese  un dia de la semana (numero): ");
        int num = scanner.nextInt();
        String day;
        switch(num){
            case LUNES:
                day = "Lunes";
                break;
            case MARTES:
                day = "Martes";
                break;
            case MIERCOLES:
                day = "Miercoles";
                break;
            case JUEVES:
                day = "Jueves";
                break;
            case VIERNES:
                day = "Viernes";
                break;
            case SABADO:
                day = "Sabado";
                break;
            case DOMINGO:
                day = "Domingo";
                break;
            default:
                day = "Dia incorrecto... el valor debe ser entre el 1 y el 7.";
        }
        System.out.println(day);


    }
}
