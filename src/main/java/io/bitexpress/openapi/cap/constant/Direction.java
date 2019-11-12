package io.bitexpress.openapi.cap.constant;

public enum Direction {
    BUY("买单报价"), SELL("卖单报价");

    private String description;

    Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
