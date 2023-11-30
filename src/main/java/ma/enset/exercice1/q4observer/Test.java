package ma.enset.exercice1.q4observer;

public class Test {
    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        Camera camera = new Camera();
        Couloir couloir = new Couloir();
        Gardien gardien = new Gardien();

        joueur.subscribe(camera);
        joueur.subscribe(couloir);
        joueur.subscribe(gardien);

        joueur.setScore(19);
    }


}
