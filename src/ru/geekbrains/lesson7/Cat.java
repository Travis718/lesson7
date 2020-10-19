package ru.geekbrains.lesson7;

public class Cat
{
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate)
    {
    if (hungry && plate.decreaseFood(appetite))
    hungry = false;
    }

    public void info()
    {
        String isHungry = !hungry ? "Котейка не хочет есть" : "Киса щас готова сожрать слона!";
        System.out.println(name + " " + isHungry);
    }
}
