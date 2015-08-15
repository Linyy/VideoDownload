package com.linv.videodownload;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;
import com.lidroid.xutils.util.LogUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.linv.videodownload.adapter.MediasAdapter;
import com.linv.videodownload.entity.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {

    private final static String url = "http://www.clipconverter.cc/check.php";

    @ViewInject(R.id.et_url)
    EditText et_url;
    @ViewInject(R.id.btn_continue)
    Button btn_continue;
    @ViewInject(R.id.lv_medias)
    ListView lv_medias;

    MediasAdapter adapter;
    List<Media> medias;
    HttpUtils httpUtils;
    String mediaUrl;

    RequestCallBack<String> requestCallback=new RequestCallBack<String>() {


        @Override
        public void onStart() {
            super.onStart();
            LogUtils.e("Request Url: " + getRequestUrl());
        }

        @Override
        public void onSuccess(ResponseInfo<String> responseInfo) {
            LogUtils.e("onSuccess");
            LogUtils.e("Result:" + responseInfo.result);
            Gson gson = new Gson();
            Media media = gson.fromJson(responseInfo.result, Media.class);
            if(null == medias){
                medias = new ArrayList<Media>();
            }
            medias.clear();
            medias.add(media);
            adapter.notifyDataSetChanged();
        }

        @Override
        public void onFailure(HttpException error, String msg) {
            LogUtils.e("onFailure");
            LogUtils.e("ExceptionCode:" + error.getExceptionCode());
            LogUtils.e("msg:" + msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);

        et_url.setText("https://www.youtube.com/watch?v=7DyRxlvM9VM");

        medias = new ArrayList<Media>();
        adapter = new MediasAdapter(this, medias);
        lv_medias.setAdapter(adapter);
    }

    @OnClick(R.id.btn_continue)
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btn_continue:
                continueMediaUrl();
                break;
            default:
                break;
        }
    }

    private void continueMediaUrl(){

        mediaUrl = et_url.getText().toString().trim();
        if(null == mediaUrl || mediaUrl.equals("")){
            return;
        }

        Map<String, String> paramsMap = Params.obtainMediaInfoParams();
        paramsMap.put("mediaurl", mediaUrl);

        RequestParams params = mapAddToParams(null, paramsMap);

        httpUtils = new HttpUtils(1000 * 60  * 2);
        httpUtils.send(HttpRequest.HttpMethod.POST, url, params, this.requestCallback);
    }

    private RequestParams mapAddToParams(RequestParams params,Map<String, String> map){
        if(null == params){
            params=new RequestParams();
        }

        for (String key : map.keySet()){
            params.addBodyParameter(key, map.get(key));
        }

        return params;
    }
}
