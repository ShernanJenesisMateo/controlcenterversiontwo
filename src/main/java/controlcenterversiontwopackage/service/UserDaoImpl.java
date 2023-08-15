package controlcenterversiontwopackage.service;


import java.util.List;

import org.springframework.stereotype.Service;

import controlcenterversiontwopackage.dao.UserDao;
import controlcenterversiontwopackage.mapper.UserMapper;
import controlcenterversiontwopackage.model.User;

@Service
public class UserDaoImpl implements UserDao {
    private UserMapper userMapper;

    public UserDaoImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void insertUserBatch(List<User> users) {
        userMapper.insertUserBatch(users);
    }

}

