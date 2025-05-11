class MountainBike extends Bicycle {
    private int mileage;

    public MountainBike(int gear, int speed, int mileage) {
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
        System.out.println("Mileage of mountain bikes are " + getMileage());
    }
}