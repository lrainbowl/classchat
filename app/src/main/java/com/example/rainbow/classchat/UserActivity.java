package com.example.rainbow.classchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    public void joinClass(View view){
        startActivity(new Intent(UserActivity.this, JoinActivity.class));
    }
}
