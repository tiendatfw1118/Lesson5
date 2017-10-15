package com.example.phant.lesson5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UserInforAcitivty extends AppCompatActivity {

    private TextView txtUsername;

    private final static String TAG = UserInforAcitivty.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_infor_acitivty);

        txtUsername = (TextView) findViewById(R.id.txt_username);

        Intent intent = getIntent();

        if (intent != null){
            if(intent.hasExtra(MainActivity.USERNAME)){
                String username = intent.getExtras().getString(MainActivity.USERNAME);
                Log.d(TAG, "username: " + username);
                txtUsername.setText(username);
            }
        }
        else{
            Log.d(TAG, "null");
        }
    }
}
