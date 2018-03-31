package com.example.qpc1.viewpage_listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThoiTietAdapter extends BaseAdapter {
    private List<ThoiTiet> mThoiTiet;
    private int mLayout;
    private Context mContext;

    public ThoiTietAdapter(List<ThoiTiet> mThoiTiet, int mLayout, Context mContext) {
        this.mThoiTiet = mThoiTiet;
        this.mLayout = mLayout;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThoiTiet.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View mView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mView = inflater.inflate(mLayout,null);

        //initView
        TextView tvDiaPhuong = (TextView) mView.findViewById(R.id.tvDiaPhuong);
        TextView tvThoiTiet = (TextView) mView.findViewById(R.id.tvThoiTiet);
        ImageView imgThoiTiet = (ImageView) mView.findViewById(R.id.imageThoiTiet);

        //SetData
        ThoiTiet thoiTiet = mThoiTiet.get(position);
        tvDiaPhuong.setText(thoiTiet.getDiaPhuong());
        tvThoiTiet.setText(thoiTiet.getThoiTiet());
        imgThoiTiet.setImageResource(thoiTiet.getHaThoiTiet());
        return mView;

    }
}