package exercicios;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class média {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int numero;
        int aux=0;
        int soma = 0;

        /*Aqui uma auxiliar para servir de contador*/

        int maiornum = 0;

        do {
            System.out.println("Digite seu número: ");
            numero= scan.nextInt();
            soma = soma + numero;
            if (numero > maiornum) maiornum = numero;

            aux = aux + 1;

        } while(aux <5);
        /* O contador tem que ser menor do que 5, porque é o que foi pedido*/
        System.out.println("Seu maior número é: " + maiornum);
        System.out.println("A sua média deu: " + soma/5);

    }
}
