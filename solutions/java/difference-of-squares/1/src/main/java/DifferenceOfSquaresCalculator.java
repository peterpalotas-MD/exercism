class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = (input*(input+1))/2;
        return (int)Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        return (input*(input+1)*((2*input)+1))/6;
    }

    int computeDifferenceOfSquares(int input) {

        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
