package com.kgamail.saravut.my_v_class_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 10/6/2559.
 */
public class My_AdapVut extends  BaseAdapter {
                        private Context context;
                        private int[] ints;
                        private String[] detail_pic , longDetailPic;


    public My_AdapVut(Context context, int[] ints, String[] detail_pic, String[] longDetailPic) {
        this.context = context;
        this.ints = ints;
        this.detail_pic = detail_pic;
        this.longDetailPic = longDetailPic;
    }

    @Override
    public int getCount() {
        return ints.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View  viewLst = layoutInflater.inflate(R.layout.vut_listview,viewGroup, false);




        ImageView imageView = (ImageView) viewLst.findViewById(R.id.imageView3);
        imageView.setImageResource(ints[position]);

        //TextView textView = (TextView) viewLst.findViewById(R.id.textView2);
        //textView.setText(detail_pic[position]);

        //TextView textView1 = (TextView) viewLst.findViewById(R.id.textView3);
        //textView1.setText(longDetailPic[position]);

        return viewLst;
    }
}//ViewGroup
