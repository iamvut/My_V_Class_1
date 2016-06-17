package com.kgamail.saravut.my_v_class_1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Explicit  Variable  Fom Memory On smart phone
    private ListView trafficListView;
    private Button aboutmeButton,swButton;
    private String urlyoutubeString = "https://youtu.be/0h3NeVv8AGg";
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Statement

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);
        swButton = (Button) findViewById(R.id.button4);
        i = 0;
        //  Controller Code

        controllerButton();


        //controller listview

        controllListview();

        switchButton();
    }// Main method

    private void controllListview() {

        // Setup fo name
        //final String[] nameStrings = new String[20];
        //nameStrings[0] = "หัวข้อหลักที่ 1";
        //nameStrings[1] = "หัวข้อหลักที่ 2";
        //nameStrings[2] = "หัวข้อหลักที่ 3";
        //nameStrings[3] = "หัวข้อหลักที่ 4";
        //nameStrings[4] = "หัวข้อหลักที่ 5";
        //nameStrings[5] = "หัวข้อหลักที่ 6";
        //nameStrings[6] = "หัวข้อหลักที่ 7";
        //nameStrings[7] = "หัวข้อหลักที่ 8";
        //nameStrings[8] = "หัวข้อหลักที่ 9";
        //nameStrings[9] = "หัวข้อหลักที่ 10";
        //nameStrings[10] = "หัวข้อหลักที่ 11";
        //nameStrings[11] = "หัวข้อหลักที่ 12";
        //nameStrings[12] = "หัวข้อหลักที่ 13";
        //nameStrings[13] = "หัวข้อหลักที่ 14";
        //nameStrings[14] = "หัวข้อหลักที่ 15";
        //nameStrings[15] = "หัวข้อหลักที่ 16";
        //nameStrings[16] = "หัวข้อหลักที่ 17";
        //nameStrings[17] = "หัวข้อหลักที่ 18";
        //nameStrings[18] = "หัวข้อหลักที่ 19";
        //nameStrings[19] = "หัวข้อหลักที่ 20";


        hName hName1 = new hName();
        final String[] strings = hName1.getHname();

        // / for detail short
        String[] detaiStrings = getResources().getStringArray(R.array.detail_short);


        // for image โดยการเรียกใช้ Class myData .ใน java

        MyData myData = new MyData();
        final int[] ints = myData.getInts();

        //MyImg myImg = new MyImg();
        //final int[] ints = myImg.getImgs();


        //Create Listview เรียกใช้คำสั่ง class adapter
       MyAdapter myAdapter = new MyAdapter(this, ints,strings, detaiStrings);
       trafficListView.setAdapter(myAdapter);

        //My_AdapVut my_adapVut = new My_AdapVut(this, ints,strings, detaiStrings);
        //trafficListView.setAdapter(my_adapVut);

        // การเรียกหน้าใหม่ DetailActivity จากการกดเลือก item ใน list view
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW);

                if (position == 0){
                    intent.setData(Uri.parse("https://youtu.be/yN7y1OhoIwo"));

                }else if (position==1){
                    intent.setData(Uri.parse("https://youtu.be/lxVlBBH9FMA"));
                }else if (position==2) {
                    intent.setData(Uri.parse("https://youtu.be/X7kEsbC_tMw"));
                }else if (position==3) {
                    intent.setData(Uri.parse("https://youtu.be/RGxkuoVym_I"));
                }else if (position==4) {
                    intent.setData(Uri.parse("https://youtu.be/aol5rEvFaG0"));
                }

                //int duration = Toast.LENGTH_SHORT;
                //Context context = getApplicationContext();
                //String Txtmsg =  String.valueOf(position);
                Toast toast = Toast.makeText(getApplicationContext(), "ตำแหน่ง "+ String.valueOf(position), Toast.LENGTH_SHORT);
                toast.show();
                startActivity(intent);
                //Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                //intent.putExtra("Name",strings[position]);  //ส่งชื่อไป detailAct
                //intent.putExtra("Image", ints[position]);
                //intent.putExtra("Index", position);
                //startActivity(intent);



            }
        });

    } // ControlListview


    private void controllerButton() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code Sound On button
                //MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bee);
                //mediaPlayer.start();

                //web view   for link youtube
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlyoutubeString));
                startActivity(intent);




            }
        });


    }

    private void switchButton(){
        swButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hName hName1 = new hName();
                final String[] strings = hName1.getHname();

                String[] detaiStrings = getResources().getStringArray(R.array.detail_short);



                if (i == 0) {
                    swButton.setText("Adapter");
                    i = 1;

                    MyImg myImg = new MyImg();
                    final int[] ints = myImg.getImgs();
                    My_AdapVut my_adapVut = new My_AdapVut(getApplicationContext(), ints,strings, detaiStrings);
                    trafficListView.setAdapter(my_adapVut);
                }else{
                    swButton.setText("Adater_vut");
                    i =0;

                    MyData myData = new MyData();
                    final int[] ints = myData.getInts();

                    MyAdapter myAdapter = new MyAdapter(getApplicationContext(), ints,strings, detaiStrings);
                    trafficListView.setAdapter(myAdapter);

                    }





            }
        });


    }

} //main Class
