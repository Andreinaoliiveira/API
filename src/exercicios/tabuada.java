package exercicios;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você quer: ");
        int tabuada = scan.nextInt();

        System.out.println("Essa é a tabuada de: " + tabuada);

        for(int count=1; count <=10 ; count++){
            System.out.println(tabuada + "x" + count+"="+(tabuada*count));
        }




    }
}
