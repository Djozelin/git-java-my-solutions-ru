package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int n=0, p=0;
        if (a>0)
            p++;
        else n++;
        if (b>0)
            p++;
        else n++;
        if (c>0)
            p++;
        else n++;
        System.out.println("количество отрицательных чисел: "+n);
        System.out.println("количество положительных чисел: "+p);
    }
}
