package ru.ogres.test.db;

import lombok.Data;
import ru.ogres.tools.ObjectAdminEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zed on 22.07.16.
 */
@Entity
@Data
@ObjectAdminEntity
public class User {

    @Id
    @GeneratedValue
    public long id;

    String name;

    int access;
}
