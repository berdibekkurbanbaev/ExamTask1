package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.model.gender.Gender;

import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws MyExeption {
        UserDao userDao = new UserDao();

            UserServiceImpl userService = new UserServiceImpl();
            userService.userSet(new User(1, "Bayaman", 25, Gender.MALE));
            userService.userSet(new User(2, "Berdibek", 30, Gender.MALE));
            userService.userSet(new User(3, "Timurlan", 23, Gender.MALE));
            userService.userSet(new User(4, "Zynat", 35, Gender.FEMALE));
            userService.userSet(new User(5, "Nurbek", 21, Gender.MALE));
            userService.userSet(new User(6, "Nurlan", 31, Gender.MALE));
            userService.userSet(new User(7, "Asel", 32, Gender.FEMALE));
            userService.userSet(new User(8, "Jibek", 24, Gender.FEMALE));
        try{
            System.out.println("PeaSoft students list ");
            System.out.println("------------------------------------------------------\n" +
                    "                 all users list");
            userService.getAllUsers();
            userService.deleteWithId(2);
            System.out.println("------------------------------------------------------\n" +
                    "            list after remove with id");
            userService.getAllUsers();
            System.out.println("------------------------------------------------------\n" +
                    "             searchable list with id");
            System.out.println(userService.findWithId(9));

        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
    }
}

