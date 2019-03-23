package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarealabo3.util.AppConstants;

public class NewActivity extends AppCompatActivity {
    private TextView userNameTV;
    private TextView passwordTV;
    private TextView emailTV;
    private TextView genderTV;
    private Button shareBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        userNameTV = findViewById(R.id.tv_username);
        passwordTV = findViewById(R.id.tv_password);
        emailTV = findViewById(R.id.tv_email);
        genderTV = findViewById(R.id.tv_gender);
        shareBT = findViewById(R.id.btn_share);

        Intent mIntent = this.getIntent();
        if (mIntent != null){
            userNameTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_USERNAME));
            passwordTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_PASSWORD));
            emailTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_EMAIL));
            genderTV.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY_GENDER));
        }

        shareBT.setOnClickListener(v->{
            ShareInfo();
        });
    }


    private void ShareInfo(){

        Intent m2Intent = new Intent ();
        m2Intent.setAction((Intent.ACTION_SEND));
        m2Intent.setType("text/plain");
        m2Intent.putExtra(Intent.EXTRA_TEXT, "Username:   " + userNameTV.getText().toString() +
                                                    "\nPassword:  " + passwordTV.getText().toString()+
                                                    "\nEmail:   " + emailTV.getText().toString()+
                                                    "\nGender:  " + genderTV.getText().toString() );

        startActivity(m2Intent);

    }
}
