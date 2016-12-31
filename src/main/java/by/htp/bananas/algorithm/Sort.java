package by.htp.bananas.algorithm;

import by.htp.bananas.entity.Banana;

import java.util.List;

/**
 * Created by Ark on 31.12.2016.
 */
public class Sort {
    public static void descending(List<Banana> list) {
        for(int i = 0; i < list.size() - 1; ++i) {
            for (int j = i + 1; j < list.size(); ++j) {
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    Banana banana = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, banana);
                }
            }
        }
    }
}
