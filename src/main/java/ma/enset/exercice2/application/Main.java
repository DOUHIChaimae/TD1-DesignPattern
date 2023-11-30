package ma.enset.exercice2.application;


import ma.enset.exercice2.compression.templateMethod.CustomImageCompressionAlgorithm1;
import ma.enset.exercice2.compression.templateMethod.CustomImageCompressionAlgorithm2;
import ma.enset.exercice2.compression.templateMethod.ImageCompressionAlgorithm;
import ma.enset.exercice2.filtrage.adapter.FiltrageAdapter;
import ma.enset.exercice2.filtrage.strategy.services.FilterStrategy;
import ma.enset.exercice2.filtrage.strategy.services.impl.FiltrageImpl1;
import ma.enset.exercice2.filtrage.strategy.services.impl.FiltrageImpl2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] image = {1, 2, 3, 4};

        ImageFramework imageFramework = new ImageFramework(image);

        FilterStrategy filter1 = new FiltrageImpl1();
        FilterStrategy filter2 = new FiltrageImpl2();
        FilterStrategy filter3 = new FiltrageAdapter();

        ImageCompressionAlgorithm compress1 = new CustomImageCompressionAlgorithm1();
        ImageCompressionAlgorithm compress2 = new CustomImageCompressionAlgorithm2();

        System.out.println("Real image...");
        imageFramework.displayImage(image);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the filtering implementation (1, 2, 3)");
        int filteredImage = scanner.nextInt();

        switch (filteredImage) {
            case 1:
                imageFramework.setFilterStrategy(filter1);
                break;
            case 2:
                imageFramework.setFilterStrategy(filter2);
                break;
            case 3:
                imageFramework.setFilterStrategy(filter3);
                break;
            default:
                break;
        }

        System.out.println("\nFiltered image...\n");
        int[] imageFiltre = imageFramework.getFilterStrategy().filter(image);
        imageFramework.displayImage(imageFiltre);

        System.out.println("Choose the compression implementation (1, 2 ) :");
        int choixCompression = scanner.nextInt();

        switch (choixCompression) {
            case 1:
                imageFramework.setImageCompressionAlgorithm(compress1);
                break;
            case 2:
                imageFramework.setImageCompressionAlgorithm(compress2);
                break;
            default:
                break;
        }

        System.out.println("\nCompressed image...\n");
        int[] compressedImage = imageFramework.getImageCompressionAlgorithm().compress(image);
        imageFramework.displayImage(compressedImage);

        scanner.close();
    }
}
