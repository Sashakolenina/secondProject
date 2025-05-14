package web.service.impl;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars() {
        List<Car> cars = Arrays.asList(
                new Car("Toyota Camry", "Black", 2025),
                new Car("BMW X5", "Black", 2024),
                new Car("Audi A6", "Red", 2023),
                new Car("Mercedes E-class", "Black", 2022),
                new Car("Lexus RX", "Silver", 2021));
        return cars;
    }

    public List<Car> getCarsByCount(int count) {
        List<Car> cars = getCars();
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
