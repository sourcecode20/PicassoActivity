package com.example.picassoactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {
    CircleImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Image = (CircleImageView) findViewById(R.id.image);
        /*Picasso.get().load("http://www.simonsellars.com/wp-content/uploads/2014/06/Google-Earth.jpg").into(Image);*/

        Glide.with(this).load("http://www.simonsellars.com/wp-content/uploads/2014/06/Google-Earth.jpg")
                .override(600,600).into(Image);




    }
}
