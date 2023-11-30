package ma.enset.exercice1.q2templatemethod;

public abstract class TemplateClass {
    public double calculateResult(int x, int y) {
        double comp = 0;
        double result1 = customStep1(x, y);
        double result2 = customStep2(x, y);
        comp++;
        return comp * (result1 + result2);
    }

    protected abstract double customStep1(int a, int b);

    protected abstract double customStep2(int a, int b);

}
