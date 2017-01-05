package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       InputStream inputStream=System.in;
        Reader inputStreamReader=new InputStreamReader(inputStream);//напишите тут ваш код
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String name=bufferedReader.readLine();
        String susd=bufferedReader.readLine();
        int nusd=Integer.parseInt(susd);
        String syear=bufferedReader.readLine();
        int nyear=Integer.parseInt(syear);
        System.out.println(name+" получает "+nusd+" через "+nyear+" лет.");
    }
}