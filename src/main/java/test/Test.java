package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hellofan
 */
@Controller
@SpringBootApplication
@Configuration
public class Test {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }

    public static void main(String[] args) {

        int a=2;
        System.out.println(3<<a);

        Bean jack = new Bean();


        System.out.println(jack.getName());
    }
}
