package org.example;

public class Dz2 {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();

    }

    public static void method1()
    {
        int a = 1;
        while (a < 100)
            System.out.print(a++ + ", ");
    }

    public static void method2()
    {
        System.out.println("\n");
        System.out.println("Делятся на 3:");
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 == 0) {
                System.out.print(i + ", ");

            }
        }

        System.out.println();
        System.out.println("Делятся на 5:");
        for (int i = 0; i <= 100; i++)
        {
            if (i % 5 == 0) {
                System.out.print(i + ", ");

            }
        }

        System.out.println();
        System.out.println("Делятся на 3 и 5:");
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void method3()
    {
        System.out.println();
        for (int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }
    }

    public static void method4()
    {
        System.out.println();
        int a = 5;
        while (a < 1)
            System.out.println(a--);
    }

    public static void method5()
    {
        System.out.println();
        int a = 1;
        int b = 100;
        int sum = 0;
        for (int i = a; i <= b; i++)
        {
            sum += i;
        }
        System.out.println("Sum =  " + sum);
    }

    public static void method6()
    {
        System.out.println();
        System.out.println("Привет!");
        float x = 2.0f - 1.2f;
        float y = x;
        System.out.print(y);
    }

    public static void method7()
    {
        System.out.println();
        int i = 3;
        for (int j = 0; j < 10; j++)
        {
            System.out.println(i * (j + 1));
        }
    }
}
