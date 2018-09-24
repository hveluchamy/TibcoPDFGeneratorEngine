package entitiy;

import java.io.Serializable;

public class SettlementItem implements Serializable {
    private String description;
    private String totalTransactionValue;
    private String avgChargeRate;
    private String chargeExclTax;
    private String gstVale;
    private String chargeInclGst;
    private String paymentDeducutedValue;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotalTransactionValue() {
        return totalTransactionValue;
    }

    public void setTotalTransactionValue(String totalTransactionValue) {
        this.totalTransactionValue = totalTransactionValue;
    }

    public String getAvgChargeRate() {
        return avgChargeRate;
    }

    public void setAvgChargeRate(String avgChargeRate) {
        this.avgChargeRate = avgChargeRate;
    }

    public String getChargeExclTax() {
        return chargeExclTax;
    }

    public void setChargeExclTax(String chargeExclTax) {
        this.chargeExclTax = chargeExclTax;
    }

    public String getGstVale() {
        return gstVale;
    }

    public void setGstVale(String gstVale) {
        this.gstVale = gstVale;
    }

    public String getChargeInclGst() {
        return chargeInclGst;
    }

    public void setChargeInclGst(String chargeInclGst) {
        this.chargeInclGst = chargeInclGst;
    }

    public String getPaymentDeducutedValue() {
        return paymentDeducutedValue;
    }

    public void setPaymentDeducutedValue(String paymentDeducutedValue) {
        this.paymentDeducutedValue = paymentDeducutedValue;
    }


}
