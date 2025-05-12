class BicycleFactory {
    public static Bicycle selectBicycle(String input) {
        switch(input) {
            case "electric" :
                return new ElectricBicycle();
            case "petrol" :
                return new PetrolBicycle();
            default:
                throw new IllegalArgumentException("Unknown bicycle type: " + input);
        }
    }
}