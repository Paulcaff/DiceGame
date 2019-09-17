public class DieGame {

    public static void main(String[] args) {
        //create die 1 and roll
        Die die1 = new Die();
        die1.roll();

        //create die 2 and roll
        Die die2 = new Die();
        die2.roll();

        System.out.println(die1.getFaceValue());
        System.out.println(die2.getFaceValue());

        if(die1.getFaceValue() + die2.getFaceValue() == 7){
            System.out.println("You win");
        }
        else
            System.out.println("You Lose");
    }
}
