package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String s=bufferedReader.readLine();
        String sn=bufferedReader.readLine();
        int n=Integer.parseInt(sn);
        int i=1;
        while (i<=n)
        {System.out.println(s);
            i++;}//напишите тут ваш код
    }
}
