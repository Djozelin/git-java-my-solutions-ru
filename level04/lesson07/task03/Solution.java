package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String sa=bufferedReader.readLine();
        int a=Integer.parseInt(sa);
        String sb=bufferedReader.readLine();
        int b=Integer.parseInt(sb);
        String sc=bufferedReader.readLine();
        int c=Integer.parseInt(sc);
        int d=0;
        if (a>0)
            d++;
        if (b>0)
            d++;
        if (c>0)
            d++;
        System.out.println(d);
    }
}
