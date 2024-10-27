package org.example.flower_store.flowerStore;

public enum FlowerColor {
     RED("#FF0000"), BLUE("#0000FF");

    private final String stringRepresentation;
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation.isEmpty() ? "none" : stringRepresentation;
    }


    @Override
    public String toString() {
        return stringRepresentation;
    }
}
