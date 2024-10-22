package TMP;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<html><head><title>HTML Report</title></head>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<body><h1>HTML Report Body</h1>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report Footer</footer></body></html>");
    }
}
