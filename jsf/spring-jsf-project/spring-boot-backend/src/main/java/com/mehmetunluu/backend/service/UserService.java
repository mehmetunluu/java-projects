package com.mehmetunluu.backend.service;

import com.mehmetunluu.backend.db.model.User;
import com.mehmetunluu.backend.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Neval Bayram on 18.06.2016.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUserName(String userName){
        return userRepository.findUserByName(userName);
    }
}
