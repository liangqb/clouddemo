package ws.ws.controller;

import domain.entity.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.ws.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/findOne")
    public Category findOne(@RequestBody int id) {
        System.out.println("进来ws 1了!!!");
        return userService.findOne(id);
    }

    @GetMapping("/searchCategoryList")
    public List<Category> findAll() {
        System.out.println("进来ws 1了!!!");
        return userService.findAll();
    }
}
