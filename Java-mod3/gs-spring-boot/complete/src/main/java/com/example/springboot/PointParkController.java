package com.example.springboot;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Configuration
public class PointParkController {

	@RequestMapping("/point")
    public String point(){
        return "Welcome to Bison Country";
    }

    @RequestMapping("/winner")
    public String winner(){
        return "I think the 49ers will win";
    }

    @RequestMapping("/score")
    public String score(){
        return "The score will be 24-21";
    }

    @RequestMapping("/bowl")
    public String bowl(){
        return "Chiefs vs 49ers! Who will win";
    }

    @RequestMapping("/opinion")
    public String opinion(){
        String wins = "Chiefs";

        if (wins == "Chiefs"){
            return "The winner could be the Chiefs";
        } else {
            return "Winner could be the 49ers";
        }
    };
}

