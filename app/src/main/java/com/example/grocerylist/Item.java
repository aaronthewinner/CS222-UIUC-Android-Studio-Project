package com.example.grocerylist;
import java.util.Set;
public class Item {
    // name and id of item
    private String name;
    private long id;
    // if we want users to efficiently search for things, we might want to put items into categories
    private Set<String> categories;
    // getters and setters for name and id(may not want)
    public String getName(){ return name;}
    public void setName(String newName) { name = newName;}
    public long getId(){return id;}
    public void SetId(long newId) { id = newId;}
    // checks if an item falls into a particular category
    public boolean isCategory(String search) { return categories.contains(search);}
}
