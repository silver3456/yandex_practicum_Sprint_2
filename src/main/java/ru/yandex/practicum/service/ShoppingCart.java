package ru.yandex.practicum.service;

import ru.yandex.practicum.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalSumNoDiscount() {
        double sum = 0;
        for (Food item : food) {
            sum += item.getTotalPrice();
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (Food item : food) {
            double discount = item.getDiscount();
            sum += item.getTotalPrice() * (100 - discount) / 100;
        }
        return sum;
    }

    public double getTotalSumVegetarianNoDiscount() {
        double sum = 0;
        for (Food item : food) {
            if (item.isVegetarian()) {
                sum += item.getTotalPrice();
            }
        }
        return sum;
    }

}
