class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        speed += 20;
    }

    void print() {
        System.out.println("Bicycle class is created");
        System.out.println("Base Gear : " + getGear() + ", Base Speed : " + getSpeed());
    }
}