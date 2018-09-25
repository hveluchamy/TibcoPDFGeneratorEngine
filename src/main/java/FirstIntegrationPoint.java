import entitiy.CustomerDetails;
import entitiy.Settlement;
import entitiy.SettlementItem;
import manager.JasperReportManager;
import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FirstIntegrationPoint {
    public static void main(String[] args) throws IOException, JRException {
        SettlementItem settlementItem = new SettlementItem();
        settlementItem.setAvgChargeRate("53.0");
        settlementItem.setChargeExclTax("$105.5");
        settlementItem.setDescription("sample testing");
        settlementItem.setChargeInclGst("$115.5");
        settlementItem.setGstVale("$10.5");
        settlementItem.setTotalTransactionValue("$545.04");
        //This is needed to be added to table footer
        settlementItem.setPaymentDeducutedValue("$11.4");



      /*  SettlementItem settlementItem1 = new SettlementItem();
        settlementItem1.setAvgChargeRate("53.0");
        settlementItem1.setChargeExclTax("$105.5");
        settlementItem1.setDescription("sample testing");
        settlementItem1.setChargeInclGst("$115.5");
        settlementItem1.setGstVale("$10.5");
        //This is needed to be added to table footer
        settlementItem1.setPaymentDeducutedValue("$51.4");*/


        List<SettlementItem> settlementItemList = new ArrayList<SettlementItem>();
        settlementItemList.add(settlementItem);
        //settlementItemList.add(settlementItem1);

        Settlement settlement = new Settlement();
        settlement.setSettlementItem(settlementItemList);
        settlement.setAbnNumber("ABN23232");
        settlement.setAmountDue("$23423.00");
        settlement.setCurrency("AUD");
        settlement.setInvoiceDate("23/09/18");
        settlement.setInvoiceNumber("INV132131");
        settlement.setPaymentDeducutedValue("2343");


        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCustomerName("Test cust");
        customerDetails.setAddress1("1 Line 1 st");
        customerDetails.setAddress2("second line of address");
        customerDetails.setCountry("Australia");
        customerDetails.setPinCode("3073");
        customerDetails.setState("VIC");

        settlement.setCustomerDetails(customerDetails);

        JasperReportManager jsp = new JasperReportManager();
        System.out.println(jsp.generateDocument("SETTLEMENT", settlement));
        System.out.println(jsp.deleteDocument("INV132131hp.pdf"));


    }
}
