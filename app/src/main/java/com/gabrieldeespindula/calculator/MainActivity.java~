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
import android.widget.Toast;
// You can find this import here: https://github.com/uklimaschewski/EvalEx
import com.udojava.evalex.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    HorizontalScrollView scroll;
    TextView textNumber;
    // continuous and single is used to know if menu checkable is checked or not.
    Boolean continuous = false;
    Boolean single = true;
    // expression is what will appear on the screen.
    String expression = "";
    // lastButtonWasASignal is used to not repeat the button or start the account with a sign.
    Boolean lastButtonWasASignal = true;
    // canComa will help to know when can put a comma and when can't put a comma.
    // canComa = 0 means it cannot have a comma because there is no number in front;
    // canComa = 1 means that there is a number and a comma can be added;
    // canComa = 3 means that the comma has already been used and is the last character;
    // canComa = 4 means that the comma has already been used and has other characters after it;
    int canComma = 0;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // verifying if continuous is checked.
        if (item.getItemId()==R.id.checkable_continuous) {
            if (item.isChecked()) {
                item.setChecked(false);
                continuous = false;
                return true;
            } else {
                item.setChecked(true);
                continuous = true;
                return true;
            }
        }
        // verifying if single is checked.
        if (item.getItemId()==R.id.checkable_single) {
            if (item.isChecked()) {
                item.setChecked(false);
                single = false;
                return true;
            } else {
                item.setChecked(true);
                single = true;
                return true;
            }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mapping interface elements
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

        // getting the button click.
        clear.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        equals.setOnClickListener(this);
        comma.setOnClickListener(this);
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // function so that if the user presses a button with the two menu checkable selected, a Toast appears.
        if (continuous && single){
            Toast.makeText(this, "Please, verify only one menu options.", Toast.LENGTH_SHORT).show();
        }
        // function so that if the user presses a button with no menu checkable selected, a Toast appears.
        if (!continuous && !single) {
            Toast.makeText(this, "Please verify one of the menu options.", Toast.LENGTH_SHORT).show();
        }
        // function that indicates the behavior of the buttons if the continuous mode is checked.
        if (continuous && !single){
            // C button action.
            if (v.getId()==R.id.button_clear){
                expression = "";
                lastButtonWasASignal = true;
                canComma = 0;
            }
            // 0 button action.
            if (v.getId()==R.id.button_zero){
                expression = expression + "0";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 1 button action.
            if (v.getId()==R.id.button_one){
                expression = expression + "1";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 2 button action.
            if (v.getId()==R.id.button_two){
                expression = expression + "2";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 3 button action.
            if (v.getId()==R.id.button_three){
                expression = expression + "3";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 4 button action.
            if (v.getId()==R.id.button_four){
                expression = expression + "4";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 5 button action.
            if (v.getId()==R.id.button_five){
                expression = expression + "5";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 6 button action.
            if (v.getId()==R.id.button_six){
                expression = expression + "6";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 7 button action.
            if (v.getId()==R.id.button_seven){
                expression = expression + "7";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 8 button action.
            if (v.getId()==R.id.button_eight){
                expression = expression + "8";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // 9 button action.
            if (v.getId()==R.id.button_nine){
                expression = expression + "9";
                lastButtonWasASignal = false;
                if (canComma==0){
                    canComma = 1;
                } if (canComma==3){
                    canComma = 4;
                }
            }
            // Division button action.
            if (v.getId()==R.id.button_division){
                // verifying if last button was a signal to not repeat.
                if (canComma==3){
                    expression = expression + "0";
                }
                if (!lastButtonWasASignal){
                    expression = expression + "÷";
                    lastButtonWasASignal = true;
                    canComma = 0;
                }
            }
            // Multiplication button action.
            if (v.getId()==R.id.button_multiplication){
                if (canComma==3){
                    expression = expression + "0";
                }
                if (!lastButtonWasASignal){
                    expression = expression + "×";
                    lastButtonWasASignal = true;
                    canComma = 0;
                }
            }
            // Minus button action.
            if (v.getId()==R.id.button_minus){
                if (canComma==3){
                    expression = expression + "0";
                }
                if (!lastButtonWasASignal){
                    expression = expression + "-";
                    lastButtonWasASignal = true;
                    canComma = 0;
                }
            }
            // Plus button action.
            if (v.getId()==R.id.button_plus){
                if (canComma==3){
                    expression = expression + "0";
                }
                if (!lastButtonWasASignal){
                    expression = expression + "+";
                    lastButtonWasASignal = true;
                    canComma = 0;
                }
            }
            if (v.getId()==R.id.button_comma){
                if (canComma==1){
                    expression = expression + ",";
                    canComma = 3;
                }
            }
            // setTextDirection is here because operations signal for some reason change text direction.
            textNumber.setTextDirection(View.TEXT_DIRECTION_LTR);
            textNumber.setText(expression);
            // fullScroll serves for the HorizontalScrollView to track where the textNumber is being
            // changed and not to stand still.
            scroll.fullScroll(View.FOCUS_RIGHT);
        }
    }
}
