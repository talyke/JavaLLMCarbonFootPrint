package src.java.main.com.example.webplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebPlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebPlayerApplication.class, args);
    }
}

@RestController
class WebPlayerController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is your mini web player!";
    }
}