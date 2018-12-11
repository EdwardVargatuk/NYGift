package mainPac;

import candys.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.List;

class WriterToFile {

    private static final Logger log = LogManager.getLogger(WriterToFile.class.getName());

    void writeToItemsListFile(List<SweetsItem> sweetsItem, String fileName) {

        log.info("start writing Sweets Item List to File " + fileName);
        try {
            FileOutputStream fOutputs = new FileOutputStream(fileName);
            ObjectOutputStream oOutputs = new ObjectOutputStream(fOutputs);
            oOutputs.writeObject(sweetsItem);
            oOutputs.close();
            fOutputs.close();

        } catch (IOException e) {
            log.log(Level.ERROR, "exception " + e);
        }
        log.info("Writing to file complete ");
    }
}
