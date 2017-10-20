package com.shashank.sony.calcylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.shashank.sony.calcylib.Calculate;

public class MainActivity extends AppCompatActivity {
    TextView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(TextView) findViewById(R.id.textView);
        l1.setText(""+Calculate.Arithmetic_Progression(5,5,5).getSumofnthtermofAP());
    }
}
