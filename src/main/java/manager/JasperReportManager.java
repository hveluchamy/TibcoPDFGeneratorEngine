package manager;

import JasperTemplateGenerator.SettlementGenerator;
import entitiy.Settlement;
import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.io.Serializable;

public class JasperReportManager implements Serializable {

    public static final String SETTLEMENT = "SETTLEMENT";
    //TODO in the future if you want to extend this, the parameter has to by generic for specific document type
    //Thats for future
    public void generateDocument(String reportType, Settlement settlement) throws IOException, JRException {
        //dosomething
        if (SETTLEMENT.equals(reportType)) {
            SettlementGenerator sm = new SettlementGenerator();
            sm.generateTemplate(settlement);
        }


    }
}
