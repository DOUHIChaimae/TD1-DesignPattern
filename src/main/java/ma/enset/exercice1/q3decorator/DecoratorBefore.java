package ma.enset.exercice1.q3decorator;

public class DecoratorBefore extends Decorator {
    public DecoratorBefore(Component component) {
        super(component);
    }

    @Override
    public void traitement() {
        System.out.println("Additional behavior before the processing");
    }
}
