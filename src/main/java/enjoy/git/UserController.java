package enjoy.git;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devel
 */

@RestController
@EnableAutoConfiguration
public class UserController {
    @RequestMapping("/hello")
    public Object sayHello() {
        return "hello-13!";
    }
}

