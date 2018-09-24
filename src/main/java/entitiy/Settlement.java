package entitiy;

import java.io.Serializable;
import java.util.List;

public class Settlement implements Serializable {
    private String invoiceDate;
    private String invoiceNumber;
    private String currency;
    private String amountDue;
    private String abnNumber;



    private String paymentDeducutedValue;
    private List<SettlementItem> settlementItem;
    private CustomerDetails customerDetails;

    public List<SettlementItem> getSettlementItem() {
        return settlementItem;
    }

    public void setSettlementItem(List<SettlementItem> settlementItem) {
        this.settlementItem = settlementItem;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }




    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(String amountDue) {
        this.amountDue = amountDue;
    }

    public String getAbnNumber() {
        return abnNumber;
    }

    public void setAbnNumber(String abnNumber) {
        this.abnNumber = abnNumber;
    }

    public String getPaymentDeducutedValue() {
        return paymentDeducutedValue;
    }

    public void setPaymentDeducutedValue(String paymentDeducutedValue) {
        this.paymentDeducutedValue = paymentDeducutedValue;
    }

}
