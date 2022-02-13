package org.bhaktimarga.mantrasharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MantraSharingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MantraSharingApplication.class, args);
    }
}