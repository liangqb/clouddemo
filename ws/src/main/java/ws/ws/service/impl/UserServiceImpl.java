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
        System.out.println("clouddemo2");
        System.out.println("clouddemo1");
        System.out.println("clouddemo4");
        System.out.println("clouddemo6");
        System.out.println("clouddemo8");        
        System.out.println("clouddemo9");
        return userMapper.findAll();
    }

    @Override
    public Category findOne(Integer userId) {
        return userMapper.findOne(userId);
    }
}
