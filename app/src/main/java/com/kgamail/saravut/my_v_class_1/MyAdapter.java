package com.kgamail.saravut.my_v_class_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 5/6/2559.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private int[] ints;
    private String[] nameStrings, detailStrings;


    public MyAdapter(Context context,
                     int[] ints,
                     String[] nameStrings,
                     String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.nameStrings = nameStrings;
        this.detailStrings = detailStrings;
    }// constructor  By  Alt+ insert

    @Override
    public int getCount() {
        return ints.length;  //กำหนดให้นับของวัตถุ จากรูปที่น้ำเข้าา
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        // คือการใส่ค่าให้กับ listview ที่ออกเแบบ ไว้หน้า Xml ผานตัว context
        //open Service getview
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  //connect to mainactivicy
        View view1 = layoutInflater.inflate(R.layout.my_listview,viewGroup,false);

        // for image
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(ints[i]);

        // for Text view
        TextView nameTextView = (TextView) view1.findViewById(R.id.textView2);
        nameTextView.setText(nameStrings[i]);

        TextView detialTextView = (TextView) view1.findViewById(R.id.textView3);
        detialTextView.setText(detailStrings[i]);


        return view1;
    }
}// Mainclass
