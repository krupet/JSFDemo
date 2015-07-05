package ua.com.krupet.car;

import ua.com.krupet.car.CarDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krupet on 05.07.2015.
 */
public class CarImpl implements CarDao {
    @Override
    public List<String> getCarDetails() {
        List<String> cars = new ArrayList<String>();

        cars.add(0, "Santro");
        cars.add(1, "Zen");
        cars.add(2, "Alto");
        cars.add(3, "Qualis");
        cars.add(4, "Innova");

        for (String c : cars) {
            System.out.println(c);
        }

        return cars;
    }
}
