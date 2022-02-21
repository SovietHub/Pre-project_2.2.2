package web.config.CarService;

import org.springframework.stereotype.Service;
import web.config.Car.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    //Создайте сервис с методом, который
    // будет возвращать указанное число машин из созданного списка.
    public static List<Car> countCars(List<Car> cars, int numberOfCount) {
        if ((numberOfCount >= 5)||(numberOfCount <= 0)) {
            return cars;
        } else {
            return cars.stream()
                    .limit(numberOfCount)
                    .toList();
        }
    }
}
