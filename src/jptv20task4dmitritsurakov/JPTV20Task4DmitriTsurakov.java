/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task4dmitritsurakov;

import java.util.Arrays;
import java.util.Random;

public class JPTV20Task4DmitriTsurakov {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int counter = 0;
        
        //Заполнить массив четными числами
        while(counter < 10){
            int a = random.nextInt(100);
            if(a%2 == 1){
               numbers[counter] = a;
               counter++;               
    }  
}
        System.out.println("Массив = " + Arrays.toString(numbers));
        
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
    }
    }
        int min = max;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        
        
        int countofmax = 0;                        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                countofmax++;
            }
        }
        
        int countofmin = 0;                        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                countofmin++;
            }
        }
        
        int[] newnumbers = new int[numbers.length-(countofmin+countofmax)];
        Arrays.sort(numbers);
        System.arraycopy(numbers, countofmin, newnumbers, 0, newnumbers.length);
        float mid = 0;
        for (int i = 0; i < newnumbers.length; i++) {
            mid += newnumbers[i];
        }
        System.out.println("Среднее = " + mid / newnumbers.length);
        }
    }
        
    
    
