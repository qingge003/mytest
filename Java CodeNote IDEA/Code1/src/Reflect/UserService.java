package Reflect;
/**
 * @author chenweidong
 * @date 2022/7/27 12:31
 * TODO:
 */
/**
 *
 */

public class UserService {
    /**
     *
     * @param name 用户名
     * @param password 密码
     * @return true表示登录成功
     */
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return  true;
        }
        return  false;
    }

    /**
     * 退出系统的方法
     */
    public void logout(){
        System.out.println("系统已安全退出!");
    }
}
