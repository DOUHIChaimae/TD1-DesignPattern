package ma.enset.exercice1.q4observer;

public class Camera implements Observer {
    @Override
    public void update(Observable observable) {
        int score = ((Joueur) observable).getScore();
        displayUpdatedScore(score);
        double result = calculateResult(score);
        handleResult(result);
    }

    private static void displayUpdatedScore(int score) {
        System.out.println("** Camera **");
        System.out.println("Player's score has changed to: " + score);
    }

    private double calculateResult(int score) {
        return Math.pow(score, score) * 21;
    }

    private void handleResult(double result) {
        if (result > 100) {
            zoomInForCloseup();
        } else if (result > 50) {
            captureStandardShot();
        } else {
            noAdditionalActionRequired();
        }
    }

    private void zoomInForCloseup() {
        System.out.println("High score detected! Zooming in for a close-up shot.");
    }

    private void captureStandardShot() {
        System.out.println("Moderate score detected. Capturing a standard shot.");
    }

    private void noAdditionalActionRequired() {
        System.out.println("Low score. No additional action required in the camera.");
    }
}
