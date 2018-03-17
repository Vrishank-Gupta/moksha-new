package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.moksha.SubEvents.Afsaana;
import com.vrishankgupta.moksha.SubEvents.Alfaaz;
import com.vrishankgupta.moksha.SubEvents.Brahmastra;
import com.vrishankgupta.moksha.SubEvents.Kaleidoscope;
import com.vrishankgupta.moksha.SubEvents.Khayaal;
import com.vrishankgupta.moksha.SubEvents.Verbum;

public class EventsActivityLiterary extends AppCompatActivity {

    ImageView front_arrow,back_arrow,alfaaz,khayal,verbum,afsaana,brahma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_literary);
        front_arrow = findViewById(R.id.front_arrow);
        back_arrow = findViewById(R.id.back_arrow);
        alfaaz = findViewById(R.id.alfaaz);
        khayal = findViewById(R.id.khayal);
        verbum = findViewById(R.id.verbum);
        afsaana = findViewById(R.id.afsana);
        brahma = findViewById(R.id.brahma);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityMusic.class));
                finish();
            }
        });

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityInformals.class));
                finish();
            }
        });

        alfaaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Alfaaz.class));
            }
        });

        khayal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Khayaal.class));
            }
        });

        verbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Verbum.class));
            }
        });

        afsaana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Afsaana.class));
            }
        });

        brahma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Brahmastra.class));
            }
        });

    }
}
