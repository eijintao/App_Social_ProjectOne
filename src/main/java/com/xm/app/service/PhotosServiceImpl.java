package com.xm.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Photos;
import com.xm.app.mapper.PhotosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:46
 */
@Service
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosMapper photosMapper;

    /**
     * 查询用户照片表
     * @param id
     * @return
     *
     */
    @Override
    public Photos selectByPrimaryKey(Integer id) {
        return photosMapper.selectByPrimaryKey(id);


    }

    /**
     * 查询全部用户照片，并分页
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    @Override
    public PageInfo<Photos> getAllPhotosByPage(Integer page, Integer rows) {
        //分页
        PageHelper.startPage(page,rows);
        //调用mapper层的查询全部的方法
        List<Photos> list=photosMapper.getAllPhotos();
        //将得到的 查询全部的数据放到 分页的依赖中去 里面去。
        PageInfo<Photos> pageInfo=new PageInfo<Photos>(list);
        //返回分页的数据
        return pageInfo;
    }

    /**
     * 增加照片
     * @param photos
     * @return
     */
    @Override
    public int addPhotos(Photos photos) {
        return photosMapper.insertSelective(photos);
    }
}
