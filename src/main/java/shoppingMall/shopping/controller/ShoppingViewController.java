package shoppingMall.shopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingViewController {

    @RequestMapping("/shopping")
    public String home() {
        return "home";
    }
}
