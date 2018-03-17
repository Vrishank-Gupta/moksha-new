package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.moksha.SubEvents.Kaleidoscope;
import com.vrishankgupta.moksha.SubEvents.Parwaaz;
import com.vrishankgupta.moksha.SubEvents.Soch;

public class EventsActivityTheatre extends AppCompatActivity {

    ImageView back_arrow,soch,parwaz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_theatre);

        back_arrow = findViewById(R.id.back_arrow);
        soch = findViewById(R.id.soch);
        parwaz = findViewById(R.id.parwaaz);


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityMusic.class));
                finish();
            }
        });

        soch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Soch.class));
            }
        });

        parwaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Parwaaz.class));
            }
        });
    }
}
