package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNum1, edtNum2, edtNum3;
    private TextView txtResults;
    String str1, str2;
    int num1, num2, num3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddClick(View view){
        if(getNumber()){
            int sum = num1 + num2 + num3;
            txtResults.setText("Answer : " + Integer.toString(sum));

        }
    }

    public void onSubClick(View view) {
        if (getNumber()) {
            int sum = num1 - num2 - num3;
            txtResults.setText("Answer : " + Integer.toString(sum));

        }
    }
    public void onMultiClick(View view) {
        if (getNumber()) {
            int sum = num1 * num2 * num3;
            txtResults.setText("Answer : " + Integer.toString(sum));

        }
    }
    public void onDivClick(View view) {
        if (getNumber()) {
            double sum = num1 / num2 / num3;
            txtResults.setText("Answer : " + Double.toString(sum));

        }
    }

    public void onClearClick(View view) {
        edtNum1.setText("");
        edtNum2.setText("");
        edtNum3.setText("");
        txtResults.setText("");
    }

    public Boolean getNumber() {
        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);
        edtNum3 = (EditText) findViewById(R.id.edtNum2);

        txtResults = (TextView) findViewById(R.id.txtAnswer);

        str1 = edtNum1.getText().toString();
        str2 = edtNum2.getText().toString();
        str2 = edtNum3.getText().toString();
        if((str1.equals(null) && str2.equals(null)) || (str1.equals("") && str2.equals(""))){
            String res = "Please enter a value";
            txtResults.setText(res);
            return false;

        } else {
            num1 = Integer.parseInt(edtNum1.getText().toString());
            num2 = Integer.parseInt(edtNum2.getText().toString());
            num3 = Integer.parseInt(edtNum3.getText().toString());
        }
        return true;

    }
}