package web.dao;


import web.models.User;

import java.util.List;


public interface UserDao {

    void add(User user);
    List<User> listUsers();
    void remove(Long id);
    User update(Long id, User newUser);
    User showUser(Long id);
}
