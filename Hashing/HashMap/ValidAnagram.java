package Hashing.HashMap;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean vAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        if (vAnagram(s, t)) {
            System.out.println("String s-> " + s + " and String t-> " + " are an anagram.");
        } else {
            System.out.println("String s-> " + s + " and String t-> " + t + " are not an anagram.");
        }
    }
}
