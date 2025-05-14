import java.util.*;

class FactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Bicycle countsOfBikes = BicycleFactory.selectBicycle(input);
        countsOfBikes.totalCount();
    }
}