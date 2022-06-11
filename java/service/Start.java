package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


class Start {
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Initialize.class);
    }
}

@SpringBootApplication
class Initialize{
    
}

@RestController
class Sample{
    @RequestMapping("/sample")
    String m1(){return "Welocome";}
}