/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author unisanta
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] order = new int[20];

        int acumPares = 0, acumImpar = 0, qt = 0;
        for(int i = 0; i < numeros.length; i++){
            
            System.out.println(numeros[i] = new Random().nextInt(60));
            if(numeros[i]%2 == 0) acumPares++;
            else acumImpar++;
            qt+=numeros[i];
        }
        
        System.out.println("Media:"+qt/20);
        System.out.println("Quantidade de pares:"+acumPares);
        System.out.println("Quantidade de impares:"+acumImpar);
        
        order = numeros.clone();
        Arrays.sort(order); 
        System.out.println(Arrays.toString(order));
    }
    
}
