public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        Coffee coffee2 = new SpecialCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        coffee2 = new MilkDecorator(coffee2);
        coffee2 = new SugarDecorator(coffee2);

        System.out.println("Description: " + coffee2.getDescription());
        System.out.println("Cost: $" + coffee2.getCost());
    }
}