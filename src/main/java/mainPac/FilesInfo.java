package mainPac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Class for getting path for writer and reader from txt file
class FilesInfo {

    String getPathToWrite() {
        return pathToWrite;
    }

    String getPathToRead() {
        return pathToRead;
    }

   private String pathToWrite;
    private String pathToRead;

    void readFilesInfo() {
        String soursFile = "src/main/java/files/namesOfFile.txt";
        try (Stream<String> lines = Files.lines(Paths.get(soursFile))) {
            pathToRead = lines.skip(0).findFirst().orElse(null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (Stream<String> lines = Files.lines(Paths.get(soursFile))) {
            pathToWrite = lines.skip(1).findFirst().orElse(null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
