package org.example.ioc3;

import org.springframework.stereotype.Controller;

/**
 * @author UserName
 */
@Controller
public class UserServiceImpl implements UserService{
    @Override
    public String show() {
        return "UserServiceImpl show";
    }
}
