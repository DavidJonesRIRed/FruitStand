package com.GroceryStore;

import com.GroceryStore.Products.Drink;
import com.GroceryStore.Products.Fruit;
import com.GroceryStore.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory = new ArrayList<>();
    private int balance = 500_00;
    private String name;

    public Store(String name) {
        this.name = name;
    }

    // TODO: add the given product to the collection.
    public void addToInventory(Product product) {
        inventory.add(product);
    }

    // TODO: Drink version
    public void addToInventory(String drinkName, int price, String id, String description, int volume, int volumeUnit) {
        Drink drink = new Drink(drinkName,price,id,description,volume,volumeUnit);
        addToInventory(drink);
    };

    // TODO: Friut version
    public void addToInventory(String fruitName, int price, String id, String description, int hardness,
                               boolean isOrganic) {
        Fruit fruit = new Fruit(fruitName,price,id,description,hardness,isOrganic);
        addToInventory(fruit);
    };

}
