package lk.codelabs.rentcloud.rentprocesstask;

import lk.codelabs.rentcloud.rentprocesstask.service.RentProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class RentProcessTaskApplication {

    @Bean
    RentProcessTaskRunner getRentProcessTaskRunner() {
        return new RentProcessTaskRunner();
    }


    public static void main(String[] args) {
        SpringApplication.run(RentProcessTaskApplication.class, args);
    }

}
