package ru.ogres.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.ogres.test.db.User;
import ru.ogres.test.db.UserRepo;
import ru.ogres.tools.EnableObjectAdmin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zed on 22.07.16.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ru.ogres.tools.repo", "ru.ogres.test"})
@EnableObjectAdmin
@ComponentScan(basePackages = {"ru.ogres.tools.repo"})
public class Application implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Override
    public void run(String... strings) throws Exception {
        User u = new User();
        u.setName("Zed");
        u.setAccess(5);
        userRepo.save(u);


    }

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }



}
