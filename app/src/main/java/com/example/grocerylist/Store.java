package com.example.grocerylist;
import java.util.ArrayList;
import java.util.List;

public class Store {
    // name of store
    private String name;
    // id of store(if we have this)
    private long id;
    // list of items available at the store
    private List<Item> items;
    // list of prices that always needs to align with the items
    // could have more than 1 item with the same price, so can't use sets here
    private List<java.lang.Double> prices;
// constructor for store
    public Store (String newName, long newId, List<Item> newItems, List<java.lang.Double> newPrices) {
        assert (newItems.size() == newPrices.size());
        name = newName;
        id = newId;
        items = newItems;
        prices = newPrices;
    }
    // getters and setters for name and id(may not want)
    public String getName(){ return name;}
    public void setName(String newName) { name = newName;}
    public long getId(){return id;}
    public void setId(long newId) { id = newId;}
    // adds a new item
    public void addItem(Item newItem, double newPrice) {
        items.add(newItem);
        prices.add(newPrice);
    }
    // checks if the store has a particular item
    public boolean hasItem(String search) {
        return itemSearch(search) != -1;
    }
    // helper method that searches for an item in the list
    private int itemSearch(String search) {
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).getName().equals(search)) {
                return i;
            }
        }
        // default value if item not found
        return -1;
    }
    // gets the price of a specific item name
    public double getPrice(String search) {
        if(itemSearch(search) == -1) {
            // default value if item not found
            return 0.0;
        }
        return prices.get(itemSearch(search));
    }
    // return every item in a store within a category
    public List<Item> getCategory(String search) {
        List<Item> toReturn = new ArrayList<>();
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).isCategory(search)) {
                toReturn.add(items.get(i));
            }
        }
        return toReturn;
    }
}
