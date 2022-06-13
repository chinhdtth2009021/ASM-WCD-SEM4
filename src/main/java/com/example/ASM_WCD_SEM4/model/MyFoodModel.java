package com.example.ASM_WCD_SEM4.model;

import com.example.ASM_WCD_SEM4.entity.Food;

public class MyFoodModel implements FoodModel{
    public MyFoodModel() {
        super();
    }
    @Override
    public boolean save(Food categoryFood) {
        return false;
    }

    @Override
    public boolean update(int id, Food updatecategoryFood) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
