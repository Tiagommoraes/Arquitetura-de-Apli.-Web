
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 

public class HelloController  {

    @GetMapping("/test")
        public String helloWorld() {
            return "Hello, World!";
        }
         
    @GetMapping("/users")
    public String usuario(@RequestParam String name) {
        return name + " Seja bem-vindo";
    }
   }