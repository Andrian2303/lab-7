package ua.lviv.iot.repair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.repair.dataaccess",
    "ua.lviv.iot.repair.business",
    "ua.lviv.iot.repair.controller"})
@EnableJpaRepositories({"ua.lviv.iot.repair.dataaccess"})
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }
}
