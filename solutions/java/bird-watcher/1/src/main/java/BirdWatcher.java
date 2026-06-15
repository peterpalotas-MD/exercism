
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int n : this.birdsPerDay){
            if(n==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for(int i = 0; i <numberOfDays; i++){
            if(i>this.birdsPerDay.length-1){
                return total;
            }
            total+=this.birdsPerDay[i];
        }

        return total;
    }

    public int getBusyDays() {

        int totalBusyDays = 0;
        for(int n : this.birdsPerDay){
            if(n>=5){
                totalBusyDays++;
            }
        }
        return totalBusyDays;
    }
}
