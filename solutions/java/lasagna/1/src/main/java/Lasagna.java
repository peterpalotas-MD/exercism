public class Lasagna {

    public static int expectedMinutesInOven(){
        return 40;
    }
    public static int remainingMinutesInOven(int timeInOven){
        return expectedMinutesInOven()-timeInOven;
    }
    public static int preparationTimeInMinutes(int numOfLayers){
        return numOfLayers*=2;

    }

    public static int totalTimeInMinutes(int numLayers, int numMinutes){
        return preparationTimeInMinutes(numLayers)+(numMinutes);

    }
}
