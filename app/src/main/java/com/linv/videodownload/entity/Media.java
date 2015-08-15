package com.linv.videodownload.entity;

import java.util.List;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
public class Media {

    /**
     * serverinterface : eth0
     * hash : 1439627622
     * id3artist : Extra Credits
     * checktime : 0
     * clientside : 1
     * url : [{"text":"YouTube Video <strong>High Definition (720p)<\/strong>, size: <strong>34 MB<\/strong>","filetype":"MP4","checked":"checked","url":"https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&lmt=1429774354055988&dur=357.076&itag=22&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=video/mp4&upn=oy82RzgARfk&sparams=dur,id,initcwndbps,ip,ipbits,itag,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,ratebypass,requiressl,source,upn,expire&signature=A073C1657741BBA0DB10CFB83B148788C712516A.81D2AB3735A6F101C72FD92C54E6C094FADE708E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&initcwndbps=1020000&source=youtube&pl=25&ratebypass=yes&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&ms=au&expire=1439648217&sver=3&#type=mp4#size=35995882#audio=https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&keepalive=yes&lmt=1429774104810746&dur=357.075&itag=140&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=audio/mp4&upn=oy82RzgARfk&sparams=clen,dur,gir,id,initcwndbps,ip,ipbits,itag,keepalive,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=B268B29129F30A065C7E08B6E1A9BEA68263D56E.6455402BE31CCF48431764C02FB276459443446E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&gir=yes&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&clen=5733533&ms=au&expire=1439648217&sver=3&ratebypass=yes#audiosize=5733533","size":"35995882"},{"text":"YouTube Video <strong>High Quality (480p)<\/strong>, size: <strong>14 MB<\/strong>","filetype":"MP4","checked":"","url":"https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&keepalive=yes&lmt=1429774213689302&dur=357.023&itag=135&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=video/mp4&upn=oy82RzgARfk&sparams=clen,dur,gir,id,initcwndbps,ip,ipbits,itag,keepalive,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=52862197B425DDB0C2994DAEF1469E1AF9245301.0BCE295D50BF96920E4E48834F7A15B0806DEB6C&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&gir=yes&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&clen=9456464&ms=au&expire=1439648217&sver=3&ratebypass=yes&#type=mp4#mux#size=9456464#audio=https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&keepalive=yes&lmt=1429774104810746&dur=357.075&itag=140&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=audio/mp4&upn=oy82RzgARfk&sparams=clen,dur,gir,id,initcwndbps,ip,ipbits,itag,keepalive,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=B268B29129F30A065C7E08B6E1A9BEA68263D56E.6455402BE31CCF48431764C02FB276459443446E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&gir=yes&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&clen=5733533&ms=au&expire=1439648217&sver=3&ratebypass=yes#audiosize=5733533","size":"9456464"},{"text":"YouTube Video <strong>Standard Quality (360p)<\/strong>, size: <strong>11 MB<\/strong>","filetype":"MP4","url":"https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&lmt=1429774305816560&dur=357.076&itag=18&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=video/mp4&upn=oy82RzgARfk&sparams=dur,id,initcwndbps,ip,ipbits,itag,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,ratebypass,requiressl,source,upn,expire&signature=BB6712A7ADD7405061A2C77795EF6DA4C3B5AC70.6BEEE1762281E58C4C33D4F861AD3CA00127306A&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&initcwndbps=1020000&source=youtube&pl=25&ratebypass=yes&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&ms=au&expire=1439648217&sver=3&#type=mp4#size=11752135#audio=https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&keepalive=yes&lmt=1429774104810746&dur=357.075&itag=140&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=audio/mp4&upn=oy82RzgARfk&sparams=clen,dur,gir,id,initcwndbps,ip,ipbits,itag,keepalive,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=B268B29129F30A065C7E08B6E1A9BEA68263D56E.6455402BE31CCF48431764C02FB276459443446E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&gir=yes&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&clen=5733533&ms=au&expire=1439648217&sver=3&ratebypass=yes#audiosize=5733533","size":"11752135"},{"text":"YouTube Video <strong>Mobile Version (3GP)<\/strong>, size: <strong>6 MB<\/strong>","filetype":"3GP","checked":"","url":"https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&lmt=1400969998859485&dur=357.215&itag=36&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=video/3gpp&upn=oy82RzgARfk&sparams=dur,id,initcwndbps,ip,ipbits,itag,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=10002C597B0C4710CD320E9DE8082ACA37354F3B.BE24A39D52759A304A8C0CECCD814605A3F7B21D&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&ms=au&expire=1439648217&sver=3&ratebypass=yes&#type=3gp#size=6530069","size":"6530069"}]
     * pattern : 7DyRxlvM9VM
     * playercode : <iframe class="youtube-player" type="text/html" width="640" height="385" src="http://www.youtube.com/embed/7DyRxlvM9VM" frameborder="0"></iframe>
     * service : YouTube
     * filename : Extra Credits - Why Games Do Cthulhu Wrong - The Problem with Horror Games
     * server : srv85
     * totaltime : 1
     * videoid : null
     * thumb : http://i.ytimg.com/vi/7DyRxlvM9VM/mqdefault.jpg
     * channel : Extra Credits
     * id3title : Why Games Do Cthulhu Wrong
     */
    private String serverinterface;
    private String hash;
    private String id3artist;
    private int checktime;
    private int clientside;
    private List<UrlEntity> url;
    private String pattern;
    private String playercode;
    private String service;
    private String filename;
    private String server;
    private int totaltime;
    private String videoid;
    private String thumb;
    private String channel;
    private String id3title;

