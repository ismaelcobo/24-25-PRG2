public package entregas.coboIsmael.reto001;

import java.util.Scanner;

public class Reto001 {
    public static void main(String[] args) {


        String[] notas = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};
        
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Ingrese la nota a trabajar: 1: Do, 2: Do#, 3: Re, 4: Re#, 5: Mi, ...");
        int notaBase = entradaUsuario.nextInt() - 1;
    }
}