package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by david.wursteisen on 17/03/2015.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index", "hello", "Héllo le Wörld");
    }
}
