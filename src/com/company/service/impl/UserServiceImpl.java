package com.company.service.impl;

import com.company.MyExeption;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDao();


    @Override
    public void userSet(User user) {
       userDao.setUsers(user);

    }

    @Override
    public User findWithId(long id) throws MyExeption {
        List<Long>usr = new ArrayList<>();
        User user = new User();

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            usr.add( userDao.getUsers().get(i).getId());

            if (userDao.getUsers().get(i).getId() == id) {
                user = userDao.getUsers().get(i);
            }
        }
            if (usr.contains(id)) {
            }  else {
                throw new MyExeption("There is no such user with this ID - "+id+" ,try again!");
            }

        return user;


    }

    @Override
    public void deleteWithId(long id) {

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id){
                userDao.getUsers().remove(i);
            }

        }

    }

    @Override
    public void getAllUsers() {
        for (User users:userDao.getUsers()) {
            System.out.println(users);
        }

    }
}
