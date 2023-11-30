package ma.enset.exercice2.application;


import ma.enset.exercice2.compression.templateMethod.ImageCompressionAlgorithm;
import ma.enset.exercice2.filtrage.strategy.services.FilterStrategy;

public class ImageFramework {
    private int[] image;
    private FilterStrategy filterStrategy;
    private ImageCompressionAlgorithm imageCompressionAlgorithm;


    public ImageFramework(int[] image) {
        this.image = image;
    }

    public void displayImage(int[] image) {
        System.out.println("\t\tDisplaying image... ");
        for (int i = 0; i < image.length; i++) {
            System.out.print(image[i] + " ");
        }
        System.out.println("\n\n");
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setImageCompressionAlgorithm(ImageCompressionAlgorithm imageCompressionAlgorithm) {
        this.imageCompressionAlgorithm = imageCompressionAlgorithm;
    }

    public FilterStrategy getFilterStrategy() {
        return filterStrategy;
    }

    public ImageCompressionAlgorithm getImageCompressionAlgorithm() {
        return imageCompressionAlgorithm;
    }
}
