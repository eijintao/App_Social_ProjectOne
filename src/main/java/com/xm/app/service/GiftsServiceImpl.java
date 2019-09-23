package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Gifts;
import com.xm.app.mapper.GiftsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:28
 */
@Service
public class GiftsServiceImpl implements GiftsService{

    @Autowired
    private GiftsMapper giftsMapper;

    /**
     * 查询礼物表
     * @param id
     * @return
     */
    @Override
    public Gifts selectByPrimaryKey(Integer id) {
        return giftsMapper.selectByPrimaryKey(id);
    }


    /**
     * 查询全部礼物，并进行分页
     * @param page  接收页码
     * @param rows  接收页大小
     * @return
     */
    @Override
    public PageInfo<Gifts> getAllGiftsByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<Gifts> list=giftsMapper.getAllGifts();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<Gifts> pageInfo=new PageInfo<Gifts>(list);
        //返回分页的数据
        return pageInfo;
    }
}
