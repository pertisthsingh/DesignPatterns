package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListCollection {

    public List<Integer> createArrayList(int ...args) {
        List<Integer> list = new ArrayList<>();
        for(int i : args) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> createLinkedList(int... args) {
        List<Integer> list = new LinkedList<>();
        for(int i : args) {
            list.add(i);
        }
        return list;
    }

}
