package estagio;

import java.text.DecimalFormat;

public class Distribuidora03 {
    public static void main(String[] args) {
        double[] fat = new double[21];
        double menor = 0;
        double maior = 0;
        int media =0;
        int soma = 0;
        int num = 0;
        DecimalFormat dc = new DecimalFormat("#.##");
        fat[0] = 22174.1664;
        fat[1] = 24537.6698;
        fat[2] = 26139.6134;
        fat[3] = 26742.6612;
        fat[4] = 42889.2258;
        fat[5] = 46251.174;
        fat[6] = 11191.4722;
        fat[7] = 3847.4823;
        fat[8] = 373.7838;
        fat[9] = 2659.7563;
        fat[10] = 48924.2448; // Maior
        fat[11] = 18419.2614;
        fat[12] = 35240.1826;
        fat[13] = 43829.1667;
        fat[14] = 18235.6852;
        fat[15] = 4355.0662;
        fat[16] = 13327.1025;
        fat[17] = 25681.8318;
        fat[18] = 1718.1221;
        fat[19] = 13220.495;
        fat[20] = 8414.61 ; // Menor

        System.out.println(" ----------  CompanyX.Inc  --------------");
        System.out.print("Menor valor faturado em um dia no mes: R$ ");
        for(int i=0; i<fat.length; i++){
            menor = fat[0];
            if(fat[i] < menor){
                menor = fat[i];
            }
        }
        System.out.print(dc.format(menor)+" ");

        System.out.println();
        System.out.print("Maior valor faturado em um dia no mes: R$ ");
        for(int i=0; i<fat.length; i++){
            if(fat[i] > maior){
                maior = fat[i];
            }
        }
        System.out.println(dc.format(maior)+" ");

        for(int i=0; i< fat.length; i++){
            soma += fat[i];
            media = (soma/fat.length);
        }
        System.out.print("Soma mensal: R$ ");
        System.out.println(dc.format(soma)+" ");
        System.out.print("Media mensal: R$ ");
        System.out.println(media+" ");
        System.out.println("Os Dias que a media mensal foi superada pelo faturamento ");
        for(int i=0; i<fat.length; i++){
            if(fat[i] > media){
                System.out.print(i+" ");
                num++;
            }
        }
        System.out.println();
        System.out.print("[");
        System.out.print(num+"");
        System.out.print("] dias");
    }
}
