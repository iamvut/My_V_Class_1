package com.kgamail.saravut.my_v_class_1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit  Variable  Fom Memory On smart phone
    private ListView trafficListView;
    private Button aboutmeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Statement

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);

        //  Controller Code

        controllerButton();


    }// Main method

    private void controllerButton() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code Sound On button
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.bee);
                mediaPlayer.start();



            }
        });



    }

} //main Class