    public void setServerinterface(String serverinterface) {
        this.serverinterface = serverinterface;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setId3artist(String id3artist) {
        this.id3artist = id3artist;
    }

    public void setChecktime(int checktime) {
        this.checktime = checktime;
    }

    public void setClientside(int clientside) {
        this.clientside = clientside;
    }

    public void setUrl(List<UrlEntity> url) {
        this.url = url;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setPlayercode(String playercode) {
        this.playercode = playercode;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setTotaltime(int totaltime) {
        this.totaltime = totaltime;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setId3title(String id3title) {
        this.id3title = id3title;
    }

    public String getServerinterface() {
        return serverinterface;
    }

    public String getHash() {
        return hash;
    }

    public String getId3artist() {
        return id3artist;
    }

    public int getChecktime() {
        return checktime;
    }

    public int getClientside() {
        return clientside;
    }

    public List<UrlEntity> getUrl() {
        return url;
    }

    public String getPattern() {
        return pattern;
    }

    public String getPlayercode() {
        return playercode;
    }

    public String getService() {
        return service;
    }

    public String getFilename() {
        return filename;
    }

    public String getServer() {
        return server;
    }

    public int getTotaltime() {
        return totaltime;
    }

    public String getVideoid() {
        return videoid;
    }

    public String getThumb() {
        return thumb;
    }

    public String getChannel() {
        return channel;
    }

    public String getId3title() {
        return id3title;
    }

    public static class UrlEntity {
        /**
         * text : YouTube Video <strong>High Definition (720p)</strong>, size: <strong>34 MB</strong>
         * filetype : MP4
         * checked : checked
         * url : https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&lmt=1429774354055988&dur=357.076&itag=22&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=video/mp4&upn=oy82RzgARfk&sparams=dur,id,initcwndbps,ip,ipbits,itag,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,ratebypass,requiressl,source,upn,expire&signature=A073C1657741BBA0DB10CFB83B148788C712516A.81D2AB3735A6F101C72FD92C54E6C094FADE708E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&initcwndbps=1020000&source=youtube&pl=25&ratebypass=yes&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&ms=au&expire=1439648217&sver=3&#type=mp4#size=35995882#audio=https://r4---sn-u2oxu-f5f6.googlevideo.com/videoplayback?ip=37.187.56.70&key=yt5&keepalive=yes&lmt=1429774104810746&dur=357.075&itag=140&id=o-AJ-NvfdLImfb4DNVF-gMIdhck70KjsWKnlDFG3nckLav&mime=audio/mp4&upn=oy82RzgARfk&sparams=clen,dur,gir,id,initcwndbps,ip,ipbits,itag,keepalive,lmt,mime,mm,mn,ms,mv,pcm2cms,pl,requiressl,source,upn,expire&signature=B268B29129F30A065C7E08B6E1A9BEA68263D56E.6455402BE31CCF48431764C02FB276459443446E&pcm2cms=yes&fexp=9406127,9407053,9408375,9408490,9408710,9409069,9409170,9412774,9415365,9415485,9416023,9416126,9416556,9417707,9418092,9418153,9418188,9418245,9418708&gir=yes&initcwndbps=1020000&source=youtube&pl=25&requiressl=yes&mm=31&mn=sn-u2oxu-f5f6&ipbits=0&mt=1439626559&mv=m&clen=5733533&ms=au&expire=1439648217&sver=3&ratebypass=yes#audiosize=5733533
         * size : 35995882
         */
        private String text;
        private String filetype;
        private String checked;
        private String url;
        private String size;

        public void setText(String text) {
            this.text = text;
        }

        public void setFiletype(String filetype) {
            this.filetype = filetype;
        }

        public void setChecked(String checked) {
            this.checked = checked;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getText() {
            return text;
        }

        public String getFiletype() {
            return filetype;
        }

        public String getChecked() {
            return checked;
        }

        public String getUrl() {
            return url;
        }

        public String getSize() {
            return size;
        }
    }
}
