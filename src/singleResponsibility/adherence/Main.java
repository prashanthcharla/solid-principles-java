package singleResponsibility.adherence;

public class Main {
    public static void main(String[] args) {
        SalesReportGenerator salesReportGenerator = new SalesReportGenerator();
        HtmlReportFormatter htmlReportFormatter = new HtmlReportFormatter();
        FileSaver fileSaver = new FileSaver();

        String reportData = salesReportGenerator.generateReportData();
        System.out.println(reportData);

        String formattedReportData = htmlReportFormatter.format(reportData);
        System.out.println(formattedReportData);

        fileSaver.save(formattedReportData, "test.html");
    }
}
