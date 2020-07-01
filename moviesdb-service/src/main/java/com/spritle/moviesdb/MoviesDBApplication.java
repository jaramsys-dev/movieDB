/**
 * Application Class for moviesDB
 * Create by Janarthanam 29/06/2020
 **/
package com.spritle.moviesdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spritle.moviesdbcore")
public class MoviesDBApplication {
  public static void main(String[] args) {
    SpringApplication.run(MoviesDBApplication.class, args);
  }
}
