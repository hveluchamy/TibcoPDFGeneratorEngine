package JasperTemplateGenerator;

import net.sf.jasperreports.engine.JRException;

import java.io.IOException;

public interface TemplateGenerator {
    String generateTemplate(Object o) throws IOException, JRException;
}
