package com.example.ASM_WCD_SEM4.model;

import com.example.ASM_WCD_SEM4.entity.Food;

public interface FoodModel {
    boolean save(Food categoryFood);

    boolean update(int id, Food updatecategoryFood);

    boolean delete(int id);


}
