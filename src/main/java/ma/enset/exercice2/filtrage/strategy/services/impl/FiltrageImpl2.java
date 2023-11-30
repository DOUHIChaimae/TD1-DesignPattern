package ma.enset.exercice2.filtrage.strategy.services.impl;


import ma.enset.exercice2.filtrage.strategy.services.FilterStrategy;

public class FiltrageImpl2 implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        int[] filteredData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            filteredData[i] = data[i] + 10;
        }
        System.out.println("** FiltrageImpl2 **");
        return filteredData;
    }
}
