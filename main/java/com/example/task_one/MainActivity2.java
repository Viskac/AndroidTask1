package com.example.task_one;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = findViewById(R.id.tv_one);
        TextView tv2 = findViewById(R.id.tv_two);
        TextView tv3 = findViewById(R.id.tv_thr);

        Intent i = getIntent();//接收1传过来的值
        tv1.setText(i.getStringExtra("date1"));
        tv2.setText(i.getStringExtra("date2"));
        tv3.setText(i.getStringExtra("date3"));
    }

    public void backMainActivity(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
