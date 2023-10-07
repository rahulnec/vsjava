import Games.SinkADotCom.SinkGame;

public class App {
    public static void main(String[] args) throws Exception {

 
        // sinking game
       SinkGame sg = new SinkGame();
       sg.setupGame();
       sg.startGame();

        
        int k = (int) Math.pow(100, 1.0 / 3.0);
        System.out.println(k);
        
    }
}
