package com.example.rainbow.classchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class UserActivity extends AppCompatActivity {

    ListView listView;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        listView = (ListView) findViewById(R.id.window_List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, User.myEvents);
        listView.setAdapter(arrayAdapter);


    }

    public void addEvent(View view){
        startActivity(new Intent(UserActivity.this, JoinActivity.class));
    }





}
