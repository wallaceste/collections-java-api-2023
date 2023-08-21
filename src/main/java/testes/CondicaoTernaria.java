package main.java.testes;

import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        int valor1 = scan.nextInt();

        System.out.println("Digite o valor 2");
        int valor2 = scan.nextInt();

        String resultado = valor1 > valor2 ? "maior" : "menor"; //condição ternaria

        System.out.println("O valor 1 é " + resultado + " do que o valor 2.");
    }



}
