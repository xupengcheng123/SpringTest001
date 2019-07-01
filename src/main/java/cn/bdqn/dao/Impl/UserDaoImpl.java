package cn.bdqn.dao.Impl;

import cn.bdqn.dao.IUserDao;
import cn.bdqn.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl<getUserList> implements IUserDao {
    @Override
    public List<User> getUserList(){
        System.out.println("调用：dao.getUserList()");
        User user = new User();
        user.setId(110);
        user.setName("xpc");
        user.setAge(18);
        user.setAddress("北京");
        List<User> userList = new ArrayList<User>();
        userList.add(user);
        return userList;
    }
}
