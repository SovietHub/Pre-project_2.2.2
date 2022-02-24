package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.CarService.CarService;

//Создайте еще один контроллер, замаппленный на /cars.
@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCount, ModelMap model) {
        model.addAttribute("cars", carService.countCars(numberOfCount)); // обращение к методу сервиса для получения машин
        // с входным параметром "count"(numberOfCount)
        return "cars";
    }
}
