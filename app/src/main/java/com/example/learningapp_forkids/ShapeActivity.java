package com.example.learningapp_forkids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ShapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        String name = getIntent().getStringExtra("name").toLowerCase();
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();

        ImageView iv = findViewById(R.id.imageView2);
        int iid = getResources().getIdentifier(name,"drawable", getPackageName());
        iv.setImageResource(iid);

        int mid = getResources().getIdentifier(name,"raw", getPackageName());
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mid);
        mp.start();
    }
}