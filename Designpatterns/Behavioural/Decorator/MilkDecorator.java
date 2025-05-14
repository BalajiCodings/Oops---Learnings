public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Add milk";
    }

    public double getCost() {
        return coffee.getCost() + 1.5;
    }

}