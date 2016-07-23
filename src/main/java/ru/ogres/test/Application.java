package ru.ogres.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.ogres.test.db.User;
import ru.ogres.test.db.UserRepo;

/**
 * Created by zed on 22.07.16.
 */
@SpringBootApplication
@EnableJpaRepositories
public class Application implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Override
    public void run(String... strings) throws Exception {
        User u = new User();
    }

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }



}
