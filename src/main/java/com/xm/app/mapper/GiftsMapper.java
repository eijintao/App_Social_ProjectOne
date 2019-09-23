package com.xm.app.mapper;

import com.xm.app.entity.Gifts;
import com.xm.app.entity.GiftsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftsMapper {
    int countByExample(GiftsExample example);

    int deleteByExample(GiftsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gifts record);

    int insertSelective(Gifts record);

    List<Gifts> selectByExample(GiftsExample example);

    Gifts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gifts record, @Param("example") GiftsExample example);

    int updateByExample(@Param("record") Gifts record, @Param("example") GiftsExample example);

    int updateByPrimaryKeySelective(Gifts record);

    int updateByPrimaryKey(Gifts record);

    List<Gifts> getAllGifts();
}