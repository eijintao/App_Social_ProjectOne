package com.xm.app.service;

import com.github.pagehelper.PageInfo;
import com.xm.app.entity.Photos;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:43
 */
public interface PhotosService {
    /**
     * 查询用户照片表
     * @param id
     * @return
     */
    Photos selectByPrimaryKey(Integer id);


    /**
     * 查询全部用户照片，并分页
     * @param page 接收页码
     * @param rows 接收页大小
     * @return
     */
    PageInfo<Photos> getAllPhotosByPage(Integer page, Integer rows);

    /**
     * 增加照片
     * @param photos
     * @return
     */
    public int addPhotos(Photos photos);


}
