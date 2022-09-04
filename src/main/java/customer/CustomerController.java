package customer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
    public class CustomerController {

            @GetMapping("/customer")

            Customer all(){
                return new Customer ("Abishek", "abishek@gmail.com");
            }
    }
