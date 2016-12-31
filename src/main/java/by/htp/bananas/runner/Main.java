package by.htp.bananas.runner;

import by.htp.bananas.algorithm.Sort;
import by.htp.bananas.entity.Banana;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ark on 27.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Banana> list = new LinkedList<>();

        list.add(new Banana(9, "normal"));
        list.add(new Banana(7, "bad"));
        list.add(new Banana(12, "awful"));
        list.add(new Banana(8, "normal"));
        list.add(new Banana(10, "good"));
        list.add(new Banana(9, "normal"));
        list.add(new Banana(10, "best"));
        list.add(new Banana(7, "normal"));
        list.add(new Banana(12, "best"));
        list.add(new Banana(10, "normal"));
        list.add(new Banana(8, "good"));
        list.add(new Banana(10, "bad"));

        for(Banana banana : list)
            System.out.println(banana.toString());
        System.out.println();

        Sort.descending(list);
        for(Banana banana : list)
            System.out.println(banana.toString());
        System.out.println();

        Collections.sort(list);
        for(Banana banana : list)
            System.out.println(banana.toString());
        System.out.println();

    }
}
