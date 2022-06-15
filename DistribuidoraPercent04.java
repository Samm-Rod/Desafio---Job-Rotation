package estagio;

import java.text.DecimalFormat;

public class DistribuidoraPercent04 {
    public static void main(String[] args) {
        double[] states = new double[5];
        int soma = 0;
        double percent = 0;
        states[0] = 67836.43;
        states[1] = 36678.66;
        states[2] = 29229.88;
        states[3] = 28165.48;
        states[4] = 19849.53;
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("Total faturamento:  ");
        for(int i=0; i< states.length; i++){
            soma += states[i];
        }
        System.out.print("R$ "+soma);

        // 181757 - 100
        // states - x
        // (states * 100)/ 181757
        System.out.println();
        System.out.println("SP RJ MG ES ...");
        for(int i=0; i< states.length; i++){
            percent = (states[i] * 100)/181757;
            System.out.println(dc.format(percent)+"% ");
        }
    }
}
