package ADO1;

import java.util.Scanner;

public class Exercicio3 {
/*3.Construa um programa que escreva por extenso um número digitado pelo usuário 
(ou seja, se o usuário digitar “9”, deverá ser exibido no console “NOVE”).
O programa deve escrever os números por extenso de 0 a 9 e, caso o número seja
negativo ou tenha mais de uma casa decimal (maior que 9), mostrar uma mensagem de erro.
O código que efetua a leitura e a validação dos valores e o código que obtém o valor
por extenso devem ser separados em métodos diferentes. */
    public static void main(String[] args) {
        int n;
        n = leiaNum();
        validaValor(n);
    }
    static int leiaNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número entre 0 a 9: ");
        int n =Integer.parseInt(input.nextLine());
        return n;
    }
    static void validaValor(int n){
        if (n<0||n>9)
            System.out.println("Número invalido");
        else{
            for(int i = 0;i<=n;i++){
                System.out.println(i);
            }
        }
    }
}
