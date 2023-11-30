package ma.enset.exercice1.q2templatemethod;

public class Test {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateImpl1();
        System.out.println(templateClass.calculateResult(2, 6));
    }
}
