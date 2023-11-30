package ma.enset.exercice1.q4observer;


public class Gardien implements Observer {
    @Override
    public void update(Observable observable) {
        int score = ((Joueur) observable).getScore();
        displayUpdatedScore(score);

        if (score >= 100) {
            triggerSecurityAlert("High score detected!");
        } else if (score < 0) {
            triggerSecurityAlert("Negative score detected!");
        } else {
            System.out.println("No action necessary for the current score.");
        }
    }

    private static void displayUpdatedScore(int score) {
        System.out.println("** Gradien **");
        System.out.println("Player's score has changed to: " + score);
    }

    private void triggerSecurityAlert(String message) {
        System.out.println("SECURITY ALERT: " + message);
    }
}

