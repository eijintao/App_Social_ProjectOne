package com.xm.app.mapper;

import com.xm.app.entity.Video_likes;
import com.xm.app.entity.Video_likesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Video_likesMapper {
    int countByExample(Video_likesExample example);

    int deleteByExample(Video_likesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Video_likes record);

    int insertSelective(Video_likes record);

    List<Video_likes> selectByExample(Video_likesExample example);

    Video_likes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Video_likes record, @Param("example") Video_likesExample example);

    int updateByExample(@Param("record") Video_likes record, @Param("example") Video_likesExample example);

    int updateByPrimaryKeySelective(Video_likes record);

    int updateByPrimaryKey(Video_likes record);

    List<Video_likes> getAllVideoLikes();
}