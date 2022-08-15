package com.example.shoppingcar;

import com.example.shoppingcar.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCar {

    private final List<Item> items =new ArrayList();

    public void add(Item item){
        items.add(item);
    }

    public List<Item> getItem() {
        return new ArrayList<>(items);
    }
}
