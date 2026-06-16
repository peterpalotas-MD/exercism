public class EliudsEggs {

    public int eggCount(int number) {
        int eggsCount = 0;
        while(number > 0) {
            int exponent = (int) (Math.log(number) / Math.log(2));
            number= (int) (number-Math.pow(2,exponent));
            eggsCount++;
        }
        return eggsCount;
    }
}
