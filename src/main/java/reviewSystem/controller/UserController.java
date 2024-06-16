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

}
