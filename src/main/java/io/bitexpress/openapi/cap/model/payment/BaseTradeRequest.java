package io.bitexpress.openapi.cap.model.payment;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class BaseTradeRequest implements Serializable {

    private static final long serialVersionUID = 4519629103113263535L;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String outTradeNo;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
