package org.stocks.dao;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.stocks.dto.BrApiStocksResponse;

import org.apache.http.client.utils.URIBuilder;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;

public abstract class BrAPI {
    private static final String BRAPI_PATH = "https://brapi.dev/api/quote/";

//    public static BrApiStocksResponse brApiDao() throws IOException {
//        URL url = new URL(BRAPI_PATH);
//        URLConnection connection = url.openConnection();
//        InputStream inputStream = connection.getInputStream();
//        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
//
//        String responseAux = "";
//        StringBuilder response = new StringBuilder();
//
//        while ((responseAux = bufferedInputStream.readLine()) != null) {
//            response.append(responseAux);
//        }
//
//        return new Gson().fromJson(response.toString(), BrApiStocksResponse.class);
//    }

    public static BrApiStocksResponse brApiDao(final List<String> stocks) {
        final String pathWithStocks = BRAPI_PATH.concat(String.join("%2C", stocks));
        try{
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            URIBuilder uriBuilder = new URIBuilder(pathWithStocks);
            uriBuilder.setParameter("range", "1d");
            uriBuilder.setParameter("interval", "1d");
            uriBuilder.setParameter("fundamental", "true");
            uriBuilder.setParameter("dividends", "true");

            URI uri = uriBuilder.build();

            HttpGet httpGet = new HttpGet(uri);

            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);
            return new Gson().fromJson(responseBody, BrApiStocksResponse.class);
        } catch (URISyntaxException | IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
