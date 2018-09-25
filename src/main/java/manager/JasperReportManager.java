package manager;

import JasperTemplateGenerator.SettlementGenerator;
import JasperTemplateGenerator.TemplateGenerator;
import entitiy.PropertyDetailsSingleton;
import entitiy.Settlement;
import net.sf.jasperreports.engine.JRException;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

public class JasperReportManager implements Serializable {

    private static Properties properties = PropertyDetailsSingleton.getPropertyInstance();
    private static String exportPath = properties.getProperty("settlement.export.destination");

    public static final String SETTLEMENT = "SETTLEMENT";
    public String generateDocument(String reportType, Object object) throws IOException, JRException {
        TemplateGenerator templateGenerator;
        if (SETTLEMENT.equals(reportType)) {
            templateGenerator = new SettlementGenerator();
            return templateGenerator.generateTemplate(object);
        }
        return null;

    }

    public boolean deleteDocument(String filename){
        File file = new File(exportPath + filename);
        return file.delete();
    }
}
