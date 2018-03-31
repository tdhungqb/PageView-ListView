package com.example.qpc1.viewpage_listview;

public class ThoiTiet {
    private String diaPhuong;
    private String thoiTiet;
    private int haThoiTiet;

    public ThoiTiet(String diaPhuong, String thoiTiet, int haThoiTiet) {
        this.diaPhuong = diaPhuong;
        this.thoiTiet = thoiTiet;
        this.haThoiTiet = haThoiTiet;
    }

    public String getDiaPhuong() {
        return diaPhuong;
    }

    public void setDiaPhuong(String diaPhuong) {
        this.diaPhuong = diaPhuong;
    }

    public String getThoiTiet() {
        return thoiTiet;
    }

    public void setThoiTiet(String thoiTiet) {
        this.thoiTiet = thoiTiet;
    }

    public int getHaThoiTiet() {
        return haThoiTiet;
    }

    public void setHaThoiTiet(int haThoiTiet) {
        this.haThoiTiet = haThoiTiet;
    }
}