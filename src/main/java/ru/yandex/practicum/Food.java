package ru.yandex.practicum;

import ru.yandex.practicum.model.Discountable;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}