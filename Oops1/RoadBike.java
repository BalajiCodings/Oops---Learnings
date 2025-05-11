class RoadBike extends Bicycle {
    private int mileage;

    public RoadBike(int gear, int speed, int mileage) {
        super(gear, speed);
        this.mileage = mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void printStates() {
        System.out.println("Mileage of a road bike is " + getMileage());
    }

}