package ADO1;

import java.util.Scanner;

public class Exercicio1 {
/* 1.Escreva um programa que leia um número decimal do usuário. Após a leitura,
    verifique se o número é maior ou igual a 50,0. Caso verdadeiro, mostre mensagem
    “SUCESSO”. Caso falso, mostre a mensagem “ERRO”.Após a verificação, saia do programa
    emitindo a mensagem “FIM DO PROGRAMA”, independentemente do resultado. Construa o programa
    de forma que os métodos de leitura e verificação fiquem separados do método principal da aplicação.*/
    public static void main(String[] args) {
        float n;
        boolean r;
        
        n = leiaNum();
        r = maiorIgual(n);
      // System.out.println("Fim do Programa");
    }
    static float leiaNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float n = input.nextFloat();
        return n;
    }
    static boolean maiorIgual(float n){
        boolean r = false;
        if (n>=50.0f)
            r = true;
        if (r)
            System.out.println("Sucesso\nFim do Programa");
        else
            System.out.println("Erro\nFim do Programa");
        
        return r;
    }
    
}
