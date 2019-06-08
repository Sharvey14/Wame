package com.shannon.student.wame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewbieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbie);
    }
    public void openSchool (View view){
        Intent i = new Intent(this, SchoolActivity.class);
        startActivity(i);
    }
}
