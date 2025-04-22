package com.example.rabbitmqdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(RabbitmqdemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("run Method called");
  }
}
