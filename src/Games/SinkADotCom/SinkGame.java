package Games.SinkADotCom;

import java.util.ArrayList;
import java.util.List;

import Games.GameHelper;

public class SinkGame {
    private GameHelper gameHelper;
    private List<Ship> ships;
    private int score = 0;

    public void setupGame() {
        // setup three random corrdinates;
        System.out.println("Setting up the game");
        gameHelper = new GameHelper();

        setUpShips();
        System.out.println("Your Goal -> To sink all the three ships");
        
    }

    public void startGame() {

        System.out.println("Starting the sinking game");
        try {

            while (!ships.isEmpty()) {
                score++;
                String userInput = gameHelper.getUserInput("enter the numbers ");
                if (userInput == null) {
                    System.out.println("Wrong Input please give any try");
                    continue;
                }
                String result = checkTheHit(userInput);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        finishGame();
    }

    private void finishGame() {
        System.out.println("Score : " + score);
        System.out.println("game is finished, thankyou for playing!!!!");

    }

    private void setUpShips() {
        ships = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ship s = new Ship("Ship" + i);
            s.setLocationGrid(gameHelper.getShipLcation());
            ships.add(s);
        }
    }

    private String checkTheHit(String userInput) {
        String result = "Miss";

        for (Ship s : ships) {
            result = s.checkIfHitOrMiss(userInput);
            if ("Hit".equals(result)) {
                System.out.println("Bingo Hit the ship " + s.getName() + " nice!!!!!");
                break;

            }
            else if("Kill".equals(result)){
                System.out.println("Kill Shot ship "+s.getName()+" is sunked");
                ships.remove(s);
                break;

            }
        }
        return result;
    }
}
