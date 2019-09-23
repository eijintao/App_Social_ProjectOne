package com.xm.app.controller;

import com.github.pagehelper.PageInfo;
import com.xm.app.comment.ErrorCodeEnum;
import com.xm.app.comment.Result;
import com.xm.app.entity.Photos;
import com.xm.app.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mei Jintao
 * @date 2019/9/17 9:49
 */
@Controller
@RequestMapping("/page/")
public class PhotosController {

    @Autowired
    private PhotosService photosService;

    /**
     * 查询用户所有照片  并对其进行分页
     *
     * @param page 表示接收页码
     * @param rows 表示接收页大小
     * @return
     */
    @RequestMapping("getPhotosAll")
    @ResponseBody
    public Map<String, Object> getPhotosAll(Integer page, Integer rows) throws Exception {
        PageInfo<Photos> pageInfo = photosService.getAllPhotosByPage(page, rows);
        //组装返回的业务
        Map<String, Object> map = new HashMap<String, Object>();
        //填充总记录数
        map.put("total", pageInfo.getTotal());
        //填充当前页的记录
        map.put("rows", pageInfo.getList());

        return map;
    }

    /**
     * 增加相片。 // 下面的对传入参数指定为aa，如果前端不传aa参数名，会报错  @RequestParam(value = "pfile"）
     * required=false表示不传的话，会给参数赋值为null，required=true就是必须要有
     *
     * @param uploadFile
     * @return
     */
    @RequestMapping("addPhotosById")
    @ResponseBody
    public Result<String> addPhotos(MultipartFile uploadFile) {
        Photos photos = new Photos();

        //获取图片名
        String fileName = uploadFile.getOriginalFilename();

        //截取图片后缀
        String suff = fileName.substring(fileName.lastIndexOf("."));

        //判断是否是图片
        if (!(suff.matches(".(jpg||gif||png)"))) {   //不是个图片
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PHOTOS_FORMAT_ERROR.getCode(), "图片格式错误");
        }
        //Image是一个抽象类,BufferedImage是其实现类，是一个带缓冲区图像类，主要作用是将一幅图片加载到内存中.
        //ImageIO 提供read()和write()静态方法，读写图片，比以往的InputStream读写更方便。
        try {
            BufferedImage bufferedImage = ImageIO.read(uploadFile.getInputStream());
            //获取图片宽高
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            photos.setWidth(width);
            photos.setHeight(height);

            String localPath = "D:/images/";
            String urlPath = "http://image.jt.com/images/";
            String dataPath = new SimpleDateFormat("yyyy/mm/dd/hh/mm").format(new Date());

            //拼接路径
            localPath += dataPath + uploadFile.getOriginalFilename();
            urlPath += dataPath + uploadFile.getOriginalFilename();
            //把路径放入io流中
            File file = new File(localPath);
            if (!file.exists()) {
                //文件不存在时创建多个文件
                file.mkdirs();
            }
            //将图片写入磁盘
            uploadFile.transferTo(file);
            // picload.setUrl(urlPath);
            photos.setSrc(urlPath);
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PHOTOS_FORMAT_SUCCESS.getCode(), "图片上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            return Result.createByErrorCodeMessage(ErrorCodeEnum.PHOTOS_FORMAT_ERROR.getCode(), "图片格式错误");
        }

    }
}
