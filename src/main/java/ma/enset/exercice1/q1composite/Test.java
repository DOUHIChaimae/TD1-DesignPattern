package ma.enset.exercice1.q1composite;

public class Test {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(3.0);
        Rectangle rectangle = new Rectangle(2.0, 5.0);

        Group group = new Group();
        group.addFigure(cercle);
        group.addFigure(rectangle);
        System.out.println("Aire du cercle : " + cercle.calculerAire());
        System.out.println("Aire du rectangle : " + cercle.calculerAire());
        System.out.println("Aire total : " + group.calculerAire());
    }
}
