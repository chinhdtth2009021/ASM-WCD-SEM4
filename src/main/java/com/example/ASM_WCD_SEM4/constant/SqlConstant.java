package com.example.ASM_WCD_SEM4.constant;

public class SqlConstant {
    public  static final String CATEGORY_FOOD = " INSERT INTO products ( name, description, detail, price, thumbnail, status," + " createAt, updateAt, deleteAt, createBy, updateBy, deleteBy) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String CATEGORY_UPDATE = " UPDATE product SET id = ?, categoryId = ?,  name = ?, description = ?, detail = ?, price = ?, thumbnail = ?, status = ?," + " createAt = ?, updateAt = ?, deleteAt = ?, createBy = ?, updateBy = ?, deleteBy = ?, WHERE id = ?;";
    public static final String CATEGORY_DELETE = "DELETE FROM products WHERE id = ?;";
}
