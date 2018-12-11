package mainPac;


import candys.SweetsItem;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


class ReaderFromFile {

    private static final Logger log = LogManager.getLogger(ReaderFromFile.class.getName());

    List<SweetsItem> getSweetsItemsList() {
        return sweetsItemsList;
    }

    private List<SweetsItem> sweetsItemsList = new ArrayList<>();

    void readFile(String fileName) {

        log.log(Level.INFO, "Start Reading file " + fileName);
        sweetsItemsList.clear();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {

                sweetsItemsList = (ArrayList<SweetsItem>) objectInputStream.readObject();
            }
            fileInputStream.close();
            objectInputStream.close();

        } catch (ClassNotFoundException | IOException e) {
            log.log(Level.ERROR, "exception " + e);
        }
        log.log(Level.INFO, "Reading file complete");
    }

}
