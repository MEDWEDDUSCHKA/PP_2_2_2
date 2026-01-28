package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.Carservise;

import java.util.List;


@Controller
public class CarController {

    private final Carservise carServise;
    public CarController(Carservise carservise) {
        this.carServise = carservise;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cars = carServise.getCars(count != null ? count : 5);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
