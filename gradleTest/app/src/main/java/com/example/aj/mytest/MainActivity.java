package com.example.aj.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_test = (Button) findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                System.out.print("dfdf");
                Toast.makeText(MainActivity.this,"测试",Toast.LENGTH_LONG).show();;
            }
        });
    }
}
