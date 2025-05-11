class BicycleDemo {
    public static void main(String[] args) {
        Bicycle baseValues = new Bicycle(2, 40);
        RoadBike roadBike = new RoadBike(3, 50, 35);
        MountainBike mountainBike = new MountainBike(3, 60, 40);


        baseValues.print();
        roadBike.printStates();
        mountainBike.printStates();
    }
}