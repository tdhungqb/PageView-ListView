package com.example.qpc1.viewpage_listview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private List<TraiCay> mTraiCay;
    private int mLayout;
    private Context mContext;

    public TraiCayAdapter(List<TraiCay> mTraiCay, int mLayout, Context mContext) {
        this.mTraiCay = mTraiCay;
        this.mLayout = mLayout;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mTraiCay.size();
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
        //initViews
        TextView tvTen = (TextView) mView.findViewById(R.id.tvName);
        TextView tvMota = (TextView) mView.findViewById(R.id.tvMota);
        ImageView imageView = (ImageView) mView.findViewById(R.id.imageView);

        //SetData
        TraiCay traiCay = mTraiCay.get(position);
        tvTen.setText(traiCay.getTen());
        tvMota.setText(traiCay.getMota());
        imageView.setImageResource(traiCay.getHinhanh());

        return mView;

    }

}