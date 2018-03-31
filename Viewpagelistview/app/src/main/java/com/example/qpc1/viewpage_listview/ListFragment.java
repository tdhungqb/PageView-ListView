package com.example.qpc1.viewpage_listview;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    private View mView;
    private ListView mListView;
    private List<TraiCay> mTraiCay;
    private List<ThoiTiet> mThoiTiet;
    private static final String KEY = "position";

    public static ListFragment newInstance(int position){
        ListFragment listFragment = new ListFragment();
        Bundle arg = new Bundle();
        arg.putInt(KEY,position);
        listFragment.setArguments(arg);
        return listFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_list, container, false);
        initListOfTraiCay();
        initListOfThoiTiet();
        initListView();
        return mView;
    }

    private void initListView() {
        mListView = (ListView)mView.findViewById(R.id.lvNoiDung);
        int position = getArguments().getInt(KEY);
        switch (position){
            case 0 :
                TraiCayAdapter traiCayAdapter = new TraiCayAdapter(mTraiCay,R.layout.dongtraicay,getContext() );
                mListView.setAdapter(traiCayAdapter);
                break;
            case 1:
                ThoiTietAdapter thoiTietAdapter = new ThoiTietAdapter(mThoiTiet,R.layout.dongthoitiet,getContext());
                mListView.setAdapter(thoiTietAdapter);
                break;
        }
    }

    private void initListOfTraiCay() {
        mTraiCay = new ArrayList<>();
        mTraiCay.add(new TraiCay("Tao","Tao tau",R.drawable.tao));
        mTraiCay.add(new TraiCay("Bo","Qua Bo",R.drawable.bo));
        mTraiCay.add(new TraiCay("Oi","Qua Oi",R.drawable.oi));
    }

    private void initListOfThoiTiet(){
        mThoiTiet = new ArrayList<>();
        mThoiTiet.add(new ThoiTiet("Ha noi","Nang",R.drawable.sun));
        mThoiTiet.add(new ThoiTiet("Da Nang","Mua",R.drawable.rainfall));
    }

}
