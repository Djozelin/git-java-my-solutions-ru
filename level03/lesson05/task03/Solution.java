package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds(int hour)
    {
        return(hour*3600);
    }
    public static void main(String[] args) {
        int h,s;
        h=2;
        s=convertToSeconds(h);
        System.out.println(s);
        h=4;
        System.out.println(s);//напишите тут ваш код
    }
}