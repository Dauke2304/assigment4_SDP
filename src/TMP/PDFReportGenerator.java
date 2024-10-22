package TMP;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("PDF Report Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("PDF Report Body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("PDF Report Footer");
    }
}
