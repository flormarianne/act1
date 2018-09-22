package com.example.flor.act1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);

        Button click = (Button) findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText input1 = (EditText) findViewById(R.id.input1);
                EditText input2 = (EditText) findViewById(R.id.input2);
                TextView result = (TextView) findViewById(R.id.result);

                int inp1 = input1.getInputType();
                int inp2 = input2.getInputType();
                int res;

                res = inp1 - inp2;

                if(res>0) {
                    result.setText(inp1 + " is a number greater than " + inp2 + ".");
                }else if(res<0) {
                    result.setText(inp2 + " is a number greater than " + inp1 + ".");
                }else{
                    result.setText(inp1 + " and " + inp2 + "are equal numbers.");

                }
            }
        }); }}
