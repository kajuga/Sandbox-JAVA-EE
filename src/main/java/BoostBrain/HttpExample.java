package BoostBrain;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpExample {

    public static void main(String[] args) throws IOException {
        String fedorovs = "http://fedorovs.com";

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(fedorovs);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        String body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);

//        BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            System.out.println(line);


        HttpPost httpPost = new HttpPost(fedorovs);
        httpPost.setHeader("qwe", "qwe");
        httpResponse = httpClient.execute(httpPost);
        body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);

//        BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            System.out.println(line);

        }
    }
//}

