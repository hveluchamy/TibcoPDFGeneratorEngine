package entitiy;

import java.io.Serializable;

public class CustomerDetails implements Serializable {
    //HTML based string
    private String customerName;
    private String address1;
    private String address2;
    private String state;
    private String country;
    private String pinCode;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCustomerNameAndAddress(){

        StringBuilder fullAddress=new StringBuilder("");
        if(customerName!=null){
            fullAddress.append(customerName);
            fullAddress.append("<br/>");
        }
        if(address1!=null){
            fullAddress.append(address1);
            fullAddress.append("<br/>");
        }
        if(address2!=null){
            fullAddress.append(address2);
            fullAddress.append("<br/>");
        }
        if(state!=null){
            fullAddress.append(state);
            fullAddress.append("<br/>");
        }
        if(country!=null){
            fullAddress.append(country);
            fullAddress.append("<br/>");
        }
        if(pinCode!=null){
            fullAddress.append(pinCode);
        }

        return fullAddress.toString();
    }

}
