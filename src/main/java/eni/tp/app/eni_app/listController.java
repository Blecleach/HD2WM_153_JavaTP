package eni.tp.app.eni_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class listController {

    @GetMapping("Liste")
    public String list() {

        return "movies-list";
    }
}
