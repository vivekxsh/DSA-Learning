package Trie;

public class CountUniqueSubstring {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();
    static int count = 0;

    static void insert(String word) {

        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                count++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void main(String[] args) {

        String str = "ab";

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                insert(str.substring(i, j));
            }
        }

        // we need to include an empty string ("") also so we have to add 1 into count;
        System.out.println(count + 1);
    }
}
