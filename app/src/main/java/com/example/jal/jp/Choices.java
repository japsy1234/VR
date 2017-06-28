package com.example.jal.jp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Choices extends AppCompatActivity {

    public Button first_button;
    public Button second_button;

    public void init(){
        first_button = (Button)findViewById(R.id.video);
        second_button = (Button)findViewById(R.id.view);
        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(Choices.this,VR_Video.class);
                startActivity(view);
            }
        });
       second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent view2 = new Intent(Choices.this,PanoVr.class);
                startActivity(view2);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
        init();

    }


}
