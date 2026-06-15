class Darts {
    int score(double xOfDart, double yOfDart) {
        double powX = Math.pow(xOfDart, 2);
        double powY = Math.pow(yOfDart, 2);

        double total = powX+powY;

        if(total <= 1){
            return 10;
        }else if(total <= 25){
            return 5;
        } else if (total <= 100) {
            return 1;
        }
        return 0;


    }
}
