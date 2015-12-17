package hello.service.impl;

import hello.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by jiming.liu on 2015/12/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findUserById(int id) {
        return String.valueOf(id);
    }
}
