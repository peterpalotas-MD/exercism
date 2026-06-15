import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int starting = numberToCheck;
        int power = String.valueOf(numberToCheck).length();
        List<Double> numbers = new ArrayList<>();
        while (numberToCheck>0){
            numbers.add( Math.pow((numberToCheck%10), power));
            numberToCheck/=10;

        }
        return numbers.stream().map(i->(int) Math.round(i)).mapToInt(i -> i).sum()==starting;
    }

}
