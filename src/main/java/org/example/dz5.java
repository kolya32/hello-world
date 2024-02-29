package org.example;


import java.util.Arrays;


public class dz5 {

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
//        method6();
//        method7();
    }

    /**
     * 1. Дан массив целых чисел. Обнулить каждый 3й элемент в исходном массиве;
     */
    public static void method1() {
        int[] array = {38, 16, 20, 2, 4, 15, 35, 33, 21, 3, 31, 8, 40, 12, 27, 36, 38, 33, 34, 32};
        int k = 1;
        for (int i = 0; i < array.length; i++, k++) {
            if (k % 3 == 0)
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));


    }

    /**
     * 2. Дан массив целых чисел. Создать два дополнительных массива из элементовисходного массива: с четными и нечетными числами.
     * Т.е. в итоге получится три массива: исходный, массив четных чисел, массив нечетных чисел;
     */
    public static void method2() {
        System.out.println("\n");

        int[] array = {27, 6, 17, 1, 22, 19, 5, 8, 28, 7, 15, 3, 20, 39, 33, 36, 24, 31, 21};

        int even = 0;
        int not_even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                not_even++;
            }
        }
        int j = 0;
        int k = 0;

        int[] evenArr = new int[even];
        int[] notEvenArr = new int[not_even];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArr[j++] = array[i];
            } else {
                notEvenArr[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(notEvenArr));
    }

    /**
     * 3. Дан массив слов. Создать одну строку из всех элементов массива (т.е. предложение);
     */
    public static void method3() {
        System.out.println("\n");

        String[] array = new String[]{"Hello", "world", "this", "my", "first", "array", "text"};
        String tmp = "";
        for (int i = 0; i < array.length; i++) {
            tmp += array[i] + " ";
        }
        System.out.println(tmp);

    }

    /**
     * 4. Дан массив целых чисел. Вывести все элементы массива пока не встретится элемент -1;
     */
    public static void method4() {
        System.out.println("\n");
        int k = 0;

        int[] array = {38, 16, 20, 2, 4, 15, 35, 33, 21, 3, 31, -1, 40, 12, 27, 36, 38, 33, 34, 32};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1)
                break;
            System.out.println(array[i]);
        }
    }

    /**
     * Дан массив целых чисел. Посчитать кол-во положительных элементов.
     */

    public static void method5() {
        System.out.println("\n");

        int[] array = {5, 6, 8, 13, 20, 1, 11, 17, -5, 7, 19, 4, 3, -1, -9, 14, -7, 15, -8, 12};
        int positiv = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positiv++;

        }
        System.out.println(positiv);
    }

    /**
     * Дан массив целых чисел. Заменить элементы массива на противоположные.
     * Пример: [1, -5, 0, 3, -4]; решение: [-1, 5, 0, -3, 4].
     */
    public static void method6() {
        System.out.println("\n");

        int[] array = {1, -5, 0, 3, -4};

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[i] = array[i] * -1;
            }
        }
        System.out.println(Arrays.toString(array));

    }

//    public static void method7() {
//        System.out.println("\n");
//        int[] nums = {1, 2, 3};
//
//        int[] ans = new int[nums.length * 2];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[i] ;
//
//
//
//        }
//        System.out.println(Arrays.toString(ans));
//
//    }



    public static void method7() {
        System.out.println("\n");

        int[] nums = {1, 2, 3};
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i]  = nums[i];
            ans[i + nums.length] = nums[i];

        }

        System.out.println(Arrays.toString(ans));

    }

}






