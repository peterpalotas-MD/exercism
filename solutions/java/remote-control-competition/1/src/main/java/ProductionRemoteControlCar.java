class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled;
    private int numberOfVictories;
    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if(this.numberOfVictories < o.getNumberOfVictories()) {
            return 1;
        }else if(this.numberOfVictories > o.getNumberOfVictories()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("ProductionRemoteControlCar [numberOfVictories=%s]", numberOfVictories);
    }
}
