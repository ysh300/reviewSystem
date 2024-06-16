package reviewSystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import reviewSystem.pojo.User;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password} ")
    User loginByUsernameAndPassword(User user);

    @Insert("insert into user(name, school, identity, username, password)" +
            "values (#{name},#{school},#{identity},#{username},#{password})")
    void add(User user);

}
