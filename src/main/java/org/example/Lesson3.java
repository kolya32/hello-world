//import java.util.Arrays;
//
///**
// * 1. Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел.
// * Длина массива должна быть больше или равна двум.
// * <p>
// * 2. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
// * <p>
// * 3. Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”.
// * <p>
// * 4. Напишите метод, который меняет местами первый и последний элемент массива.
// * Пример вывода:
// * Array 1: [5, 6, 7, 2]
// * Array 2: [2, 6, 7, 5]
// * <p>
// * 5. Дан массив чисел. Найдите первое уникальное в этом массиве число.
// * Например, для массива [1, 2, 3, 1, 2, 4] это число 3. (вложенные циклы)
// */
//public class TestClass
//{
//    public static void main(String[] args)
//    {
//        //                      0  1  2
//        int[] array = new int[]{1, 2, 3, 1, 2, 4};
//        task5(array);
//        task5_1(array);
//
//        //        array = new int[]{2, 3, 2};
//        //        task3(array);
//        //
//        //        array = new int[]{5, 10, 1657};
//        //        task3(array);
//    }
//
//    public static void task1(int[] array)
//    {
//        if (array[0] == 3 || array[array.length - 1] == 3)
//        {
//            System.out.println("Yes");
//        }
//        else
//        {
//            System.out.println("No");
//        }
//    }
//
//    /**
//     * 2. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
//     */
//    public static void task2(int[] array)
//    {
//        for (int i = 0; i < array.length; i++)
//        {
//            int item = array[i];
//            if (item == 1 || item == 3)
//            {
//                System.out.println("Yes - " + i + " - " + item);
//                break;
//            }
//        }
//    }
//
//    /**
//     * 3. Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
//     * Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”.
//     */
//    public static void task3(int[] array)
//    {
//        boolean result = true;
//
//        //  0  1  2   - index
//        // [1, 2, 3]  - item
//
//        for (int i = 1; i < array.length; i++)
//        {
//            // array[i] - 3
//            if (array[i] < array[i - 1])
//            {
//
//                result = false;
//                break;
//            }
//        }
//
//        if (result)
//        {
//            System.out.println("OK");
//        }
//        else
//        {
//            System.out.println("Please, try again");
//        }
//    }
//
//    /**
//     * 4. Напишите метод, который меняет местами первый и последний элемент массива.
//     * <p>
//     * Пример вывода:
//     * Array 1: [5, 6, 7, 2]
//     * Array 2: [2, 6, 7, 5]
//     */
//    public static void task4(int[] array)
//    {
//        int tmp = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = tmp;
//
//        System.out.println(Arrays.toString(array));
//    }
//
//
//    public static void task5_1(int[] array)
//    {
//        for (int item : array)
//        {
//            int count = 0;
//            for (int j : array)
//            {
//                if (j == item)
//                {
//                    count++;
//                }
//            }
//
//            if (count == 1)
//            {
//                System.out.println(item);
//                break;
//            }
//        }
//    }
//
//    /**
//     * 5. Дан массив чисел. Найдите первое уникальное в этом массиве число.
//     * Например, для массива [1, 2, 3, 1, 2, 4] это число 3. (вложенные циклы)
//     *
//     * [1, 2, 3, 1, 2, 4]
//     *
//     * index = 0
//     * item = 1
//     *
//     *      1  2  3  4  5   - index
//     *     [2, 3, 1, 2, 4]  - items
//     *     if 1 == ... then break
//     *
//     * index = 1
//     * item = 2
//     *
//     *      2  3  4  5      - index
//     *     [3, 1, 2, 4]     - items
//     *     if 2 == ... then break
//     *
//     * index = 2
//     * item  = 3
//     *
//     *      3  4   5
//     *     [1, 2, 4] - items
//     *     if 3 == ... then break else sout("uniq") break
//     */
//    public static void task5(int[] array)
//    {
//        // array.length = 6
//        //  0  1  2  3  4  5   - index
//        // [1, 2, 3, 1, 2, 4]  - items
//        int result = -1;
//
//        for (int i = 0; i < array.length; i++)
//        {
//            // По умолчанию считаем, что дублей нет
//            boolean uniq = true;
//            int item = array[i];
//
//            for (int j = i + 1; j < array.length; j++)
//            {
//                if (item == array[j])
//                {
//                    uniq = false;
//                    break;
//                }
//            }
//
//            if (uniq)
//            {
//                result = item;
//                break;
//            }
//        }
//
//        System.out.println(result);
//    }
//}
