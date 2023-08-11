package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> eatenDishes = new ArrayList<>();
        Deque<Integer> plates = new LinkedList<>();
        if (numberOfDishes == 0) {
            return eatenDishes;
        }
        for (int i = 1; i <= numberOfDishes; i++) {
            plates.add(i);
        }
        while (plates.size() > 0) {
            for (int i = 1; i <= everyDishNumberToEat - 1; i++) {
                plates.offerLast(plates.pollFirst());
            }
            eatenDishes.add(plates.pollFirst());
        }

        return eatenDishes;
    }
}
