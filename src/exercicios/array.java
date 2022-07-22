package exercicios;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class array {
    public static void main(String[] args) {
//        Dentro um array os elementos devem ser de números inteiros

        int[] vetor = {-5,-6,15,50,8,4};
        int count=0;

        while(count<(vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.print("\nO vetor é: ");
        for (int i =(vetor.length-1);i>=0;i--){
            System.out.print(vetor[i]+ " ");
        }

    }
}
