import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class NaturalNumber {

    long sumOfDivisors=0;
    Set<Integer> divisors = new HashSet<>();
    long number;

    NaturalNumber(int number) {
        this.number = number;
        if(number<=0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }
        divisors.remove(number);
        sumOfDivisors = divisors.stream().mapToInt(Integer::intValue).sum();
    }

    Classification getClassification() {
        if (sumOfDivisors==number)
            return Classification.PERFECT;
        else if (sumOfDivisors < number) {
            return Classification.DEFICIENT;
        }
        else return Classification.ABUNDANT;
    }
}
