package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car.Car;
import web.config.CarService.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

//Создайте еще один контроллер, замаппленный на /cars.
@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCount, ModelMap model) {
        //---------------Создайте список из 5 машин.---------------------//
        Car firstCar = new Car("UAZ", "AA111A", 326);
        Car secondCar = new Car("VAZ", "BB222B", 2130);
        Car thirdCar = new Car("UAZ", "CC333C", 452);
        Car fourthCar = new Car("Ural", "DD444D", 4320);
        Car fifthCar = new Car("GAZ", "EE555E", 66);

        List<Car> cars = new ArrayList<Car>();
        cars.add(firstCar);
        cars.add(secondCar);
        cars.add(thirdCar);
        cars.add(fourthCar);
        cars.add(fifthCar);
        //------------------------------------------------------------------//
        model.addAttribute("cars", CarServiceImpl.countCars(cars, numberOfCount));
        return "cars";
    }
}
