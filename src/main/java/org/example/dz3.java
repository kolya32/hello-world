package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class dz3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        //  method4();
        //  method5();
        //  method6();
        //  method7();

    }


    public static void method1()
    {
    int[] array = {1, 2, 3, 4, 3};
    {
        for (int i = 0; i < array.length / 2; i++)
        {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
            System.out.println(array[i]);
        }
    }
}

    public static void method2()
    {
        System.out.println("\n");
        int[] number = {1, 2, 3, 4, 3};
        {
            if (number[0] == 3 || number[4] == 3)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }

    public static void method3()
    {
        System.out.println("\n");
        int[] array = {1, 2, 3, 4, 3};
        {
            for (int i = 0; i < array.length; i++)
                if (array[i] == 1 || array[i] == 3)
                {
                    System.out.println(array[i] + " - " + i);
                }
        }
    }


    }

