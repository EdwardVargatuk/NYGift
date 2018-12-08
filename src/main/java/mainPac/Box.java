package mainPac;

import candys.Lollipops;
import candys.SweetsItem;
import candys.Waffle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Box {
    //    private int numberOfItems = 0;
    private List<SweetsItem> candyList = new ArrayList<>();

    //    private SweetsItem[] itemArray;

    private List<SweetsItem> getCandyList() {
        return candyList;
    }

    private void getCandy(SweetsItem sweetsItem) {
        candyList.add(sweetsItem);
    }


    private static final Logger logger = Logger.getLogger(Box.class.getName());


    public void clear() {
        getCandyList().clear();

    }

//    public int numberOfItems() {
//        return numberOfItems;
//    }

    private double totalCost() {
        double cost = 0.0;
        for (SweetsItem candy : candyList
        ) {
            cost += candy.getWeight();
        }
        return cost;
    }

    private double totalWeight() {
        double weight = 0.0;
        for (SweetsItem candy : candyList
        ) {
            weight += candy.getWeight();
        }

        return weight;
    }


    public static void main(String[] args) {
        Lollipops lollipops1 = new Lollipops("roshen", 5, 20);
        Waffle waffle = new Waffle("A", 0.3, 2, 10);
        logger.log(Level.FINE, "fine");
        logger.log(Level.INFO, "info");
        Box box = new Box();
        box.getCandy(lollipops1);
        box.getCandy(waffle);

        //Создать несколько объектов-конфет.
        System.out.println(lollipops1.getName() + " " + lollipops1.getCost());
        System.out.println(waffle.getName() + " " + waffle.getCost() + " " + waffle.getNumWaffle() + " " + waffle.getWeight());
        //Собрать детский подарок с определением его
        //веса.
        System.out.println(box.getCandyList());
        System.out.println(box.totalWeight());

        //Провести сортировку конфет в подарке на основе одного из параметров.
        //Найти конфету в подарке, соответствующую заданному диапазону
        //параметров.
        List<SweetsItem> list;
        list = box.getCandyList();
        list.stream().sorted(Comparator.comparing(SweetsItem::getCost).reversed())
                .filter(x -> x.getWeight() < 5.0).collect(Collectors.toList()).forEach(System.out::println);

        //or
        list.forEach(e -> System.out.println("Name: " + e.getName() + "\nWeight: " + e.getWeight() + "\nCost: " + e.getCost() + "\n"));


    }


}


//    public double totalCost() {
//        double cost = 0.0;
//        for (int i = 0; i < numberOfItems; i++) {
//            cost += itemArray[i].getCost();
//        }
//        return cost;
//    }


//    public Box() {
//        this.itemArray = new SweetsItem[100];
//    }

//    public void enterItem(SweetsItem newItem) {
//        itemArray[numberOfItems] = newItem;
//        numberOfItems++;
//    }