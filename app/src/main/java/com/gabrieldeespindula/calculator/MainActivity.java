package com.gabrieldeespindula.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    HorizontalScrollView scroll;
    TextView textNumber;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.isChecked()){
            item.setChecked(false);
            return true;
        }
        else {
            item.setChecked(true);
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scroll = findViewById(R.id.scroll);
        textNumber = findViewById(R.id.text_numbers);
        Button clear = findViewById(R.id.button_clear);
        Button division = findViewById(R.id.button_division);
        Button multiplication = findViewById(R.id.button_multiplication);
        Button minus = findViewById(R.id.button_minus);
        Button plus = findViewById(R.id.button_plus);
        Button equals = findViewById(R.id.button_equals);
        Button comma = findViewById(R.id.button_comma);
        Button zero = findViewById(R.id.button_zero);
        Button one = findViewById(R.id.button_one);
        Button two = findViewById(R.id.button_two);
        Button three = findViewById(R.id.button_three);
        Button four = findViewById(R.id.button_four);
        Button five = findViewById(R.id.button_five);
        Button six = findViewById(R.id.button_six);
        Button seven = findViewById(R.id.button_seven);
        Button eight = findViewById(R.id.button_eight);
        Button nine = findViewById(R.id.button_nine);

    }

    @Override
    public void onClick(View v) {

    }
}
