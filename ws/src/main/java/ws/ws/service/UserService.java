package ws.ws.service;

import domain.entity.entity.Category;

import java.util.List;

public interface UserService {

    public List<Category> findAll();

    public Category findOne(Integer userId);
}
