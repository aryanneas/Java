package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        celciusParaFarenheint();   
        System.out.print(media());
        mediaSqrt();
    }    
    
    public static void celciusParaFarenheint() {
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Escreva o valor em Celcius: ");
        float entrada = Float.parseFloat(ent.next());
        
        float resultado = entrada * 1.8f + 32;
        
        System.out.print("O valor em Farenait: " + resultado);
    }
    public static float media() {
        Scanner ent = new Scanner(System.in);
        int entrada = 0;
        int soma = 0;
        
        for (int i = 0; i <= 3; i++) {
            System.out.print("Escreva " + (i + 1) + " valor: ");
            entrada = Integer.parseInt(ent.next());
            soma += entrada;
        }
        
        return (soma / 4);
    }
    public static void mediaSqrt() {
        float valorSqrt = (float) Math.pow(media(), (0.25));
        
        System.out.print("O valor da raiz quarta é:" + valorSqrt);
    }
}
