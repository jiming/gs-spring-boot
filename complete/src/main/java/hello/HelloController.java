package hello;

import hello.service.OrderService;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    
    @RequestMapping("/")
    public String index() {
        userService.findUserById(111);
        orderService.queryOrderByUserId(11);
        return "Greetings from Spring Boot!";
    }
    
}
