package Games.GuessGame;

public class GuessGame {
    Player p1,p2,p3;
    int num;
    

    public void start(){
        p1= new Player("P1");
        p2 = new Player("P2");
        p3 = new Player("P3");

        System.out.println("Let's start the guessing game");
        int guessP1=0,guessP2 = 0, guessP3 = 0;
        boolean p1IsRight = false, p2IsRight = false, p3IsRight = false;
        while(true){
            System.out.println("Players are guessing there numbers");
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            guessP2 = p2.number;
            guessP3 = p3.number;
            num = (int)(Math.random()*10);
            if(num==guessP1)
            p1IsRight=true;
            else if(num==guessP2)
            p2IsRight = true;
            else if(num==guessP3)
            p3IsRight=true;

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("we got a match");

                System.out.println("Guessed number was "+num);
                System.out.println("Player 1 guessed "+guessP1);
                System.out.println("Player 2 guessed "+guessP2);
                System.out.println("Player 3 guessed "+guessP3);
                break;
            }
            else{
                System.out.println("Players  need to guess again not one matched");
            }

        }
    }

}
