package com.javarush.test.level04.lesson04.task02;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        int c=10-a;
        int d=10-b;
        c=abs(c);
        d=abs(d);
        if (c!=d)
        {
            if(c>d)
                System.out.println(b);
            else
                System.out.println(a);
        }
        else System.out.println(a);//::CODE:

    }

    public static int abs(int a)
    {
        if (a < 0)
        {
            return -a;
        } else {
            return a;
        }
    }
}