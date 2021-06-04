package systems.vpklab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greetHome(){
        return "Hello Guest..Welcome..Home";
    }

    @GetMapping("/user")
    public String greetHome(@RequestParam String name){
        return "Hello "+name;
    }

    @GetMapping("/heath")
    public String health(@RequestParam String name){
        return "I am running"+ new Date();
    }
}
