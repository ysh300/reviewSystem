package reviewSystem.service;

import reviewSystem.pojo.User;

public interface UserService {
    User loginByUsernameAndPassword(User user);

    void add(User user);

    void delById(Integer id);


}
