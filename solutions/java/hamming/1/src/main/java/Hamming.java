public class Hamming {

    int hammingDistance = 0;
    public Hamming(String leftStrand, String rightStrand) {
        char[] leftArray = leftStrand.toCharArray();
        char[] rightArray = rightStrand.toCharArray();

        if(leftArray.length != rightArray.length) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        for(int i = 0; i <leftArray.length; i++){
            if(leftArray[i] != rightArray[i]){
                hammingDistance++;
            }
        }
    }


    public int getHammingDistance() {
        return hammingDistance;
    }
}
