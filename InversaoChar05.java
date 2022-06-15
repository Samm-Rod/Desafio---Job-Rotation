package estagio;

import java.util.Scanner;

public class InversaoChar05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite alguma palavra: ");
       String word = sc.next();
       String nw = "";
       for(int i = word.length() -1; i>=0; i--){
            nw = nw + Character.toString(word.charAt(i));
       }
        System.out.println(nw);
    }
}
