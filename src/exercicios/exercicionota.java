package exercicios;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class exercicionota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens
                int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota<0 | nota >10){
            System.out.println("Nota errada! Dei-me outra: ");
            nota = scan.nextInt();
            System.out.println("Obrigada por sua avaliação");
        }



    }

}
