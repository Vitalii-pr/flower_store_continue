package org.example.flower_store.delivery;

import org.example.flower_store.flowerStore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "DHL delivery " + items;
    }
}
