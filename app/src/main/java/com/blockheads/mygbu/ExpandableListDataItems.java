package com.blockheads.mygbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        // As we are populating List of fruits, vegetables and nuts, using them here
        // We can modify them as per our choice.
        // And also choice of fruits/vegetables/nuts can be changed
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("Papaya");
        fruits.add("Pineapple");

        List<String> vegetables = new ArrayList<String>();
        vegetables.add("Engineering Mathematics");
        vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Cabbage");
        vegetables.add("Cauliflower");

        List<String> nuts = new ArrayList<String>();
        nuts.add("Cashews");
        nuts.add("Badam");
        nuts.add("Pista");
        nuts.add("Raisin");
        nuts.add("Walnut");

        // Fruits are grouped under Fruits Items. Similarly the rest two are under
        // Vegetable Items and Nuts Items respecitively.
        // i.e. expandableDetailList object is used to map the group header strings to
        // their respective children using an ArrayList of Strings.
        expandableDetailList.put("Fruits Items", fruits);
        expandableDetailList.put("Vegetable Items", vegetables);
        expandableDetailList.put("Nuts Items", nuts);
        return expandableDetailList;
    }
}