package strommaaler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrommaalerApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(StrommaalerApplication.class);

    public static void main(String[] args)  {
        SpringApplication.run(StrommaalerApplication.class, args);
//        new SpringApplicationBuilder(Application.class)
//                .bannerMode(Banner.Mode.CONSOLE)
//                .run(args);
    }
}
