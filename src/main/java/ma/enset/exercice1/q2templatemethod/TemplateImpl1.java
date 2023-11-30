package ma.enset.exercice1.q2templatemethod;

public class TemplateImpl1 extends TemplateClass {
    @Override
    public double customStep1(int a, int b) {
        return a * b + Math.pow(a, b);
    }

    @Override
    public double customStep2(int a, int b) {
        return Math.max(a, b);
    }
}
