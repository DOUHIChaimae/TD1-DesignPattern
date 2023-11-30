package ma.enset.exercice2.compression.templateMethod;

public class CustomImageCompressionAlgorithm2 extends ImageCompressionAlgorithm {
    @Override
    protected int[] preprocess(int[] data) {
        int[] preprocessedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            preprocessedData[i] = data[i] - 1;
        }
        return preprocessedData;
    }

    @Override
    protected int[] performCompression(int[] data) {
        int[] compressedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            compressedData[i] = data[i] / 3;
        }
        return compressedData;
    }

    @Override
    protected int[] postprocess(int[] data) {
        int[] postprocessedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            postprocessedData[i] = data[i] + 17;
        }
        return postprocessedData;
    }
}
