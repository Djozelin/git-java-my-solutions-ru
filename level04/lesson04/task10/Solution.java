package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream=System.in;
        Reader InputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(InputStreamReader);
        String sn=bufferedReader.readLine();
        int n=Integer.parseInt(sn);
        String sm=bufferedReader.readLine();
        int m=Integer.parseInt(sm);
        String sp=bufferedReader.readLine();;
        int p=Integer.parseInt(sp);
        if (n==m&&m!=p)
            System.out.println(n+" "+m);
        if (m==p&&p!=n)
            System.out.println(m+" "+p);
        if (n==p&&p!=m)
            System.out.println(n+" "+p);
         if (n==m&&m==p)
        System.out.println(n+" "+m+" "+p);
    }
}