package mainPac;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


//this is sample


public class BasicCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "src/main/java/mainPac/file.scv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                double weight = Double.parseDouble(csvRecord.get(1));
                double cost = Double.parseDouble(csvRecord.get(2));
                double numWaffle = Double.parseDouble(csvRecord.get(3));
                double pricePerPiece =Double.parseDouble(csvRecord.get(4));

                System.out.println("Name : " + name);
                System.out.println("weight : " + weight);
                System.out.println("Cost : " + cost);
                System.out.println("Prise per 100g : " + numWaffle);
                System.out.println("\n");
            }
        }
    }
}