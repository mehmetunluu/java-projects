package com.mehmetunluu.backend.db.repository;

import com.mehmetunluu.backend.db.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mehmet ÜNLÜ on 18.06.2016.
 */
public interface UserRepository extends CrudRepository<User,Long> {

    @Query("select u from User u where u.userName = :userName")
    public User findUserByName(String userName);

}
