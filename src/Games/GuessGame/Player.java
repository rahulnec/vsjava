package Games.GuessGame;
public class Player {
    String Name;
    int number;
    Player(String Name){
        this.Name = Name;

    }
    void guess(){
        number =  (int)(Math.random() * 10);
    }
}
