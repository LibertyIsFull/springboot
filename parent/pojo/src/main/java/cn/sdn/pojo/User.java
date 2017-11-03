package cn.sdn.pojo;

/**
 * @auther: lixiang
 * @Description:
 * @Date: Created in 11:27 2017/11/3
 * @Modified By:
 */
public class User {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "cn.sdn.pojo.User.User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}