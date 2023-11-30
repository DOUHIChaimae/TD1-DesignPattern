package ma.enset.exercice1.q4observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements Observable {
    private int score;
    private List<Observer> observers;

    public Joueur() {
        score = 0;
        observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.notifyObservers();
    }

}