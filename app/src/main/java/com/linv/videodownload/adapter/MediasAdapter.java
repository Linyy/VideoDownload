package com.linv.videodownload.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;
import com.lidroid.xutils.util.LogUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.linv.videodownload.R;
import com.linv.videodownload.entity.Media;

import java.util.List;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
public class MediasAdapter extends BaseAdapter {

    Context mContext;
    List<Media> medias;
    LayoutInflater mInflater;
    BitmapUtils bitmapUtils;
    HttpUtils httpUtils;

    public MediasAdapter(Context context, List<Media> medias) {
        this.mContext = context;
        this.medias = medias;
        this.mInflater = LayoutInflater.from(mContext);
        this.bitmapUtils = new BitmapUtils(mContext);
        this.httpUtils = new HttpUtils();
//        httpUtils.configUserAgent("Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36");
    }

    @Override
    public int getCount() {
        return null == medias ? 0 : medias.size();
    }

    @Override
    public Media getItem(int position) {
        return null == medias ? null : medias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(null == convertView){
            convertView = mInflater.inflate(R.layout.item_media, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        final Media m = getItem(position);
        bitmapUtils.display(holder.ivThumb, m.getThumb());
        holder.tvFileName.setText(m.getFilename());
        final ProgressBar pb=holder.pbDownload;
        pb.setMax(100);

        pb.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {


                httpUtils.send(HttpRequest.HttpMethod.GET, m.getUrl().get(0).getUrl(), new RequestCallBack<String>() {

                    @Override
                    public void onLoading(long total, long current, boolean isUploading) {
                        super.onLoading(total, current, isUploading);
                        long progress = (current / total) * 100;
                        pb.setProgress((int) progress);
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        LogUtils.e("onSuccess");
                        LogUtils.e(responseInfo.result);
                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        LogUtils.e("onFailure");
                        LogUtils.e("ExceptionCode:"+error.getExceptionCode());
                        LogUtils.e("msg:"+msg);

                    }
                });


                return false;
            }
        });

        return convertView;
    }

    static class ViewHolder{
        @ViewInject(R.id.iv_thumb)
        ImageView ivThumb;
        @ViewInject(R.id.tv_file_name)
        TextView tvFileName;
        @ViewInject(R.id.pb_download)
        ProgressBar pbDownload;

        public ViewHolder(View v){
            ViewUtils.inject(this, v);
        }
    }
}
