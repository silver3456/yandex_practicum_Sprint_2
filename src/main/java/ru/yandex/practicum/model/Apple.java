package ru.yandex.practicum.model;

import ru.yandex.practicum.Food;

import static ru.yandex.practicum.model.constants.Colour.*;
import static ru.yandex.practicum.model.constants.Discount.*;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return APPLE_DISCOUNT;
        } else {
            return 0;
        }
    }
}
