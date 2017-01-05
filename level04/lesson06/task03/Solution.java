package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String sn1=bufferedReader.readLine();
        int n1=Integer.parseInt(sn1);
        String sn2=bufferedReader.readLine();
        int n2=Integer.parseInt(sn2);
        String sn3=bufferedReader.readLine();
        int n3=Integer.parseInt(sn3);
        int a,b,c,d;
        if (n1>n2)
            {a=n1;
            b=n2;}
        else
            {a=n2;
            b=n1;}
        if (a>n3)
            {c=a;
            d=n3;}
        else
            {c=n3;
            d=a;}
        if (b>d)
            System.out.println(c+" "+b+" "+d);
        else
            System.out.println(c+" "+d+" "+b);//напишите тут ваш код
    }
}
