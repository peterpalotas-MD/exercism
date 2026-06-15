class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (this.battery < this.batteryDrain);
    }

    public int distanceDriven() {
        return this.distance;
    }
    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }


    public void drive() {

        if((this.battery >= this.batteryDrain)){
            this.battery-=this.batteryDrain;
            this.distance+= this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitroCar = new NeedForSpeed(50,4);
        return nitroCar;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100/car.getBatteryDrain();
        int maxDistance = maxDrives * car.getSpeed();

        return this.distance <= maxDistance;
    }
}
