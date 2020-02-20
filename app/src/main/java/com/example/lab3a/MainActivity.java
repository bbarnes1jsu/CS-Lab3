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
        BigDecimal val1 = null;
        BigDecimal val2 = null;
        String screen = "";
        String operator = "";

        String buttonText = ((Button) v).getText().toString();

        if(buttonText.equals("0")){
            val1 = BigDecimal.valueOf(0);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("0");
            t.append(screen);
        }
        else if (buttonText.equals("1")){
            val1 = BigDecimal.valueOf(1);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("1");
            t.append(screen);
        }
        else if (buttonText.equals("2")){
            val1 = BigDecimal.valueOf(2);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("2");
            t.append(screen);
        }
        else if (buttonText.equals("3")){
            val1 = BigDecimal.valueOf(3);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("3");
            t.append(screen);
        }
        else if (buttonText.equals("4")){
            val1 = BigDecimal.valueOf(4);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("4");
            t.append(screen);
        }
        else if (buttonText.equals("5")){
            val1 = BigDecimal.valueOf(5);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("5");
            t.append(screen);
        }
        else if (buttonText.equals("6")) {
            val1 = BigDecimal.valueOf(6);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("6");
            t.append(screen);
        }
        else if (buttonText.equals("7")){
            val1 = BigDecimal.valueOf(7);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("7");
            t.append(screen);
        }
        else if (buttonText.equals("8")){
            val1 = BigDecimal.valueOf(8);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("8");
            t.append(screen);
        }
        else if (buttonText.equals("9")){
            val1 = BigDecimal.valueOf(9);
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("9");
            t.append(screen);
        }
        else if (buttonText.equals("\u221A")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\u221A");
            val1 = val1.pow(1/2);
            t.append(screen);
        }
        else if (buttonText.equals("C")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("0");
        }
        else if (buttonText.equals("\u00F7")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\u00F7");
            val1 = val1.divide(val2);
            t.append(screen);
        }
        else if (buttonText.equals("%")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("%");
            t.append(screen);
        }
        else if (buttonText.equals("\u00D7")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\u00D7");
            val1 = val1.multiply(val2);
            t.append(screen);
        }
        else if (buttonText.equals("-")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("-");
            val1 = val1.subtract(val2);
            t.append(screen);
        }
        else if (buttonText.equals("\u00b1")){
            val1 = val1.negate();
        }
        else if (buttonText.equals(".")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText(".");
            t.append(screen);
        }
        else if (buttonText.equals("+")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("+");
            val1 = val1.add(val2);
            t.append(screen);
        }
        else if (buttonText.equals("=")){

        }
    }
}
