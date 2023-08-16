package controlcenterversiontwopackage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import controlcenterversiontwopackage.model.User;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User getUserById(Long id);
    void insertUser(User user);
    void insertUserBatch(List<User> users);
}

