package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int j=1; j<=10; j++)
        {
            for(int i=1; i<=10; i++)
            {
                System.out.print(i*j+" ");//напишите тут ваш код
            }
            System.out.println(" ");
        }
    }
}