package web.config.CarService;

import org.springframework.stereotype.Service;
import web.config.Car.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    //Создайте сервис с методом, который
    // будет возвращать указанное число машин из созданного списка.
    public List<Car> countCars(int numberOfCount) {

        Car firstCar = new Car("UAZ", "AA111A", 326);
        Car secondCar = new Car("VAZ", "BB222B", 2130);
        Car thirdCar = new Car("UAZ", "CC333C", 452);
        Car fourthCar = new Car("Ural", "DD444D", 4320);
        Car fifthCar = new Car("GAZ", "EE555E", 66);

        List<Car> cars = new ArrayList<>(); // список машин, лежащий в сервисе
        cars.add(firstCar);
        cars.add(secondCar);
        cars.add(thirdCar);
        cars.add(fourthCar);
        cars.add(fifthCar);

        //Бизнес-логика метода по получению нужного числа машин
        if ((numberOfCount >= 5) || (numberOfCount <= 0)) {
            return cars;
        } else {
            return cars.stream()
                    .limit(numberOfCount)
                    .toList();
        }
    }
}
