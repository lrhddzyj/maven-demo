package com.hyxt.maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenResourcesDemopApplication implements CommandLineRunner {

    @Value("${tt.name}")
    private String ttName;

    public static void main(String[] args) {
        SpringApplication.run(MavenResourcesDemopApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        System.out.println(ttName);
    }
}
