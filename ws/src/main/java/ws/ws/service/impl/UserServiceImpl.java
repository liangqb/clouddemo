package ws.ws.service.impl;

import domain.entity.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.ws.mapper.UserMapper;
import ws.ws.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Category> findAll() {
        System.out.println("master");
        System.out.println("1001");
        return userMapper.findAll();
    }

    @Override
    public Category findOne(Integer userId) {
        return userMapper.findOne(userId);
    }
}
