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
    String screen = "";
    String operator = "";
    String right = "";
    String left = "";
    String saveOperator = "";

    BigDecimal val1 = new BigDecimal(left);
    BigDecimal val2 = new BigDecimal(right);
    BigDecimal result = new BigDecimal(0);

    Boolean noText = false;
    Boolean rightFlag = false;

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

    public void calculate(){

        TextView output = (TextView) findViewById(R.id.output);

        if(operator.equals("=")){
            if(saveOperator.equals("-")){
                result = val1.subtract(val2);
            }
            else if(saveOperator.equals("+")){
                result = val1.add(val2);
            }
            else if(saveOperator.equals("\u00D7")){
                result = val1.multiply(val2);
            }
            else if(saveOperator.equals("\u00F7")){
                result = val1.divide(val2);
            }
            else if(saveOperator.equals("%")){
                result = val1.remainder(val2);
            }
        }
        else{
            if(saveOperator.equals("-")){
                result = val1.subtract(val2);
            }
            else if(saveOperator.equals("+")){
                result = val1.add(val2);
            }
            else if(saveOperator.equals("\u00D7")){
                result = val1.multiply(val2);
            }
            else if(saveOperator.equals("\u00F7")){
                result = val1.divide(val2);
            }
            else if(saveOperator.equals("%")){
                result = val1.remainder(val2);
            }
            noText = true;
        }
        output.setText(result.toString());
        left = result.toString();
        right = "";
        rightFlag = false;
    }
    public void resetCalculator(View v){
        TextView output = (TextView) findViewById(R.id.output);
        output.setText("");
        left = "";
        right = "";
        rightFlag = false;
    }

    public void onClick(View v){

        String buttonText = ((Button) v).getText().toString();

        TextView output = (TextView) findViewById(R.id.output);

        if(buttonText.equals("0")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("1")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("2")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("3")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("4")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("5")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("6")) {
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("7")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("8")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("9")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("\u221A")){
            TextView t = (TextView)findViewById(R.id.output);
            t.setText("\u221A");
            val1 = val1.pow(1/2);
            t.append(screen);
        }
        else if (buttonText.equals("\u00F7")){

            if(rightFlag == false){
                operator = buttonText;
                saveOperator = operator;
                left = output.getText().toString();
                output.setText("");
                rightFlag = true;
            }
            else{
                right = output.getText().toString();
                calculate();
            }
        }
        else if (buttonText.equals("%")){
            if(rightFlag == false){
                operator = buttonText;
                saveOperator = operator;
                left = output.getText().toString();
                output.setText("");
                rightFlag = true;
            }
            else{
                right = output.getText().toString();
                calculate();
            }
        }
        else if (buttonText.equals("\u00D7")){
            if(rightFlag == false){
                operator = buttonText;
                saveOperator = operator;
                left = output.getText().toString();
                output.setText("");
                rightFlag = true;
            }
            else{
                right = output.getText().toString();
                calculate();
            }
        }
        else if (buttonText.equals("-")){

            if(rightFlag == false){
                operator = buttonText;
                saveOperator = operator;
                left = output.getText().toString();
                output.setText("");
                rightFlag = true;
            }
            else{
                right = output.getText().toString();
                calculate();
            }
        }
        else if (buttonText.equals("\u00b1")){
            if(noText){
                val1 = val1.negate();
            }
            else{
                val2 = val2.negate();
            }
        }
        else if (buttonText.equals(".")){
            if(noText){
                left = output.getText().toString();
                output.setText(left);
                rightFlag = true;
            }
            else{
                output.setText(output.getText()+buttonText);
            }
        }
        else if (buttonText.equals("+")){

            if(rightFlag == false){
                operator = buttonText;
                saveOperator = operator;
                left = output.getText().toString();
                output.setText("");
                rightFlag = true;
            }
            else{
                right = output.getText().toString();
                calculate();
            }
        }
        else if (buttonText.equals("=")){
            operator = buttonText;
            calculate();
        }
    }
}
