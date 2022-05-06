package com.company.service;

import com.company.MyExeption;
import com.company.model.User;

public interface UserService {
    void userSet(User user);
    User findWithId(long id) throws MyExeption;
    void deleteWithId(long id);
    void getAllUsers();
}
