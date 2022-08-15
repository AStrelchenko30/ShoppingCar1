package com.example.shoppingcar;

import com.example.shoppingcar.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private ShoppingCar shoppingCar;

    public CarService(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }

    public Item add(long id) {
        Item item = new Item(id);
        shoppingCar.add(item);
        return item;
    }

    public List<Item> getItem() {
        return this.shoppingCar.getItem();
    }
}
