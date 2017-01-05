package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String snum1=bufferedReader.readLine();
        String snum2=bufferedReader.readLine();
        String snum3=bufferedReader.readLine();
        String snum4=bufferedReader.readLine();
        int num1=Integer.parseInt(snum1);
        int num2=Integer.parseInt(snum2);
        int num3=Integer.parseInt(snum3);
        int num4=Integer.parseInt(snum4);
        int a,b;
        if (num1>num2)
            a=num1;
        else a=num2;
        if (num3>num4)
            b=num3;
        else b=num4;
        if (a>b)
            System.out.println(a);
        else System.out.println(b);
    }
}
