package ADO1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    /*5.Construa um programa Java que gere um número aleatório (utilizando a classe
    java.util.Random) e peça que o usuário adivinhe o número. O programa deverá ler dados
    do usuário até que ele acerte o número (exibindo uma mensagem de sucesso) ou ele digite
    “desistir” (onde uma mensagem de falha junto ao número que deveria ser adivinhado deverá ser exibida).
    Separe a lógica dos métodos de forma coesa.*/
    public static void main(String[] args) {
        int random;
        random = gerarNum();
        verificaNum(random);
    }
    static Scanner input = new Scanner(System.in);
    
    static int gerarNum(){
        Random aleatorio = new Random();
        int random;
        random = aleatorio.nextInt(100);
        System.out.println(random);
        return random;
    }
   
    static void verificaNum(int random){
        boolean numIgual = true;
        String d;
        int n;
        while(numIgual){
            System.out.print("Digite um numero: ");
            n=input.nextInt();
            
        if (random==n){
            System.out.println("PARABÉNS VOCÊ ACERTOU ");
            numIgual=false;
        }else{
            System.out.println("ERROU");
            System.out.println("Digite DESISTIR para sair");
            d = input.nextLine();
            if(d.equalsIgnoreCase("desistir")){
                System.out.println("Tentativas encerradas o numero correto era " + random);
                numIgual = false;
            }
        }
        }
    }
}
