/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.iniciacion;

import java.util.ArrayList;

/**
 *
 * @author igallego
 */
public class RelacionCero {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int i = 0;
        boolean isPalindrome = true;
        while (i < word.length() / 2 && isPalindrome) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
            } else {
                i++;
            }
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(int number) {
        int invert = 0;
        boolean isPalindrome = true;
        while (number > 0) {
            int right = number % 10;
            invert = invert * 10 + right;
            number = (number - right) / 10;
        }
        if (number != invert) {

            isPalindrome = false;
        }
        return isPalindrome;

    }

    public static int getFactorial(int number) {
        int factorial = 1;
        while (number > 0) {
            factorial = number * factorial;
            number--;
        }
        return factorial;
    }

    public static int getMcd(int n1, int n2) {
        while (n2 != 0) {
            int mcd = n2;
            n2 = n1 % n2;
            n1 = mcd;
        }
        return n1;
    }

    public static boolean isArmstrong(int number) {
        int count = 0;
        int numbertwo = number;
        if (number == 0) {
            count = 1;
        } else {
            for (int i = number; i > 0; i /= 10) {
                count++;
            }
        }
        boolean isArmstrong = true;
        double right;
        double armstrong = 0;
        while (number > 0) {
            right = number % 10;
            number /= 10;
            armstrong += Math.pow(right, count);
        }
        if (numbertwo != armstrong) {

            isArmstrong = false;
        }
        return isArmstrong;
    }

    public static String reverse(String phrase) {
        int i = 0;
        String change = "";
        while (i < phrase.length()) {
            change += phrase.charAt(phrase.length() - i - 1);
            i++;
        }
        return change;
    }

    public static int[] rice(float number) {
        int [] paquetes = new int[3];
        paquetes[0] = (int) number / 5;
        System.out.println("Paquetes de 5kg: " + paquetes[0]);
        int rest = (int) number % 5;
        if (rest != 0) {
            paquetes[1]=rest/3;
            System.out.println("Paquetes de 3kg: " + paquetes[1]);
        }
        rest %= 3;
        if (rest != 0) {
            paquetes[2]=rest;
            System.out.println("Paquetes de 1kg: " + paquetes[2]);
        }
        
        return paquetes;
    }

}
