package ADO1;

import java.util.Scanner;

public class Exercico4 {
    /*4.Elabore um programa que solicite 5 números do usuário utilizando alguma 
    forma de repetição (while, do...while ou for). Em seguida, calcule a média 
    aritmética do valor e exiba as seguintes mensagens de acordo com os critérios abaixo:
a.	Se a média for menor que 5, exibir “REPROVADO”
b.	Se a média for maior ou igual a 5 e menor que 9, exibir “APROVADO”
c.	Se a média for 9, exibir “PARABÉNS”
d.	Se a média for 10, exibir “MASTER OF THE UNIVERSE”*/
    public static void main(String[] args) {
        int media;
        media = leiaNum();
        mediaAritmetica(media);
    }
    static int leiaNum(){
        Scanner input = new Scanner(System.in);
        int n=0,soma=0,media;
        
        for(int i = 0;i<5;i++){
            System.out.print("Digite um numero: ");
            n=input.nextInt();
            soma+=n;
        }
        media = soma/5;
        return media;
    }
    static void mediaAritmetica(int media){
        if(media<5)
            System.out.println("REPROVADO");
        else if(media>=5 && media<9)
            System.out.println("APROVADO");
        else if(media==9)
            System.out.println("PARABÉNS");
        else 
            System.out.println("MASTER OF THE UNIVERSE");
                
    }
}
