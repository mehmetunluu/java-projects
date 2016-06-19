package com.mehmetunluu.backend.controller.user;

import com.mehmetunluu.backend.controller.BaseController;
import com.mehmetunluu.backend.db.dto.UserDto;
import com.mehmetunluu.backend.db.model.User;
import com.mehmetunluu.backend.exception.UserNotFoundException;
import com.mehmetunluu.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Mehmet ÜNLÜ on 18.06.2016.
 */
@RequestMapping("/user")
public class UserController  extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByUserName")
    public UserDto getUserByUserName(@RequestParam(value = "userName") String userName) throws UserNotFoundException {
        return  mapUserToUserDto(userService.getUserByUserName(userName));
    }

    private UserDto mapUserToUserDto(User user) throws UserNotFoundException {
        if(user == null){
            throw new UserNotFoundException("User not found.");
        }

        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setMsisdn(user.getMsisdn());

        return userDto;

    }

}
