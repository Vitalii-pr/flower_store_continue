package org.example.flower_store.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.flower_store.delivery.Delivery;
import org.example.flower_store.flowerStore.Item;
import org.example.flower_store.payment.Payment;

import java.util.List;

@AllArgsConstructor
public class Order {


    private List<Item> items;
    @Setter
    private Delivery delivery;
    @Setter
    private Payment payment;
    @Getter
    private float price;

    void calculateTotalPrice(){
        float total = 0;

        for (Item t:items){
            total += (float) t.getPrice();
        }
    }

    void addItem(Item itemToAdd){
        items.add(itemToAdd);
        calculateTotalPrice();
    }

    void removeItem(Item itemToRm){
        items.remove(itemToRm);
        calculateTotalPrice();
    }


}
