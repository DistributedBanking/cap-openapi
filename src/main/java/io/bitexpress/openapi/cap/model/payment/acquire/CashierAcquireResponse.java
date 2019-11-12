package io.bitexpress.openapi.cap.model.payment.acquire;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class CashierAcquireResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 57172908022291334L;

    @NotBlank
    private String url;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String outTradeNo;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
