package eni.tp.app.eni_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class detailController {

    @GetMapping("Détail")
    public String detail() {

        return "movie-detail";
    }
}