import java.util.Random;

public class Monopoly {
    private int currentPosition;

    public Monopoly(int startingPosition) {
        currentPosition = startingPosition;
    }

    public int throwDice(){
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
    public int advance(){
        int dice1 = throwDice();
        int dice2 = throwDice();
        currentPosition += dice1+dice2;
        if(dice1 == dice2){
            advance();
        }
        return currentPosition;
    }
}
