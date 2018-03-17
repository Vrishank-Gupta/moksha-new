package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.moksha.SubEvents.Avalanche;
import com.vrishankgupta.moksha.SubEvents.Harmony;
import com.vrishankgupta.moksha.SubEvents.Kaleidoscope;
import com.vrishankgupta.moksha.SubEvents.Melody;
import com.vrishankgupta.moksha.SubEvents.Symphony;
import com.vrishankgupta.moksha.SubEvents.Tarang;
import com.vrishankgupta.moksha.SubEvents.Voice;

public class EventsActivityMusic extends AppCompatActivity {

    ImageView front_arrow,back_arrow,voice,melody,symphony,harmony,tarang,avalanche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_music);
        front_arrow = findViewById(R.id.front_arrow);
        back_arrow = findViewById(R.id.back_arrow);
        voice = findViewById(R.id.voice);
        melody = findViewById(R.id.melody);
        symphony = findViewById(R.id.symphony);
        harmony = findViewById(R.id.harmony);
        tarang = findViewById(R.id.tarang);
        avalanche = findViewById(R.id.avalanche);


        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityTheatre.class));
                finish();
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityLiterary.class));
                finish();
            }
        });

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Voice.class));
            }
        });

        melody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Melody.class));
            }
        });

        symphony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Symphony.class));
            }
        });
        harmony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Harmony.class));
            }
        });

        tarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Tarang.class));
            }
        });

        avalanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Avalanche.class));
            }
        });
    }
}
