package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
       String s1,s2,s3; //напишите тут ваш код
        s1="Мама";
        s2="Мыла";
        s3="Раму";
        System.out.println(s1+s2+s3);
        System.out.println(s1+s3+s2);
        System.out.println(s2+s1+s3);
        System.out.println(s2+s3+s1);
        System.out.println(s3+s1+s2);
        System.out.println(s3+s2+s1);
    }
}