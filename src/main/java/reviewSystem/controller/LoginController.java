package reviewSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reviewSystem.pojo.Result;
import reviewSystem.pojo.User;
import reviewSystem.service.UserService;
import reviewSystem.utils.JwtUtils;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result login(@RequestBody User user){
        User e = userService.loginByUsernameAndPassword(user);
//      登陆成功则发放jwt令牌，并返回给前端
        if (e!=null){
//            封装map集合，传递给jwt令牌
            Map<String, Object> claim=new HashMap<>();
            claim.put("id",e.getId());
            claim.put("name",e.getUsername());
            claim.put("username",e.getUsername());
//            使用工具类生成jwt令牌
            String jwt = JwtUtils.generateJwt(claim);
            return Result.success(jwt);
        }

        return Result.success("登录失败");
    }
}
