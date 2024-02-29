package org.example;

import java.util.Arrays;

public class dz6 {
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
//        method4();
//        method5();
//        method6();
//        method7();
    }

    public static void method1() {

        int[] array = {3, 3, 4, 1, 4, 0, 5, 1, 2, 5};

        int p = 0;
        String[] strArr = new String[array.length];
        for (int j = 0; j < array.length; j++) {
            switch (array[j]) {
                case 0:
                    strArr[p++] = "ноль";
                    break;
                case 3:
                    strArr[p++] = "три";
                    break;
                case 5:
                    strArr[p++] = "пять";
                    break;
                case 2:
                    strArr[p++] = "два";
                    break;
                case 4:
                    strArr[p++] = "четыре";
                    break;
                case 1:
                    strArr[p++] = "один";
                    break;
            }
        }
        System.out.println(Arrays.toString(strArr));
    }

    public static void method2() {
        int[] array = {-1, 6, 3, -2, 7, -8, 8, -9, -6, 4, -3, -7, -5, 0, 2, 9, 10, -4, -10, 0};

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > k) {
                k = array[i];
            }
        }
        System.out.println(k);
    }

    public static void method3() {
        int[] array = {-1, 6, 3, 2, 7, -8, 8, 9, -6, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = (sum / array.length);
        for (int  j = 0; j < array.length; j++) {
            if (array[j] > sum)
                System.out.print(array[j]);
        }

    }

    public static void method4() {
        int[] array = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        int curr = 1;
        int max = 1;
        int index = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                curr++;// Текущий элемент равен предыдущему, увеличиваем длину последовательности
            } else {
                curr = 1;// Текущий элемент отличается от предыдущего, обновляем длину последовательности и индекс начала
                index = i;
            }
            if (curr > max) { // Обновляем максимальную длину и индекс самой длинной последовательности
                max = curr;
                maxIndex = index;

            }
        }
        System.out.println("Результат: " + max + " чисел, c " + maxIndex + " индекса.");
    }


    public static void method5() {
        String sent = "Escape from krakov!";

        String[] words = sent.split("\\s+");
        int k = 0;
        String maxWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > k) {
                k = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println("Самое длинное слово: " + maxWord + ", в нём находится: " + k + " слов.");
    }
}



