package com.example.ASM_WCD_SEM4.entity;

import com.example.ASM_WCD_SEM4.entity.base.BaseEntity;
import com.example.ASM_WCD_SEM4.entity.entityEnum.FoodStatus;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private int categoryId;
    private String name;
    private String description;
    private String detail;
    private String thumbnail;
    private double price;

    public Category() {
    }

    public Category(int id, int categoryId, String name, String description, String detail, String thumbnail, double price, FoodStatus status) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.thumbnail = thumbnail;
        this.price = price;
        this.status = status;
    }

    public Category(int categoryId, String name, String description, String detail, String thumbnail, double price, FoodStatus status) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.thumbnail = thumbnail;
        this.price = price;
        this.status = status;
    }

    public Category(LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, int id, int categoryId, String name, String description, String detail, String thumbnail, double price, FoodStatus status) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.thumbnail = thumbnail;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FoodStatus getStatus() {
        return status;
    }

    public void setStatus(FoodStatus status) {
        this.status = status;
    }

    private FoodStatus status;
}

