package com.vrishankgupta.moksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vrishankgupta.moksha.SubEvents.MrMoksha;
import com.vrishankgupta.moksha.SubEvents.Rogue;
import com.vrishankgupta.moksha.SubEvents.Talent;

public class EventsActivityFashion extends AppCompatActivity {

    ImageView front_arrow,back_arrow,rogue,mr_moksha,talent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_fashion);

        front_arrow = findViewById(R.id.front_arrow);
        back_arrow = findViewById(R.id.back_arrow);
        rogue = findViewById(R.id.rogue);
        mr_moksha = findViewById(R.id.mr_moksha);
        talent = findViewById(R.id.talent);

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityAutomobile.class));
                finish();
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityDance.class));
                finish();
            }
        });


        rogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Rogue.class));
            }
        });

        mr_moksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MrMoksha.class));
            }
        });

        talent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Talent.class));
            }
        });
    }
}
