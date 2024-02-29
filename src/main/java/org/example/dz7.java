package org.example;

import java.util.Arrays;

public class dz7 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
        method5();
//        method6();
//        method7();
    }

    public static void method1() {

        int[] array = {1, 2, 3, 4, 3, 11, 10, 67};
        boolean or = true;
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i - 1] > array[i]) {
                or = false;
                break;
            }
        }
        System.out.println(or);
    }

    public static void method2() {

        int[] array = {3, 1, 1, 1, 1, 3};
        int k = 0;

        for (int i = 1; i < array.length - 1; i++) {
            k += array[i];
        }
        System.out.println(k);
    }

    public static void method3() {

        int[] array = {1, 1, 1, 1, 1, -2, 6, 7, 8};
        int k = 0;
        for (int i = 0; i < array.length && array[i] > 0; i++) {
            k += array[i];
        }
        System.out.println(k);
    }

    public static void method4() {

        int[] array = {1, 1, 1, 1, 1, -2, 6, 7, 8};

        int leng = 0;
        int k = 2;

        for (int i = 0; i < array.length; i++) {
            leng++;
        }

        int[] newArr = new int[leng];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = 0;
        }
        for (int i = 0; i < newArr.length; i++) {

        }
        System.out.println(Arrays.toString(newArr));
    }


    public static void method5() {

        int[] array = {1, 1, 1, 1, 1};
        int k = 3, j = 33, leng = 0;
        for (int i = 0; i < array.length; i++) {
            leng++;
            if (i == k) {
                leng += 1;
            }
        }
        int[] newArr = new int[leng];
        
        for (int i = 0; i < k; i++) {
            newArr[i] = array[i];
            if (i == k){
                i = j;
            }
        }
        int i;
        for (i = k + 1; i <= array.length; i++) {
            newArr[i] = array[i - 1];

        }
        System.out.println(Arrays.toString(newArr));
    }

}




