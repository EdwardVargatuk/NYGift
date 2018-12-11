package mainPac;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    //Main app

    private static final Logger logger = LogManager.getLogger(Application.class.getName());

    public static void main(String[] args) {

        //Создать несколько объектов-конфет.
        CreateData createData = new CreateData();
        createData.createSweetsItemList();

        FilesInfo filesInfo = new FilesInfo();
        filesInfo.readFilesInfo();
        //use file that should be our source
        String fileNameSource = filesInfo.getPathToRead();
        String fileNameResult = filesInfo.getPathToWrite();

        WriterToFile writerToFile = new WriterToFile();
        writerToFile.writeToItemsListFile(createData.getCandyList(), fileNameSource);


        ReaderFromFile readerFromFile = new ReaderFromFile();
        readerFromFile.readFile(fileNameSource);

        //Собрать детский подарок с определением его
        //веса.
        Box box = new Box();
        box.setCandyList(readerFromFile.getSweetsItemsList());
        System.out.println("Total weight of the box: " + box.totalWeight() + "\n");
        System.out.println("Total cost of the box: " + box.totalCost() + "\n");

        //Провести сортировку конфет в подарке на основе одного из параметров.
        logger.info("Start to sort by cost");
        box.sortList();

        //Найти конфету в подарке, соответствующую заданному диапазону
        //параметров.
        logger.info("Start to filter by weight > 0.1");
        box.filterList();
        writerToFile.writeToItemsListFile(box.getCandyList(), fileNameResult);
//        its for check
//        readerFromFile.readFile(fileNameResult);
//        System.out.println(readerFromFile.getSweetsItemsList());
        logger.info("Work of app successfully completed");

    }
}
