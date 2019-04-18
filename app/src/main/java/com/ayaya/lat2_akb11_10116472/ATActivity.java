package com.ayaya.lat2_akb11_10116472;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Adhitya Kuncoro Jatti
    10116472
    IF 11/AKB 11
    16-04-2019
 */

public class ATActivity extends AppCompatActivity {

    Button at;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at);

        at = findViewById(R.id.athere);
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ATActivity.this, VerifyActivity.class);
                startActivity(i);
            }
        });
    }
}
