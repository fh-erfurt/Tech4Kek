package de.tech4kek.common.controller;

import java.io.Serializable;

public class ItemData implements Serializable {
    private int id;
    private int count;

    public ItemData(){
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
