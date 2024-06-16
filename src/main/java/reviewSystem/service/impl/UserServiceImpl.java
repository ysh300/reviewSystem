package reviewSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reviewSystem.mapper.UserMapper;
import reviewSystem.pojo.User;
import reviewSystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginByUsernameAndPassword(User user) {
        return userMapper.loginByUsernameAndPassword(user);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void delById(Integer id) {
        userMapper.delById(id);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }





}
