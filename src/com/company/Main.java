package com.company;

import java.util.StringTokenizer;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        comparacionCadenas();
    }

    public static void comparacionCadenas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String s1 = scanner.next();
        System.out.println("ingrese otra cadena: ");
        String s2 = scanner.next();
        // Muestro las cadenas para verificar lo que contienen
        System.out.println("s1 = ["+ s1 +"]");
        System.out.println("s2 = ["+ s2 +"]");

        System.out.println("== " +(s1 == s2 ? "Son iguales" : "Son distintas"));
        System.out.println(".equals " +(s1.equals(s2) ? "Son iguales" : "Son distintas"));
        /*
        Son distintas las cadenas con == por que apuntan a una direccion fisica de la memoria
        Son iguales la cadenas con .equals por que compara el contenido no la direccion de la memoria
        en el caso de que se generen los caracteres desde el programa apuntaran al mismo bloque de memoria por lo
        tanto los dos hacen referencia al mismo bloque y == dara igual
        */
    }

    public static void usoExpresionesRegularesParticionar(){
        String s = "Juan|Marcos|Carlos|Matias";
        String[] tokens = s.split("[|]");
        for(int i = 0 ; i < tokens.length ; i++){
            System.out.println(tokens[i]);
        }
    }

    public static void usoTokenize(){
        String s = "Juan|Marcos|Carlos|Matias";
        // esta clase es muy parecida al split de js
        StringTokenizer st = new StringTokenizer(s, "M");
        String tok;
        while(st.hasMoreTokens()){
            tok = st.nextToken();
            System.out.println(tok);
        }
    }

    public static void conversionCadenas(){
        // int
        int i = 43;
        // int a str
        String sInt = Integer.toString(i);
        // str a int
        int i2 = Integer.parseInt(sInt);
        // double
        double d = 24.2;
        //double a str
        String sDouble = Double.toString(d);
        // str a double
        double d2 = Double.parseDouble(sDouble);
    }

    public static void diferenciaEntreConcatenareStringBuffer(){
        // obtengo  el milisegundo actual;
        long hi = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();

        // cantidad de caracteres que concatenare

        int n= 100000000;
        char c;
        for(int i = 0; i < n; i++){
            // obtengo  caracteres entre A  Y Z
            c = (char) ( 'A' + i% ('Z'-'A'+1) );
            sb.append(c);
        }

        // obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println((hf-hi) + " milisegundos");

    }

    public static void manipulacionCadenasStringBuffer(){
        String x = new StringBuffer().append("Hola ")
                                            .append("Que tal?")
                                            .toString();
        System.out.println(x);
    }

    public static void concatenacionCadenas(){
        String x = "";
        x = x + "Hola ";
        x = x + "Que tal?";
        System.out.println(x);
    }

    public static void posicionSubstringCadena(){
        String s = "Un buen libro de Java, un buen material";
        int pos1 = s.indexOf("buen");
        int pos2 = s.lastIndexOf("buen");
        System.out.println(pos1);
        System.out.println(pos2);
    }

    public static void prefijosSufijos(){
        String s = "Un buen libro de Java";
        boolean b1 = s.startsWith("Un buen");
        boolean b2 = s.startsWith("A");
        boolean b3 = s.endsWith("Java");
        boolean b4 = s.endsWith("Chau");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }

    public static void OcurrenciaCadenas(){
        String s = "Esto Es Una Cadena de caracteres";
        int pos1 = s.indexOf('C');
        int pos2 = s.lastIndexOf('C');
        int pos3 = s.indexOf('x');
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }

    public  static void CrearSubcadenas(){
        String s = "Esto Es Una Cadena de caracteres";
        String s1 = s.substring(0,7);
        String s2 = s.substring(8,11);
        String s3 = s.substring(8);
    }
}
