package com.example.qpc1.viewpage_listview;

import android.widget.ImageView;

public class TraiCay {
    private String ten;
    private String mota;
    private int hinhanh;

    public TraiCay(String ten, String mota, int hinhanh) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;

    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}