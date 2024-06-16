package reviewSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reviewSystem.pojo.Result;
import reviewSystem.pojo.User;
import reviewSystem.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //    新增用户
    @PostMapping
    public Result add(@RequestBody User user){
        userService.add(user);
        return Result.success();
    }

    //    删除用户
    @DeleteMapping("/{id}")
    private Result delById(@PathVariable Integer id){
        userService.delById(id);
        return Result.success();
    }
    //    根据id查询
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        User user=userService.selectById(id);
        return Result.success(user);
    }
    //    修改用户
    @PutMapping
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }

}
