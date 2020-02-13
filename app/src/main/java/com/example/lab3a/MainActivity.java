package com.example.lab3a;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.*;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        BigDecimal val1;
        BigDecimal val2;
        String screen;
        String operator;

        String buttonText = ((Button) v).getText().toString();

        if(buttonText.equals("btn0")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("0");

        }
        else if (buttonText.equals("btn1")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("1");
        }
        else if (buttonText.equals("btn2")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("2");
        }
        else if (buttonText.equals("btn3")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("3");
        }
        else if (buttonText.equals("btn4")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("4");
        }
        else if (buttonText.equals("btn5")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("5");
        }
        else if (buttonText.equals("btn6")) {

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("6");
        }
        else if (buttonText.equals("btn7")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("7");
        }
        else if (buttonText.equals("btn8")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("8");
        }
        else if (buttonText.equals("btn9")){

            TextView t = (TextView)findViewById(R.id.output);
            t.setText("9");
        }
        else if (buttonText.equals("btnSqrt")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\\u221A");
            BigDec1 = BigDec1.pow(.5);
        }
        else if (buttonText.equals("btnClear")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("0");
        }
        else if (buttonText.equals("btnDivide")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\\u00F7");
            BigDec1 = BigDec1.divide(BigDec2);
        }
        else if (buttonText.equals("btnPercent")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("%");
        }
        else if (buttonText.equals("btnMultiply")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\\u00D7");
            BigDec1 = BigDec1.multiply(BigDec2);
        }
        else if (buttonText.equals("btnMinus")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("-");
            BigDec1 = BigDec1.subtract(BigDec2);
        }
        else if (buttonText.equals("btnSign")){
            BigDec1 = BigDec1.negate();
        }
        else if (buttonText.equals("btnDecimal")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText(".");
        }
        else if (buttonText.equals("btnPlus")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("+");
            BigDec1 = BigDec1.add(BigDec2);
        }
        else if (buttonText.equals("btnEquals")){

        }
    }
}
