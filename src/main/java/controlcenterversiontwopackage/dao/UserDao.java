package controlcenterversiontwopackage.dao;

import java.util.List;

import controlcenterversiontwopackage.model.User;

public interface UserDao {
     List<User> findAll();
     User getUserById(Long id);
     void insertUser(User user);
     void insertUserBatch(List<User> users);
}

