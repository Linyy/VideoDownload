package com.linv.videodownload;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
public class Params {

    /**
     * Necessary
     * ---- mediaurl
     */
    public static Map<String, String> mediaInfoParams;

    /**
     * Necessary
     * ---- mediaurl
     * ---- url
     * ---- filename
     * ---- id3-artist:Extra Credits
     * ---- id3-title:Why Games Do Cthulhu Wrong
     * ---- image:http://i.ytimg.com/vi/7DyRxlvM9VM/mqdefault.jpg
     * ---- org-filename:Extra Credits - Why Games Do Cthulhu Wrong - The Problem with Horror Games
     * ---- pattern:7DyRxlvM9VM
     */
    public static Map<String, String> mediaDownloadUrlParams;
    static{
        // Init get media info params
        mediaInfoParams = new HashMap<String, String>();
        mediaInfoParams.put("addon_browser","");
        mediaInfoParams.put("addon_version","");
        mediaInfoParams.put("mediaurl","");
        mediaInfoParams.put("filename","");
        mediaInfoParams.put("filetype","");
        mediaInfoParams.put("format","");
        mediaInfoParams.put("audiovol","0");
        mediaInfoParams.put("audiochannel","2");
        mediaInfoParams.put("audiobr","128");
        mediaInfoParams.put("videobr","224");
        mediaInfoParams.put("videores","352x288");
        mediaInfoParams.put("videoaspect","");
        mediaInfoParams.put("customres","320x240");
        mediaInfoParams.put("timefrom-start","1");
        mediaInfoParams.put("timeto-end","1");
        mediaInfoParams.put("id3-artist","");
        mediaInfoParams.put("id3-title","");
        mediaInfoParams.put("id3-album","ClipConverter.cc");
        mediaInfoParams.put("auto","0");
        mediaInfoParams.put("hash","");
        mediaInfoParams.put("image","");
        mediaInfoParams.put("org-filename","");
        mediaInfoParams.put("videoid","");
        mediaInfoParams.put("pattern","");
        mediaInfoParams.put("server","");
        mediaInfoParams.put("serverinterface","");
        mediaInfoParams.put("service","");
        mediaInfoParams.put("ref","");
        mediaInfoParams.put("lang","en");
        mediaInfoParams.put("client_urlmap","none");
        mediaInfoParams.put("ipv6","false");
        mediaInfoParams.put("addon_urlmap","");
        mediaInfoParams.put("cookie","");
        mediaInfoParams.put("addon_cookie","");
        mediaInfoParams.put("addon_title","");
        mediaInfoParams.put("adblock","1");
        mediaInfoParams.put("clientside","0");


        // Init request get media download url params
        mediaDownloadUrlParams = new HashMap<String, String>();
        mediaDownloadUrlParams.put("addon_browser","");
        mediaDownloadUrlParams.put("addon_version","");
        mediaDownloadUrlParams.put("mediaurl","");
        mediaDownloadUrlParams.put("url","");
        mediaDownloadUrlParams.put("filename","");
        mediaDownloadUrlParams.put("filetype","MP4");
        mediaDownloadUrlParams.put("format","");
        mediaDownloadUrlParams.put("audiovol","0");
        mediaDownloadUrlParams.put("audiochannel","2");
        mediaDownloadUrlParams.put("audiobr","256");
        mediaDownloadUrlParams.put("videobr","224");
        mediaDownloadUrlParams.put("videores","352x288");
        mediaDownloadUrlParams.put("videoaspect","");
        mediaDownloadUrlParams.put("customres","320x240");
        mediaDownloadUrlParams.put("timefrom-start","1");
        mediaDownloadUrlParams.put("timeto-end","1");
        mediaDownloadUrlParams.put("id3-artist","");
        mediaDownloadUrlParams.put("id3-title","");
        mediaDownloadUrlParams.put("id3-album","ClipConverter.cc");
        mediaDownloadUrlParams.put("auto","0");
        mediaDownloadUrlParams.put("hash","");
        mediaDownloadUrlParams.put("image","");
        mediaDownloadUrlParams.put("org-filename","");
        mediaDownloadUrlParams.put("videoid","");
        mediaDownloadUrlParams.put("pattern","");
        mediaDownloadUrlParams.put("server","srv45");
        mediaDownloadUrlParams.put("serverinterface","eth0");
        mediaDownloadUrlParams.put("service","YouTube");
        mediaDownloadUrlParams.put("ref","");
        mediaDownloadUrlParams.put("lang","en");
        mediaDownloadUrlParams.put("client_urlmap","none");
        mediaDownloadUrlParams.put("ipv6","false");
        mediaDownloadUrlParams.put("addon_urlmap","");
        mediaDownloadUrlParams.put("cookie","");
        mediaDownloadUrlParams.put("addon_cookie","");
        mediaDownloadUrlParams.put("addon_title","");
        mediaDownloadUrlParams.put("adblock","1");
        mediaDownloadUrlParams.put("clientside","1");

    }

    public static Map<String, String> cloneMap(Map<String, String> oldMap){
        Map<String, String> map = new HashMap<String, String>();
        for (String key : oldMap.keySet()) {
            map.put(key, oldMap.get(key));
        }
        return map;
    }

    public static Map<String, String> obtainMediaInfoParams(){
        return cloneMap(mediaInfoParams);
    }

    public static Map<String, String> obtainDownloadUrlParams(){
        return cloneMap(mediaDownloadUrlParams);
    }
}
