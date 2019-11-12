package io.bitexpress.openapi.cap.model.payment.quote;

import io.bitexpress.openapi.cap.constant.Direction;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

public class OTCQuote implements Serializable {

    private static final long serialVersionUID = 6326022121732544791L;

    /**
     * 汇率=（货币数量-gas费用) / 资产数量.
     * <p>
     * rate = (currencyAmount - gas) / assetAmount.
     * </p>
     * <p>
     * currencyAmount = rate * assetAmount + gas
     * </p>
     * <p>
     * assetAmount = floor((currencyAmount - gas) / rate), assetDigit).
     * </p>
     */
    @NotNull
    private BigDecimal rate;

    @NotNull
    private BigDecimal fee;

    /**
     * 资产代码
     */
    @NotBlank
    private String assetCode;
    /**
     * 资产精度
     */
    private Integer assetDigit;

    /**
     * 货币代码
     */
    @NotBlank
    private String currencyCode;

    /**
     * 货币精度
     */
    private Integer currencyDigit;

    /**
     * 最大货币金额
     */
    private BigDecimal maxCurrencyAmount;

    /**
     * 最小货币金额
     */
    private BigDecimal minCurrencyAmount;

    /**
     * 最大资产金额
     */
    private BigDecimal maxAssetAmount;

    /**
     * 最小资产金额
     */
    private BigDecimal minAssetAmount;

    private Direction direction;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public Integer getAssetDigit() {
        return assetDigit;
    }

    public void setAssetDigit(Integer assetDigit) {
        this.assetDigit = assetDigit;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getCurrencyDigit() {
        return currencyDigit;
    }

    public void setCurrencyDigit(Integer currencyDigit) {
        this.currencyDigit = currencyDigit;
    }

    public BigDecimal getMaxCurrencyAmount() {
        return maxCurrencyAmount;
    }

    public void setMaxCurrencyAmount(BigDecimal maxCurrencyAmount) {
        this.maxCurrencyAmount = maxCurrencyAmount;
    }

    public BigDecimal getMinCurrencyAmount() {
        return minCurrencyAmount;
    }

    public void setMinCurrencyAmount(BigDecimal minCurrencyAmount) {
        this.minCurrencyAmount = minCurrencyAmount;
    }

    public BigDecimal getMaxAssetAmount() {
        return maxAssetAmount;
    }

    public void setMaxAssetAmount(BigDecimal maxAssetAmount) {
        this.maxAssetAmount = maxAssetAmount;
    }

    public BigDecimal getMinAssetAmount() {
        return minAssetAmount;
    }

    public void setMinAssetAmount(BigDecimal minAssetAmount) {
        this.minAssetAmount = minAssetAmount;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("minAssetAmount", this.minAssetAmount)
                .append("assetDigit", this.assetDigit).append("assetCode", this.assetCode).append("rate", this.rate)
                .append("fee", this.fee).append("currencyDigit", this.currencyDigit)
                .append("maxCurrencyAmount", this.maxCurrencyAmount).append("maxAssetAmount", this.maxAssetAmount)
                .append("minCurrencyAmount", this.minCurrencyAmount).append("currencyCode", this.currencyCode)
                .toString();
    }

}
