package mainPac;

import candys.SweetsItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    //Class for collect New Year's gift and made operations with it

class Box {

    void setCandyList(List<SweetsItem> candyList) {
        this.candyList = candyList;
    }

    private List<SweetsItem> candyList = new ArrayList<>();

    List<SweetsItem> getCandyList() {
        return candyList;
    }

    double totalCost() {
        double cost = 0.0;
        for (SweetsItem candy : candyList
        ) {
            cost += candy.getCost();
        }
        return cost;
    }

    double totalWeight() {
        double weight = 0.0;
        for (SweetsItem candy : candyList
        ) {
            weight += candy.getWeight();
        }
        return weight;
    }

    void sortList() {
        candyList = candyList.stream().sorted(Comparator.comparing(SweetsItem::getCost).reversed()).collect(Collectors.toList());
        candyList.forEach(System.out::println);
    }

    void filterList() {
        candyList = candyList.stream().filter(x -> x.getWeight() > 0.1).collect(Collectors.toList());
        candyList.forEach(System.out::println);
    }

}

