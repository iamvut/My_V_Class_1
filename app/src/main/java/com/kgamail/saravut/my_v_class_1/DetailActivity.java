package com.kgamail.saravut.my_v_class_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //eplicit
    private TextView nameTextView, detaiTextView;   //ประกาศตัวแปรซ้อนกัน
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind widget
        nameTextView = (TextView) findViewById(R.id.textView4);
        detaiTextView =  (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

        //sHOW VIEW
        String strName = getIntent().getStringExtra("Name");

        nameTextView.setText(strName);

        int IntImage = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        imageView.setImageResource(IntImage);

        int intIndex = getIntent().getIntExtra("Index",0);
        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detaiTextView.setText(detailStrings[intIndex]);

    }  // Main Method

    public void clickBack(View view){
        finish();

    }

} //Main Class
