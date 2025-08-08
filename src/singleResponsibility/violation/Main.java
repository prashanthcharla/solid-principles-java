package singleResponsibility.violation;

public class Main {
    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport();

        String unformattedReportData = salesReport.generateReportData();
        System.out.println(unformattedReportData);

        String reportDataAsHTML = salesReport.formatReportDataToHtml(unformattedReportData);
        System.out.println(reportDataAsHTML);

        salesReport.saveFormattedReportDataToFile(reportDataAsHTML, "test.html");
    }
}
