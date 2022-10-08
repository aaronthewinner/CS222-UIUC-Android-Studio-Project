package com.example.grocerylist;
import kotlin.collections.AbstractList;
import Item;
public class Store {
    // name of store
    private String name;
    // id of store(if we have this)
    private long id;
    // list of items available at the store
    private AbstractList<Item>;
    // list of prices that always needs to align with the items
    private AbstractList<double>;
    public String getName(){ return name;}
    public void setName(String newName) { name = newName;}
    public long getId(){return id;}
}
