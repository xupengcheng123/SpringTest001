package cn.bdqn.service.Impl;

import cn.bdqn.dao.IUserDao;
import cn.bdqn.entity.User;
import cn.bdqn.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUserList() {
        System.out.println("调用：userServiceImpl.getUserList()");
        return userDao.getUserList();
    }
}
