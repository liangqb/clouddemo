package web.web.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import domain.entity.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import web.web.feignClient.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private UserService userService;

    @GetMapping("/consumer/{id}")
    public Category findOne(@PathVariable("id") int id) {
        Category result = userService.findOne(id);
//        ResponseEntity<Category> response = restTemplate.postForEntity("http://ws/", id, Category.class);
//        Category result = response.getBody();
        return result;
    }


    @HystrixCommand(fallbackMethod = "errorInfo")
    @GetMapping("/consumer/findAll")
    public List<Category> findAll() {
//        ResponseEntity<List<Category>> response = restTemplate.exchange("http://ws/user/searchCategoryList", HttpMethod.GET, null, new ParameterizedTypeReference<List<Category>>() {
////        });
////        List<Category> result = response.getBody();
        List<Category> result = userService.findAll();
        return result;
    }

    public List<Category> errorInfo() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1, "null"));
        System.out.println("进入了错误回调机制!!!");
        return list;
    }
}
