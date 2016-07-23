package ru.ogres.test.db;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by zed on 22.07.16.
 */
public interface UserRepo extends CrudRepository<User, Long> {
}
