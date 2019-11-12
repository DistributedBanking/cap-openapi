package io.bitexpress.openapi.cap.model.payment.quote;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class QueryOtcQuoteByCurrencyCodeRequest implements Serializable {

    private static final long serialVersionUID = 4514307761127102014L;

    @NotBlank
    private String currencyCode;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
