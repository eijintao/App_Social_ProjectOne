package com.xm.app.service;

import com.xm.app.entity.Im_rongcloud;
import com.xm.app.mapper.Im_rongcloudMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mei Jintao
 * @date 2019/9/22 16:58
 */
@Service
public class ImRoungcloudServiceImpl implements     ImRoungcloudService {
    @Autowired
    private Im_rongcloudMapper im_rongcloudMapper;

    @Override
    public int insert(Im_rongcloud record) {

        return im_rongcloudMapper.insert(record);
    }
}
