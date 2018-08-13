package jxufe.lwl.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

@Controller
public class UploadController {
    @RequestMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("pic") MultipartFile file, HttpServletRequest request) throws Exception{

        if (!file.isEmpty()) {
            String fileName = UUID.randomUUID()+"--"+file.getOriginalFilename();
            String projectPath = "src\\main\\resources\\static\\pic\\";
            String targetPath=new File(ResourceUtils.getURL("classpath:").getPath()).getAbsolutePath()+"\\static\\pic\\";
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(targetPath+fileName)));//保存图片到目录下
                out.write(file.getBytes());
                out.flush();
                out.close();

                BufferedOutputStream out2 = new BufferedOutputStream(
                        new FileOutputStream(new File(projectPath+fileName)));//保存图片到目录下
                out2.write(file.getBytes());
                out2.flush();
                out2.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return fileName;
        } else {
            return "上传失败，因为文件是空的.";
        }
    }
}
