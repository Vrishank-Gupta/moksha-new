package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.moksha.SubEvents.Kalakriti;
import com.vrishankgupta.moksha.SubEvents.Mudra;
import com.vrishankgupta.moksha.SubEvents.Oorja;
import com.vrishankgupta.moksha.SubEvents.Stepup;
import com.vrishankgupta.moksha.SubEvents.Zephyr;

public class EventsActivityDance extends AppCompatActivity {

    ImageView frontArrow,oorja,kalakriti,stepup,mudra,zephyr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_dance);

        frontArrow = findViewById(R.id.front_arrow);

        oorja = findViewById(R.id.oorja);
        kalakriti = findViewById(R.id.kalakriti);
        stepup = findViewById(R.id.stepup);
        mudra = findViewById(R.id.mudra);
        zephyr = findViewById(R.id.zephyr);



        oorja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Oorja.class));
            }
        });

        kalakriti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Kalakriti.class));
            }
        });


        stepup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Stepup.class));
            }
        });


        mudra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mudra.class));
            }
        });

        zephyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Zephyr.class));
            }
        });


        frontArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityFashion.class));
                finish();
            }
        });
    }
}
