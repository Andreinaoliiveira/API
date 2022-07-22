package exercicios;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class consoantes {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
                String[] consoantes=new String[6];
                int quantconst=0;

                int aux=0;

                do{
                    System.out.println("Digite sua letra: ");
                    String letra=scan.next();


                    if ( !(letra.equalsIgnoreCase("a") |
                            letra.equalsIgnoreCase("e") |
                            letra.equalsIgnoreCase("i") |
                            letra.equalsIgnoreCase("o") |
                            letra.equalsIgnoreCase("u")) ){
                        consoantes[aux] = letra;
                        quantconst++ ;
                    }
                    aux++;

                } while (aux < consoantes.length);
                    System.out.print("Consoantes são: ");

                for (String consoante : consoantes ){
                    if (consoante!=null)
                    System.out.print(consoante + " ");
                }
                 System.out.println("Quantidade de consoantes: " + quantconst);

    }

}
