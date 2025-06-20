package strings;

public class substr {

    public static String substring(String str, int si, int ei) {
        String subStr = "";

        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }

        return subStr;

    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        str = substring(str, 0, 5);
        System.out.println(str);
    }
}
