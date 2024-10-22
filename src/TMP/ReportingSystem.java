package TMP;
public class ReportingSystem {

    // This method accepts any report generator and calls its generateReport method
    public void generate(ReportGenerator reportGenerator) {
        reportGenerator.generateReport();
    }
}

