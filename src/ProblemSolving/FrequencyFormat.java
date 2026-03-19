package ProblemSolving;

import java.util.*;

public class FrequencyFormat {
    public static String getFrequencyFormat(String str) {
        Map<Character,Integer> mpp = new HashMap<>();
        for(char ch : str.toCharArray()) {
            int count = mpp.getOrDefault(ch, 0);
            mpp.put(ch, count + 1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a,b) -> {
            if(!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey() - b.getKey();
        });

        StringBuilder newString = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list) {
            newString.append(entry.getKey()).append(entry.getValue());
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        String str = "abcbbddabdcbdaec";
        System.out.println(getFrequencyFormat(str));
    }
}
