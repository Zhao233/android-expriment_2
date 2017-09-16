package com.example.administrator.android_experiment_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button jump;

    EditText mes1;
    EditText mes2;

    Intent jumpToSecond = new Intent(MainActivity.this, second.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jump = (Button) findViewById(R.id.button);
        mes1 = (EditText) findViewById(R.id.message_1);
        mes2 = (EditText) findViewById(R.id.message_2);

        jumpToSecond.putExtra("mes_1", mes1.getText());
        jumpToSecond.putExtra("mes_2", mes2.getText());

        jump.setOnClickListener( e -> startActivity(jumpToSecond));
    }
}
