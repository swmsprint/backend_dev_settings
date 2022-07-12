package sprint.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sprint.test.domain.Info;


@SpringBootApplication
public class TestApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

    }
}
