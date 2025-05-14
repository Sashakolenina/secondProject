package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.impl.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showCars(@RequestParam(required = false, defaultValue = "5") int count,
                           Model model) {
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
