package com.example.roy.buttonquestthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        i = 0;
    }

    public void click(View view) {
        i=i+1;
        btn.setText("This is a click number:"+i);
        if (i>6){
            i=0;
            btn.setText("Enough to click. Go to new start");

        }
    }
}
