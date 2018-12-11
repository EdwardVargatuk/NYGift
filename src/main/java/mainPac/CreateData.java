package mainPac;

import candys.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

//Class for create objects for serialization
class CreateData {

    List<SweetsItem> getCandyList() {
        return candyList;
    }

    private List<SweetsItem> candyList = new ArrayList<>();
    private static final Logger log = LogManager.getLogger(CreateData.class.getName());

    void createSweetsItemList() {
        log.log(Level.INFO, "Start creation SweetItemList");
        candyList.add(new Lollipops("Chupa Chups", 0.7, 50.0));
        candyList.add(new Waffle("APTEK", 0.08, 3, 2.0));
        candyList.add(new Chocolate("KORONA", 0.1, 25.5));
        candyList.add(new Chocolate("Roshen", 0.09, 22.5));
        candyList.add(new NutsChocolate("Nuts", 0.1, 20.0, "peanut", 9.9));
        candyList.add(new NutsChocolate("Milka Wholenut", 0.3, 95.0, "Walnut", 7.8));
        log.log(Level.INFO, "Creation SweetItemList is Done");
    }
}
