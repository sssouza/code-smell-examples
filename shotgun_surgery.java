// 1. PDF Report (has formatting logic)
class PDFReport {
       public void generate(Data data) {
              String header = "Report: " + data.getTitle() + "\n";
              String body = formatData(data); // Formatting logic here
              System.out.println(header + body);
       }

       private String formatData(Data data) {
              return "Date: " + data.getDate() + "\nContent: " + data.getContent();
       }
}
   
// 2. HTML Report (duplicates formatting logic)
class HTMLReport {
       public void generate(Data data) {
           String header = "<h1>Report: " + data.getTitle() + "</h1>";
           String body = formatData(data); // Same logic, slightly different format
           System.out.println(header + body);
       }
   
       private String formatData(Data data) {
           return "<p>Date: " + data.getDate() + "</p><p>Content: " + data.getContent() + "</p>";
       }
}
   
// 3. CSV Report (yet another copy)
class CSVReport {
       public void generate(Data data) {
           String header = "Title," + data.getTitle();
           String body = formatData(data); // Same logic again
           System.out.println(header + body);
       }
   
       private String formatData(Data data) {
           return "Date," + data.getDate() + "\nContent," + data.getContent();
       }
}