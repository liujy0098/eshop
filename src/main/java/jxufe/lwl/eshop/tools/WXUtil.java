package jxufe.lwl.eshop.tools;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/14 0014.
 */
public class WXUtil {
    HttpClient liulanqi;
    HttpResponse response;
    HttpEntity entity;
    public WXUtil() {
        liulanqi= HttpClients.createDefault();
         response=null;
         entity=null;
    }

    public String get(String url){
        HttpGet get=new HttpGet(url);
        try {
            response=liulanqi.execute(get);
            entity=response.getEntity();
            String string= EntityUtils.toString(entity,"UTF-8");
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            get.releaseConnection();
        }
    }

    public String post(String url,String jsonstr){
        HttpPost post=new HttpPost(url);
        post.addHeader("Content-type","application/json;charset=utf-8");
        post.setEntity(new StringEntity(jsonstr,"UTF-8"));
        try {
            response= liulanqi.execute(post);
            entity=response.getEntity();
            String string=EntityUtils.toString(entity,"UTF-8");
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            post.releaseConnection();
        }
    }
}
