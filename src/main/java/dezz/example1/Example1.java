package dezz.example1;

import dezz.example1.cars.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example1 {

    public static void main(String[] args)
    {

        List<CarAbstract> cars   = new ArrayList<CarAbstract>();
        Random                     random = new Random();

        for (int i = 0; i < 30; i++) {
            cars.add(new Mustang(random.nextDouble() * 300D, random.nextDouble() * 2D));
            cars.add(new Zaz(random.nextDouble() * 300D, random.nextDouble() * 2D));
            cars.add(new Lada(random.nextDouble() * 300D, random.nextDouble() * 2D));
        }

        for (CarAbstract car : cars) {
            System.out.println("Машина '" + car.name() + "' проехала со скоростью " + car.speed() + " за время '" + car.tripTime() + "' расстояние в '" + car.trip() + "' километров");
        }

    }

}
