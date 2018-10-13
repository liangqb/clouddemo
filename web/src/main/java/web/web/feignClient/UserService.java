package web.web.feignClient;

import domain.entity.entity.Category;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("ws")
public interface UserService {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public Category findOne(@PathVariable("id") int id);

    @RequestMapping(value = "/user/searchCategoryList", method = RequestMethod.GET)
    public List<Category> findAll();
}
