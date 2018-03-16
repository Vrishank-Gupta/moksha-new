package com.vrishankgupta.moksha.SubEvents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vrishankgupta.moksha.R;

public class Soch extends AppCompatActivity {
    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soch_details);

        regButton = findViewById(R.id.regButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sanskriti3.typeform.com/to/LH8AF5?typeform-embed=embed-widget";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
