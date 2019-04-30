package com.example.stackoverflow;

public class datas {

    String tv;

    public datas() {
    }

    public datas(String tv) {
        this.tv = tv;
    }
    public void Changetext(String text)
    {
        tv=text;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
