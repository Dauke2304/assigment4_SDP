package TMP;

public abstract class ReportGenerator {

    // Template method defines the general process of report generation
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
    }

    // Abstract methods to be implemented by concrete report generators
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}
