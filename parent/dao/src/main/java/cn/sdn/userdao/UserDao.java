package cn.sdn.userdao;

import cn.sdn.pojo.User;

/**
 * @auther: lixiang
 * @Description:
 * @Date: Created in 12:17 2017/11/3
 * @Modified By:
 */
public interface UserDao {

    public User findUser(String username);
}
