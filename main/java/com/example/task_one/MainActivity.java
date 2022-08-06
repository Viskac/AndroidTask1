package com.example.task_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         et1 = findViewById(R.id.firstnum);
         et2 = findViewById(R.id.secondnum);
    }

    public void starMainActivity2(View view) {//设置button跳转到MainActivity2，并传递数据
        Intent inte = new Intent(MainActivity.this, MainActivity2.class);
        //传递et1和et2的值给MainActivity2
        inte.putExtra("date1",et1.getText().toString());
        inte.putExtra("date2",et2.getText().toString());
        //将et1和et2转为string再转为int后计算结果
        int n1 = Integer.valueOf(et1.getText().toString()).intValue();
        int n2 = Integer.valueOf(et2.getText().toString()).intValue();
        int n3 = n1+n2;
        String inputText = String.valueOf(n3);
        //传递计算结果的值给MainActivity2
        inte.putExtra("date3",inputText);
       startActivity(inte);
    }
}