package ma.enset.exercice2.filtrage.adapter;

public class ImplNonStandard {
    public int[] applyFilter(String filterName, int[] data) {
        int[] filteredData = new int[data.length];
        if ("filterAdapter".equals(filterName)) {
            for (int i = 0; i < data.length; i++) {
                filteredData[i] = data[i] * 2;
            }
        } else {
            filteredData = data.clone();
        }

        return filteredData;
    }
}
