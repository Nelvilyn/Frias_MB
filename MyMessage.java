package com.example.swapperchecker;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class MyMessage extends Activity {
    TextView textview;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent secondActivity = getIntent();
        textview = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("message");
        textview.setText(result);

    }
}
