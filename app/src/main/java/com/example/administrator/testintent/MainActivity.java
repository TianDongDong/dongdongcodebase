package com.example.administrator.testintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }
}
