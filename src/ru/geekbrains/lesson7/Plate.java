package ru.geekbrains.lesson7;

import javax.swing.*;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    boolean decreaseFood(int n)
    {
        int diff = food -n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }

    void addFood(int food)
    {
        this.food += food;
    }


}
