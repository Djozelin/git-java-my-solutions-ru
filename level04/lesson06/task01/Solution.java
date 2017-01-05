package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String snumber1=bufferedReader.readLine();
        int number1=Integer.parseInt(snumber1);
        String snumber2=bufferedReader.readLine();
        int number2=Integer.parseInt(snumber2);
        if (number1>number2)
            System.out.println(number2);
        else
            System.out.println(number1);//напишите тут ваш код
    }
}