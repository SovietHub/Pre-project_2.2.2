package web.config.CarService;

import web.config.Car.Car;

import java.util.List;

public interface CarService {
     default List<Car> countCars(int numberOfCount) {
        return null;
    }
}

