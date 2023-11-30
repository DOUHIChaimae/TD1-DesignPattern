package ma.enset.exercice1.q3decorator;

public class DecoratorAfter extends Decorator {
    public DecoratorAfter(Component component) {
        super(component);
    }

    @Override
    public void traitement() {
        System.out.println("Additional behavior after the processing");
    }
}
