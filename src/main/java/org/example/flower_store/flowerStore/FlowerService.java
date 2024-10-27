package org.example.flower_store.flowerStore;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    public List<Flower> getAllFlowers(){
        return List.of(new Flower(12, FlowerColor.RED, 15, FlowerType.ROSE), new Flower(10, FlowerColor.BLUE, 5, FlowerType.TULIP));
    }
}
