package com.example.rainbow.classchat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends AppCompatActivity {
    private android.widget.AutoCompleteTextView eventName;


    public void add() {
        String newEvent = eventName.getText().toString();
        if (User.myEvents.contains(newEvent)) {
            return;
        }
        User.myEvents.add(newEvent);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        eventName = (AutoCompleteTextView) findViewById(R.id.eventName);

        Button joinBottom = (Button) findViewById(R.id.button3);
        joinBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
                startActivity(new Intent(JoinActivity.this, UserActivity.class));

            }
        }
        );
    }
}