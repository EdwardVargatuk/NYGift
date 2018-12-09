package mainPac;

import candys.Lollipops;
import candys.Waffle;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {

    private static final String DIRECTORY = "src/main/java/mainPac/";

    private static final Logger logger = LogManager.getLogger(Application.class.getName());

    public static void main(String[] args) {

        logger.info("start info");
        Lollipops lollipops1 = new Lollipops("roshen", 5, 20);

        Waffle waffle = new Waffle("ABK", 0.3, 2, 10);
        try {
            Lollipops lollipops2 = new Lollipops("ros", 55, 2);
              FileOutputStream fileOutputStream = new FileOutputStream(DIRECTORY
                    + "Lollipops.ser");
              ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(lollipops1);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(WriteObjectToFileExample.class.getName())
            logger.log(Level.ERROR, "exception " + ex);
        } catch (IOException ex) {
            logger.log(Level.ERROR, "another one  " + ex);
//            Logger.getLogger(WriteObjectToFileExample.class.getName())
//                    .log(Level.SEVERE, null, ex);
        }


        //Создать несколько объектов-конфет.


//Собрать детский подарок с определением его
        //веса.
//
        Box box = new Box();
        box.getCandy(lollipops1);
        box.getCandy(waffle);
        System.out.println(box.totalWeight());
        //Провести сортировку конфет в подарке на основе одного из параметров.
        //Найти конфету в подарке, соответствующую заданному диапазону
        //параметров.
        box.filterList();

        logger.info("after log");


    }
}



//
//        System.out.println(lollipops1.getName() + " " + lollipops1.getCost());
//        System.out.println(waffle.getName() + " " + waffle.getCost() + " " + waffle.getNumWaffle() + " " + waffle.getWeight());

//        System.out.println(box.getCandyList());



//        List<SweetsItem> list;
//        list = box.getCandyList();
//        list.stream().sorted(Comparator.comparing(SweetsItem::getCost).reversed())
//                .filter(x -> x.getWeight() < 5.0).collect(Collectors.toList()).forEach(System.out::println);




//or
//        list.forEach(e -> System.out.println("Name: " + e.getName() + "\nWeight: " + e.getWeight() + "\nCost: " + e.getCost() + "\n"));
//or to string
