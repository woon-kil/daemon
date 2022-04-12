package com.example.deemon;

import com.example.deemon.listener.BootListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeemonApplication {

    public static void main(String[] args) {

        //SpringApplication.run(DeemonApplication.class, args);
        SpringApplication app = new SpringApplication(DeemonApplication.class);
        app.addListeners(new BootListener());
        app.run(args);
    }

}
