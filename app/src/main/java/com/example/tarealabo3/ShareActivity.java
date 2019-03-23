package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tarealabo3.util.AppConstants;

public class ShareActivity extends AppCompatActivity {
    private TextView sharedInfoTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        sharedInfoTV = findViewById(R.id.tv_shared_info);


        Intent mIntent = getIntent();
        if (mIntent != null){
            sharedInfoTV.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));

        }
    }
}
