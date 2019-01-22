package strommaaler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableResourceServer
@RestController
public class StrommaalerApplication {
   // private static final Logger LOGGER = LoggerFactory.getLogger(StrommaalerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StrommaalerApplication.class, args);
//        new SpringApplicationBuilder(Application.class)
//                .bannerMode(Banner.Mode.CONSOLE)
//                .run(args);
    }

    @GetMapping("/mod")
    public String getMessageOfTheDay(Principal principal) {
        return "The message of the day is boring for user: " + principal.getName();
    }
}
