package mainPac;

import candys.SweetsItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import java.util.stream.Collectors;

public class Box {
    //    private int numberOfItems = 0;
    private List<SweetsItem> candyList = new ArrayList<>();

    //    private SweetsItem[] itemArray;

    private List<SweetsItem> getCandyList() {
        return candyList;
    }

    void getCandy(SweetsItem sweetsItem) {
        candyList.add(sweetsItem);
    }


    public void clear() {
        getCandyList().clear();

    }

//    public int numberOfItems() {
//        return numberOfItems;
//    }

    double totalCost() {
        double cost = 0.0;
        for (SweetsItem candy : candyList
        ) {
            cost += candy.getWeight();
        }
        return cost;
    }

    double totalWeight() {
        double weight = 0.0;
        for (SweetsItem candy : candyList
        ) {
            weight += candy.getWeight();
        }
        System.out.println("Total weight of the box:");
        return weight;
    }

    void filterList() {
        candyList.stream().sorted(Comparator.comparing(SweetsItem::getCost).reversed())
                .filter(x -> x.getWeight() < 1.0).collect(Collectors.toList()).forEach(System.out::println);
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