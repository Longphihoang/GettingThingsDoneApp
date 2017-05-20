package com.example.along.gettingthingsdoneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MiddleTab extends AppCompatActivity {
    Button middleTab,lefTab,rightTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todopage);
        initTabs();

        LinearLayout layout = AndTools.getHorLayout(this);


    }


    public void 

    public void initTabs()
    {
        middleTab = (Button) findViewById(R.id.middleTab);
        lefTab = (Button) findViewById(R.id.leftTab);
        rightTab = (Button) findViewById(R.id.rightTab);

        lefTab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MiddleTab.this,LeftTab.class);
                startActivity(intent);
            }
        });

        rightTab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MiddleTab.this,RightTab.class);
                startActivity(intent);
            }
        });
    }
}
