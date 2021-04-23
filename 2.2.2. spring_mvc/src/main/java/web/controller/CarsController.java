package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false)  Integer count, ModelMap model) {
        if( count != null) {
            model.addAttribute("cars", CarService.getCars(count));
        } else {
            model.addAttribute("cars", CarService.getCars());
        }
        return "cars";
    }

}
