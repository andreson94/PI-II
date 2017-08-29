package ADO1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /*7.	Elabore um programa que calcule a média geral de uma sala. Para isso,
        solicite ao usuário a quantidade de alunos e, em seguida, a média final de 
        cada um deles. Ao término, calcule a média da sala e a exiba ao usuário.*/
        int n;
        n=tamanhoVetor();
        int[] v = criaVetor(n);
       // notas = leiaNotas();
        mediaAlunos(v);
    }
    static Scanner input = new Scanner(System.in);
    static int leiaNotas(){
        int notas = input.nextInt();
        return notas;
    }
    static int tamanhoVetor(){
        System.out.print("Digite a quantidade de alunos: ");
        int n = input.nextInt();
        return n;
    }
    static int[] criaVetor(int n){
        int[] v = new int [n];
        return v;
    }
    static void mediaAlunos(int[] v){
        int soma=0,mediaSala= 0,cont=0;
        
        for(int i = 1;i <= v.length;i++){
            System.out.printf("Digite a nota do aluno %d: ",i);
            int notas=input.nextInt();
            soma += notas;
            cont++;
        }
        mediaSala = soma/cont;
        System.out.println("Média da sala: "+mediaSala);
    }
}
