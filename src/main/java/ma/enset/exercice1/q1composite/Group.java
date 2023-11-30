package ma.enset.exercice1.q1composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {
    public List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }


    @Override
    public double calculerAire() {
        double airTotale = 0;
        for (Figure figure : figures) {
            airTotale += figure.calculerAire();
        }
        return airTotale;
    }
}
