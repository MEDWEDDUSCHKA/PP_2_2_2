package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarServise;

import java.util.List;


@Controller
public class CarController {

    private final CarServise carServise;
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cars = carServise.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
