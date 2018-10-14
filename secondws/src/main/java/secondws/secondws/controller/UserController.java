package secondws.secondws.controller;

import domain.entity.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import secondws.secondws.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/findOne")
    public Category findOne(@RequestBody int id) {
        System.out.println("进来ws-2了!!!");
        return userService.findOne(id);
    }

    @GetMapping("/searchCategoryList")
    public List<Category> findAll() {
        System.out.println("进来ws 2了!!!");
        return userService.findAll();
    }
}
