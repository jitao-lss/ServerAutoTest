package com.kongge.qa;




import com.sun.deploy.net.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by liushasha on 16/1/6.
 */
public class jitaotest {
    public static void main(String[] args) throws IOException {
        String url = "http://www.baidu.com/";

        String info =  execute(url);
        System.out.println(info);
    }
    public static String execute(String url) {
        String info = "";
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        try {
            info =   client.execute(httpget, new BasicResponseHandler());
        } catch (IOException e) {
            System.out.println("执行client时有问题"+e);
        }
        return info;
    }

}