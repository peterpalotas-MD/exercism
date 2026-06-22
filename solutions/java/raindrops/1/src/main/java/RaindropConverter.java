class RaindropConverter {

    String convert(int number) {
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            return String.valueOf(number);
        }
        String output = "";

        if(number % 3 == 0) {
            output += "Pling";
        }if(number % 5 == 0) {
            output += "Plang";
        }if(number % 7 == 0) {
            output += "Plong";
        }
        return output;

    }

}
