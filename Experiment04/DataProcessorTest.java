abstract class DataProcessor {

    final void process() {
        readData();
        processData();
        writeData();
    }

    void readData() {
        System.out.println("Reading data");
    }

    abstract void processData();

    void writeData() {
        System.out.println("Writing data");
    }
}

class CSVProcessor extends DataProcessor {
    void processData() {
        System.out.println("Processing CSV format data");
    }
}

class ExcelProcessor extends DataProcessor {
    void processData() {
        System.out.println("Processing Excel format data");
    }
}

public class DataProcessorTest {
    public static void main(String[] args) {

        DataProcessor csv = new CSVProcessor();
        DataProcessor excel = new ExcelProcessor();

        csv.process();

        System.out.println();

        excel.process();
    }
}