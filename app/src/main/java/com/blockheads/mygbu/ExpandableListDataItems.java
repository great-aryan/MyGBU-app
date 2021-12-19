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
        List<String> ma101 = new ArrayList<String>();
        ma101.add("R. K. Jain and S.R.K Iyengar, Advance Engineering Mathematics");
        ma101.add("E. Kreyszig, Advance Engineering Mathematics");
        ma101.add("J. Stewart, Calculus");

        List<String> ph101 = new ArrayList<String>();
        ph101.add("H. K. Malik and A. K. Singh, Engineering Physics");
        ph101.add("Arthur Biser, Concepts of Modern Physics");
        ph101.add("K. K. Chattopadhyay and A. N. Banerjee, Introduction to Nanoscience and Nanotechnology");


        List<String> me101 = new ArrayList<String>();
        me101.add("A. Nelson, Engineering Mechanics, Statics and Dynamics");
        me101.add("Andrew Patel, Engineering Mechanics, Statics and Dynamics");
        me101.add("R. C. Hibbeler and Kai Beng Yap, Engineering Mechanics, Statics and Dynamics");
        me101.add("S. S. Bhavikatti, Mechanics of Solids");

        List<String> ee102 = new ArrayList<String>();
        ee102.add("D. P. Kothari, Basic Electrical Engineering");
        ee102.add("T. K. Nagsarkar, Basic Electrical Engineering");
        ee102.add(" V. N. Mittal, Basic Electrical Engineering");


        List<String> es101 = new ArrayList<String>();
        es101.add("Erach Bharucha, Textbook for Environmental Studies");
        es101.add("Environmental Ecology Biodiversity & Climate Change – Pratiyogita Darpan");
        es101.add("Environment and Ecology – Arihant");


        List<String> compro = new ArrayList<String>();
        compro.add("Fundamental of computer programming, Jarnail Singh");

        List<String> digielec = new ArrayList<String>();
        digielec.add("Digital Electronics book by D.A. Godse and A.P. Godse");
        digielec.add("Digital Electronics: An Introduction To Theory And Practice by William Gothmann H");


        List<String> datastruc = new ArrayList<String>();
        datastruc.add("Introduction to Algorithms, Thomas H. Cormen\n");
        datastruc.add("Algorithms, Robert Sedgewick and Kevin Wayne");

        // Fruits are grouped under Fruits Items. Similarly the rest two are under
        // Vegetable Items and Nuts Items respecitively.
        // i.e. expandableDetailList object is used to map the group header strings to
        // their respective children using an ArrayList of Strings.
        expandableDetailList.put("Engineering Mathematics", ma101);
        expandableDetailList.put("Engineering Physics", ph101);
        expandableDetailList.put("Basic Electrical Engineering", ee102);
        expandableDetailList.put("Environmental Studies", es101);
        expandableDetailList.put("Engineering Mechanics", me101);
        expandableDetailList.put("Data Structures and Algorithms", datastruc);
        expandableDetailList.put("Digital Electronics", digielec);
        expandableDetailList.put("Fundamentals of Computer Programming", compro);
        return expandableDetailList;
    }
}