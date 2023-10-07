package Games;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GameHelper {
    private int[][] grid = new int[7][7];

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 || inputLine.length() != 2)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public List<String> getShipLcation() {
        // only horizontal locations
        List<String> location = new ArrayList();
        while (true) {

            int x = (int) (Math.random() * 5);
            int y = (int) (Math.random() * 5);

            if (grid[x][y] == 0) {
                grid[x][y] = grid[x + 1][y] = grid[x + 2][y] = 1;
                y++;
                location.add(((char) (x + 'A') + "") + y);
                x++;
                location.add(((char) (x + 'A') + "") + y);
                x++;
                location.add(((char) (x + 'A') + "") + y);
                break;
            }

        }

        return location;
    }
}
