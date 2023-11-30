package ma.enset.exercice2.compression.templateMethod;

public class CustomImageCompressionAlgorithm1 extends ImageCompressionAlgorithm {
    @Override
    protected int[] preprocess(int[] data) {
        int[] preprocessedData = new int[data.length / 2];
        for (int i = 0; i < data.length; i += 2) {
            preprocessedData[i / 2] = data[i];
        }
        return preprocessedData;
    }

    @Override
    protected int[] performCompression(int[] data) {
        int[] compressedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            compressedData[i] = data[i] / 2;
        }
        return compressedData;
    }

    @Override
    protected int[] postprocess(int[] data) {
        int[] postprocessedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            postprocessedData[i] = data[i] + 20;
        }
        return postprocessedData;
    }
}
