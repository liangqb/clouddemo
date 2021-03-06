package secondws.secondws.service.impl;

import domain.entity.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondws.secondws.mapper.UserMapper;
import secondws.secondws.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Category> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Category findOne(Integer userId) {
        return userMapper.findOne(userId);
    }
}
