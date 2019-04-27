import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {

        return "Hello World! 小王修改了，小李又修改了";

    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }


}
