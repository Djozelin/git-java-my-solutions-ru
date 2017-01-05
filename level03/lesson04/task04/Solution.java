package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a,b;
        a=1;
        b=1;
        for (int i=0;i<11;i++)
        {
            a = a + 1;
            b = a * b;
        }
        System.out.println(b);
    }
}