package com.example.cradview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    CardView cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main  );
        cardview=findViewById(R.id.card);
       cardview.setRadius(5.0f);
       cardview.setCardElevation(11.0f);
       cardview.setUseCompatPadding(true);

    }
}