package mainPac;

import candys.Lollipops;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SampleReader {

    private static final String FILENAME = "src/main/java/mainPac/Lollipops.ser";

    private static final Logger logger = LogManager.getLogger(Application.class.getName());


    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(FILENAME)){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {
                Lollipops lollipopsSer = (Lollipops) objectInputStream.readObject();
                System.out.println(lollipopsSer);
            }



        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ReadObjectFromFileExample.class.getName())
            logger.log(Level.ERROR, "exception " + ex);
        } catch (IOException | ClassNotFoundException ex) {
//            Logger.getLogger(ReadObjectFromFileExample.class.getName())
            logger.log(Level.ERROR, "IOException " + ex);
        }
    }
}