package io.bitexpress.openapi.cap.model.payment.acquire;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>注释</p>
 *
 * @author wangbin
 * @version $Id: CashierAcquireQueryRequest.java, v 0.1 2019年4月22日 下午5:00:14 wangbin01 Exp $
 */
public class CashierAcquireQueryRequest implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3669352579276119742L;

    @NotBlank
    private String outTradeNo;

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
