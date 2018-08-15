package jxufe.lwl.eshop.controller;

import com.aliyun.oss.OSSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/8/14 0014.
 */
@Controller
public class UploadFileController {
    @RequestMapping("uploadfile")
    @ResponseBody
    public Object uploadFile(@RequestParam("fs")MultipartFile file){
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
        String accessKeyId = "LTAI6D9vZzrSgSqr";
        String accessKeySecret = "mK0XcIm6BFhowuOEvBBzmRXZmAmTDD";
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        String buckName="newwld";
        try {
            InputStream inputStream=file.getInputStream();
            ossClient.putObject(buckName,file.getOriginalFilename(), inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ossClient.shutdown();
        }

        return endpoint.replace("http://","http://"+buckName+".")+"/"+file.getOriginalFilename();

    }
}
