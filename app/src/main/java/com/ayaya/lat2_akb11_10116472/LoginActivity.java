package com.ayaya.lat2_akb11_10116472;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
    Adhitya Kuncoro Jatti
    10116472
    IF 11/AKB 11
    16-04-2019
 */

public class LoginActivity extends AppCompatActivity {
    Button  connec_fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connec_fb = findViewById(R.id.connectFB);
        connec_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }

    public void onClick(View v){
        Intent intent = null;
        switch (v.getId()){
            case R.id.regist:
                intent = new Intent(this, RegisterActivity.class);
                break;
        }
            if (null!=intent) startActivity(intent);
    }

}
