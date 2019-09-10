package com.xm.app.service;

import com.xm.app.entity.Users;
import com.xm.app.entity.UsersExample;
import com.xm.app.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
*
 * @author Mei Jintao
 * @date 2019/9/7 14:26

*/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public String createToken(String moblie) {


     return null;


    }

    @Override
    public int checkUsername(String mobile) {
/*
* 写持久化操作
*/

        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();

/*
* 添加条件
*/

         criteria.andMobileEqualTo(mobile);

         //返回的用户名有没有
         List<Users> list= usersMapper.selectByExample(usersExample);
           //0表示用户存在，1表示用户不存在
        return list.size()==0?0:1;
    }



    public  int  findUserById(Integer userId){
            Users users=new Users();
             users.setId(userId);
            return usersMapper.insertSelective(users);
         }

    @Override
    public Users findByUsername(Integer userId) {

        return usersMapper.selectByPrimaryKey(userId);
    }

/**
     * 检查用户是否是否登录
     * @param userId
     * @return
     */

    @Override
    public Users findUserById(String userId) {
        return null;
    }
}
