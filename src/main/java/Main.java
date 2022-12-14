import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat", 120, 45000, 3));
        cars.add(new Car("Porsche", 300, 250000, 8));
        cars.add(new Car("Mercedes", 280, 200000, 7));
        cars.add(new Car("Ford", 220, 120000, 5));
        cars.add(new Car("Kia", 200, 80000, 4));

        List<Car> threeItems = cars.stream().filter(car -> car.price < 250000)
                .limit(3).collect(Collectors.toList());
        System.out.println(threeItems);
    }
}
