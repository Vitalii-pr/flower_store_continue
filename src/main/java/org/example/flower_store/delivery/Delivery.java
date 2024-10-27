package org.example.flower_store.delivery;

import org.example.flower_store.flowerStore.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
