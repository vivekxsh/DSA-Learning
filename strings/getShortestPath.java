package strings;

public class getShortestPath {

    static float shortestPath(String str) {

        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char path = str.charAt(i);

            // south
            if (path == 'S') {
                y--;
            }
            // North
            else if (path == 'N') {
                y++;
            }
            // West
            else if (path == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int x2 = x * x, y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float shortPath = shortestPath(path);

        System.out.println("Shortest path is: " + shortPath);

    }
}
