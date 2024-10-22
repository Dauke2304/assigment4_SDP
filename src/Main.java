import TMP.*;
public class Main {
    public static void main(String[] args) {
        // Create instances of different report generators
        ReportGenerator pdfReport = new PDFReportGenerator();
        ReportGenerator htmlReport = new HTMLReportGenerator();

        // Create the reporting system
        ReportingSystem reportingSystem = new ReportingSystem();

        // Generate reports in different formats
        System.out.println("Generating PDF Report:");
        reportingSystem.generate(pdfReport);

        System.out.println("\nGenerating HTML Report:");
        reportingSystem.generate(htmlReport);

    }
}

