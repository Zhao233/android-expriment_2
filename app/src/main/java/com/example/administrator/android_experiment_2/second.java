package com.example.administrator.android_experiment_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/15.
 */

public class second extends Activity {
    TextView textView_1;
    TextView textView_2;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.test);

        textView_1 = (TextView) findViewById(R.id.textView2);
        textView_2 = (TextView) findViewById(R.id.textView3);

        textView_1.setText(getIntent().getStringExtra("mes_1"));
        textView_2.setText(getIntent().getStringExtra("mes_2"));
    }
}
