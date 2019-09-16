package com.xm.app.service;

import com.xm.app.entity.Users;
import com.xm.app.mapper.Sms_codeMapper;
import com.xm.app.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
*
 * @author Mei Jintao
 * @date 2019/9/7 14:26

*/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sms_codeMapper smsCodeMapper;

    /**
     * 增加一行
     * @param record
     * @return
     */
    @Override
    public int insert(Users record) {
       return usersMapper.insertSelective(record);
    }

    /**
     * 修改一行
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(Users record) {

        return usersMapper.updateByPrimaryKey(record);
    }

    /**
     *根据id查询用户
     * @param id
     * @return
     */
    @Override
    public Users selectByPrimaryKey(Integer id) {

        Users users = usersMapper.selectByPrimaryKey(id);
        return users;
    }
}
