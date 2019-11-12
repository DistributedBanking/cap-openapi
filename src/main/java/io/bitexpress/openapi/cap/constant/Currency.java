package io.bitexpress.openapi.cap.constant;

public enum Currency {
    CNY("人民币"),
    IDR("印尼卢比"),VND("越南盾")
    ;

    Currency(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}
