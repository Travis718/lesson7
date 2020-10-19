package ru.geekbrains.lesson7;

public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = {new Cat("Мурка", 5), new Cat("Васька", 10), new Cat("Бусинка", 7)};

        Plate plate = new Plate(100);

        for (Cat cat : cats)
        {
            cat.eat(plate);
            cat.info();
        }


    }
}
