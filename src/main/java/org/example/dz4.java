package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
    }

    public static void method1() {
        System.out.print("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Считываем с клавиатуры число N
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++)  //Цикл сравнивания i c n, если i <= n то в С записываем сумму а и b далее в а перезаписываем что было в b, в b записываем сумму а и b
        {
            int с = a + b;
            a = b;
            b = с;
        }
        System.out.println("Result:" + b);
    }


    public static void method2() {
        System.out.println("\n");
        String[] array =
                {
                "Lorem ipsum",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                "Lorem"};
        String str = null;// Создадим переменную сылочного типа и запишем в неё null(то есть ничего) в неё будем записывать наше решение для вывода.
        int maxLength = 0; // Создадим переменную с целым числом и запишем 0( 0 - точка отсчёта по символам в каждом инжексе массива)
        for (int i = 0; i < array.length; i++)// Запускаем цикл проходим по всем индексам массива
        {
            if (array[i].length() > maxLength)// Если длина массива больше maxLength, то есть больше 0 то перезаписываем в maxLength число знаков из массива, и так по проходим по всему массиву
            {
                maxLength = array[i].length();
                str = array[i];// А в переменную str записываем содержание данного индекс.
            }
        }
        System.out.print("Result:" + str + "\n" + "Length: " + maxLength);

    }

    public static void method3() {
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = scanner.nextLine();//Считываем с клавиатуры
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
//           if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))
            System.out.println("Палиндром! " + s);
        else
            System.out.println("Не палиндром! " + s);
    }


    public static void method4() {
        System.out.println("\n");

        int[] arr = new int[]{51, 46, 12, 1, 8};// Наш массив

        System.out.println(Arrays.toString(arr));// Выводим массив в консоль

        for (int i = 0; i < arr.length / 2; i++) { // Цикл в котором мы делим наш массив на 2 и работаем по очереди с каждым индексом
            int temp = arr[i]; // создаём временную переменную и записываем значаение с индексом i из массива
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

//    public static void method5() {
//        System.out.println("\n");
//        final int n = 10; //количество элементов первого массива
//        int m = n / 2; //количество элементов второго массива (по сути количество нечетных индексов первого)
//        int[] a = new int[n];//создаем массивы
//        int[] b = new int[m];
//        //заполним первый массив
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0; i < n; i++) {
//            System.out.print("Введите " + i + " элемент массива: ");
//            a[i] = scanner.nextInt();
//        }
//        //Выведем первый массив, заодно сразу формируем второй
//        int j = 0; //начальный индекс второго массива
//        System.out.println("Первый массив:");
//        for(int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//            if (i % 2 != 0) { //если индекс нечетный
//                b[j] = a[i]; //помещаем его на текущую позицию второго массива
//                j++; //переводим указатель на следующую позицию
//            }
//        }
//        //Выведем второй массив
//        System.out.println("\nВторой массив:");
//        for (int i = 0; i < m; i++) System.out.print(b[i] + " ");
//
//        int n = 10;
//        int[] array = new int[n];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print("Введите " + i + " элемент массива: ");
//            array[i] = scanner.nextInt();
//        }
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//            int count = 0;
//            for (int i = 0; i < array.length; i++)
//            {
//                if (array[i] % 2 == 0)
//                {
//                    count = array[i];
////                    count++; // Почему итерация? ведь он в канут прибавляет 1
////                    System.out.println(array[i]);
//                }
//            }
//            int[] array2 = new int[count];
//            for (int i = 0; i <= array.length; i++)
//                System.out.println(array2[i]);
//
////            {
////                if (array[i] % 2 == 0)
////                {
////                    array2[j++] = array[i];
////                }
////                System.out.println(array2[j]);
//            }
        }






