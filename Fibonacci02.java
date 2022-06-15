package estagio;


import java.util.Scanner;

public class Fibonacci02 {
    public static void main(String[] args) {
        int v = 0;
        int[] fib = new int[15];
        int[] c = new int[15];
        int A = 0;
        int B = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        v = sc.nextInt();
        System.out.println(v+" ");
        System.out.print("[");
        for(int i=0; i<fib.length; i++){
            B = A + B;
            A = B - A;
            fib[i] = A;
            System.out.print(fib[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        for(int i =0; i< fib.length; i++){
            if(fib[i] == v){
                System.out.print("O valor: "+v+" pertence a sequencia");
            }
        }
    }
}
