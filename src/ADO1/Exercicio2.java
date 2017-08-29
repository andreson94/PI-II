package ADO1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       int n;
       boolean r,p;
       n = leiaNum();
       r = ehPar(n);
       p = ehPrimo(n);
    }
    static int leiaNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = input.nextInt();
        return n;
    } 
    static boolean ehPar(int n){
        boolean r = false;
        if(n%2==0)
            r=true;
        if(r)
            System.out.println("O numero digitado é Par");
        else
            System.out.println("O numero digitado é Impar");
        return r;
    }
    static boolean ehPrimo(int n){
        boolean p = false;
        int cont=0;
        for (int i=1;i<=n;i++){
            if (n%i ==0)
                cont++ ;
        }
            if(cont>2){
                p=true;
                System.out.println("o numero digitado não é primo");
            }else{
                System.out.println("o numero digitado é primo");
            }
        return p;
    }
}
