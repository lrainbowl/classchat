package com.example.rainbow.classchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    ListView listView;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        listView = (ListView) findViewById(R.id.window_List);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item, User.myClasses.toArray());
        listView.setAdapter(arrayAdapter);


    }

    public void joinClass(View view){
        startActivity(new Intent(UserActivity.this, JoinActivity.class));
    }





}
