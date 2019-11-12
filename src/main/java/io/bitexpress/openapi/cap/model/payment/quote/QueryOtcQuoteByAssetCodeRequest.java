package io.bitexpress.openapi.cap.model.payment.quote;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class QueryOtcQuoteByAssetCodeRequest implements Serializable {

    private static final long serialVersionUID = -518317975878235790L;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }
}
