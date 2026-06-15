public class JedliksToyCar {

    public int metersDriven = 0;
    public int batteryPercent = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar j = new JedliksToyCar();
        return j;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {
        if (batteryPercent==0){
            return "Battery empty";
        }
        return String.format( "Battery at %d%s", batteryPercent, "%");
    }

    public void drive() {
        if(batteryPercent>0) {
            metersDriven += 20;
            batteryPercent -= 1;
        }
    }
}
