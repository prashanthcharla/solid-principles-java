package singleResponsibility.violation;

public class SalesReport {
    public String generateReportData() {
        return "Raw Report Data";
    }

    public String formatReportDataToHtml(String reportData) {
        return "<h1> Report Data </h1>";
    }

    public void saveFormattedReportDataToFile(String formattedData, String fileName) {
        System.out.println("Saved");
    }
}
