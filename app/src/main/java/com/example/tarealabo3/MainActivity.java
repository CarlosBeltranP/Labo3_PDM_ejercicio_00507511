package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarealabo3.util.AppConstants;

public class MainActivity extends AppCompatActivity {
    private EditText userNameET;
    private EditText emailET;
    private EditText passwordET;
    private EditText genderET;
    private Button sendBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = findViewById(R.id.et_username);
        passwordET = findViewById(R.id.et_password);
        emailET = findViewById(R.id.et_email);
        genderET = findViewById(R.id.et_gender);
        sendBT = findViewById(R.id.btn_send);

        sendBT.setOnClickListener(v->{
            SendInfo();
        });
    }


    private void SendInfo(){
        Intent mIntent = new Intent (MainActivity.this, NewActivity.class);
        mIntent.putExtra(AppConstants.TEXT_KEY_USERNAME, userNameET.getText().toString());
        mIntent.putExtra(AppConstants.TEXT_KEY_PASSWORD, passwordET.getText().toString());
        mIntent.putExtra(AppConstants.TEXT_KEY_EMAIL, emailET.getText().toString());
        mIntent.putExtra(AppConstants.TEXT_KEY_GENDER, genderET.getText().toString());

        startActivity(mIntent);

    }
}
