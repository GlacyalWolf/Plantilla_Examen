package com.example.plantilla_examen.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebViewModel extends ViewModel {

    private MutableLiveData<String> mWeb;

    public WebViewModel() {
        mWeb = new MutableLiveData<>();
    }

    public MutableLiveData<String> getWeb() {
        return mWeb;
    }

    public void downloadURL(String web){
        HttpURLConnection connection;
        URL url;
        String result = "";

        try{
            url = new URL(web);
            connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();

            int data = inputStream.read();
            // Getting the data from the WebPage
            while (data != -1){
                result += (char) data;
                data = inputStream.read();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mWeb.postValue(result);
    }
}