package secondws.secondws.mapper;

import domain.entity.entity.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("Select * from category")
    List<Category> findAll();

    @Select("Select * from category c where c.id = #{userId}")
    Category findOne(@Param("userId") Integer userId);
}
