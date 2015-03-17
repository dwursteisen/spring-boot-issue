package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by david.wursteisen on 17/03/2015.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
