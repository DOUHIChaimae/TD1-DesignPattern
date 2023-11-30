package ma.enset.exercice2.compression.templateMethod;

public abstract class ImageCompressionAlgorithm {
    public int[] compress(int[] data) {
        int[] preprocessedData = preprocess(data);

        int[] compressedData = performCompression(preprocessedData);

        int[] postprocessedData = postprocess(compressedData);

        return postprocessedData;
    }

    protected abstract int[] preprocess(int[] data);

    protected abstract int[] performCompression(int[] data);

    protected abstract int[] postprocess(int[] data);

}
