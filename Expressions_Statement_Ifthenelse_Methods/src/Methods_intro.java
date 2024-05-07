public class Methods_intro {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("The highscore is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highscore is: " + calculateScore(gameOver, score, levelCompleted, bonus ) );
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if(gameOver == true) {
            finalScore = finalScore + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
        }
        return finalScore;
    }
}