package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while  (true)
        {
            String sn=bufferedReader.readLine();
            int n=Integer.parseInt(sn);
            sum=sum+n;
            if (n==-1)
                break;

        }//напишите тут ваш код
        System.out.println(sum);
    }
}