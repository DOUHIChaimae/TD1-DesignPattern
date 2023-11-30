package ma.enset.exercice1.q3decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ComponentImpl();
        component = new DecoratorBefore(new DecoratorAfter(component));
        component.traitement();
    }
}
