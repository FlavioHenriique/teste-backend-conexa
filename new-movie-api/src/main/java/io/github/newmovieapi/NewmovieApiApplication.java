package io.github.newmovieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NewmovieApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewmovieApiApplication.class, args);
    }

}
