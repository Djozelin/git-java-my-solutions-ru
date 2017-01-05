package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String sa=bufferedReader.readLine();
        int a=Integer.parseInt(sa);
        String sb=bufferedReader.readLine();
        int b=Integer.parseInt(sb);
        String sc=bufferedReader.readLine();
        int c=Integer.parseInt(sc);
        int d,e;
        if (a>b)
        d=a;
        else d=b;
        if (d<c)
        d=c;
        if (a<b)
            e=a;
        else e=b;
        if (e>c)
            e=c;
        if (a!=d&&a!=e)
            System.out.println(a);
        else {if (b!=d&&b!=e)
            System.out.println(b);
            else
            System.out.println(c);}
        //напишите тут ваш код
    }
}
