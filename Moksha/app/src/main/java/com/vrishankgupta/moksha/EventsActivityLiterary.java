package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EventsActivityLiterary extends AppCompatActivity {

    ImageView front_arrow,back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_literary);
        front_arrow = findViewById(R.id.front_arrow);
        back_arrow = findViewById(R.id.back_arrow);

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

    }
}
