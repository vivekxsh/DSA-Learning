package BackTracking;

public class findSubset {

    public static void subset(String str, String ans, int index) {

        // base case

        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // recursion

        // yes choice
        subset(str, ans + str.charAt(index), index + 1);

        // no choice
        subset(str, ans, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";

        subset(str, "", 0);

    }
}
