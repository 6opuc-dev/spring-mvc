package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    public static void setCars() {
        cars.add(new Car("BMW" , 3, 2001));
        cars.add(new Car("Mercedes" , 4, 2004));
        cars.add(new Car("BMW" , 5, 2003));
        cars.add(new Car("Toyota" , 1, 2010));
        cars.add(new Car("Zhigul" , 1, 1991));
        cars.add(new Car("Lada" , 9, 1998));
    }

    public static List<Car> getCars(int carsCount) {
        if (cars.size() == 0) {
            CarService.setCars();
        }
        if (carsCount <= 5) {
            return cars.stream().limit(carsCount).collect(Collectors.toList());
        }
        return cars;
    }
    public static List<Car> getCars() {
        if (cars.size() == 0) {
            CarService.setCars();
        }
        return cars;
    }
}
