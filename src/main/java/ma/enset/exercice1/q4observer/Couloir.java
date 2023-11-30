package ma.enset.exercice1.q4observer;

public class Couloir implements Observer {
    @Override
    public void update(Observable observable) {
        int score = ((Joueur) observable).getScore();
        displayUpdatedScore(score);
        handleScore(score);
    }

    private static void displayUpdatedScore(int score) {
        System.out.println("** Couloir **");
        System.out.println("Player's score has changed to: " + score);
    }

    private void handleScore(int score) {
        if (score > 75) {
            displayHighScoreMessage();
        } else {
            displayNormalScoreMessage();
        }
    }

    private void displayHighScoreMessage() {
        displayMessage("High score achieved! Lights are flashing.");
    }

    private void displayNormalScoreMessage() {
        displayMessage("Normal score. Lights remain steady.");
    }

    private void displayMessage(String message) {
        System.out.println(message);
    }
}
