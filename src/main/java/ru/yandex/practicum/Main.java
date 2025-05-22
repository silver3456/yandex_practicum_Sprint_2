package ru.yandex.practicum;

import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food applesRed = new Apple(10, 50, "red");
        Food applesGreen = new Apple(8, 60, "green");

        Food[] food = {meat, applesRed, applesGreen};
        ShoppingCart cart = new ShoppingCart(food);

        System.out.printf("Общая сумма товаров без скидки. Ожидали %.2f, получили %.2f%n", 1480.00, cart.getTotalSumNoDiscount());
        System.out.printf("Общая сумма товаров со скидкой. Ожидали %.2f, получили %.2f%n", 1180.00, cart.getTotalSumWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки. Ожидали %.2f, получили %.2f%n", 980.00, cart.getTotalSumVegetarianNoDiscount());
    }
}
