package com.itheima.ioc;

// 创建实现接口类
public class UserServiceimpl implements UserService {
    private UserDaoimpl userDao;
    public void setUserDao(UserDaoimpl userDao){
        this.userDao = userDao;
    }
    public void say() {
        this.userDao.say();
        System.out.println("userServiceimpl say hello world!");
    }
}
