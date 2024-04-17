import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}