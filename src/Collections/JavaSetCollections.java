package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetCollections {

    // duplicate is removed.... no order is maintained
    public Set<Integer> createSet(int... args) {
        Set<Integer> set = new HashSet<>();
        for(int i : args) {
            set.add(i);
        }
        return set;
    }

    // duplicate is removed... insertion order is maintained
    public Set<Integer> createLinkedHashset(int ...args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for(int i : args) {
            hashSet.add(i);
        }
        return hashSet;
    }

    // duplicate is removed... sorted order is maintained
    public Set<Integer> createTreeset(int ...args) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : args) {
            set.add(i);
        }
        return set;
    }
}
