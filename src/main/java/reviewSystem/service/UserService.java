package reviewSystem.service;

import reviewSystem.pojo.User;

public interface UserService {
    User loginByUsernameAndPassword(User user);

    void add(User user);

    void delById(Integer id);

    User selectById(Integer id);

    void update(User user);


}
