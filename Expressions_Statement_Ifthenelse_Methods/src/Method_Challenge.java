public class Method_Challenge {
    public static void main(String[] args) {

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ralph", scorePosition);

        scorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Andre", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Arcinas", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Aviso", scorePosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the highs core list");
    }
    public static  int calculateHighScorePosition(int playerScore){
        int scoreResult;
        if(playerScore >= 1000){
            //System.out.println("Score greater than or equal to 1000");
            return scoreResult = 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)  ) {
            //System.out.println("Score greater than or equal to 500 but less than 1000");
            return scoreResult = 2;
        } else if ((playerScore >= 100) && (playerScore < 500)  ) {
            //System.out.println("Score greater than or equal to 100 but less than 500");
            return scoreResult = 3;
        }
        else return scoreResult = 4;
    }
}
