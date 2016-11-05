package com.example.shaloin.sixthassignmenta;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements SimpleAddition.MyClickListener{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textViewID);
    }

    @Override
    public void getText(String text) {
        FragmentManager manager=getSupportFragmentManager();
        SimpleAddition fragment1=(SimpleAddition)manager.findFragmentById(R.id.fragment1);
        textView.setText(text);
    }
}
