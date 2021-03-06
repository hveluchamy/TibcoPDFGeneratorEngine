package JasperTemplateGenerator;

import entitiy.PropertyDetailsSingleton;
import entitiy.Settlement;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SettlementGenerator implements TemplateGenerator {

    public static final String SETTLEMENT_REPORT_TEMPLATE_LOCATION = "SettlementReport_Updated.jrxml";
    private static Properties properties = PropertyDetailsSingleton.getPropertyInstance();
    private static String exportPath = properties.getProperty("settlement.export.destination");

    public String generateTemplate(Object object) throws IOException, JRException {

        Settlement settlement = (Settlement) object;
        //get settlement item list
        JRBeanCollectionDataSource settlementItemDataSource = new
                JRBeanCollectionDataSource(settlement.getSettlementItem());

        Map parameters = populateTemplateParameters(settlement, settlementItemDataSource);


        InputStream jrxmlInput = SettlementGenerator.class.getClassLoader().getResource(SETTLEMENT_REPORT_TEMPLATE_LOCATION).openStream();
        JasperDesign design = JRXmlLoader.load(jrxmlInput);
        JasperReport settlementReport = JasperCompileManager.compileReport(design);

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                settlementReport, parameters, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(jasperPrint,  exportPath  +settlement.getInvoiceNumber() + ".pdf");

        File file = new File(exportPath + settlement.getInvoiceNumber() + ".pdf");
        return file.getCanonicalPath();


       // JasperExportManager.export(jasperPrint,  settlement.getInvoiceNumber() + ".pdf");
    }

    private Map populateTemplateParameters(Settlement settlement, JRBeanCollectionDataSource settlementItemDataSource) {
        //the parameter name should match the name in template parameter name
        Map parameters = new HashMap<String, Object>();
        parameters.put("SETTLEMENT_ITEM_DATA_SOURCE", settlementItemDataSource);
        parameters.put("INV_DATE", settlement.getInvoiceDate());
        parameters.put("ABN", settlement.getAbnNumber());
        parameters.put("AMOUNT_DUE", settlement.getAmountDue());
        parameters.put("CURRENCY", settlement.getCurrency());
        parameters.put("CUSTOMER_ADDRESS", settlement.getCustomerDetails().getCustomerNameAndAddress());
        parameters.put("INV_NO", settlement.getInvoiceNumber());
        parameters.put("PAYMENT_DEDCUTED", settlement.getPaymentDeducutedValue());
        return parameters;
    }
}
