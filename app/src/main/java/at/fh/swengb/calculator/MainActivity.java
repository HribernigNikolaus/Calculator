package at.fh.swengb.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;

    private EditText editText2;

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editTextNumber1);
        editText2 = (EditText) findViewById(R.id.editTextNumber2);

        resultView = (TextView) findViewById(R.id.textViewResult);
    }

    public void calcAdd(View view) {

        String num1String = editText1.getText().toString();
        String num2String = editText2.getText().toString();

        double num1 = 0;
        double num2 = 0;

        try {
            num1=Double.parseDouble(num1String);
            num2=Double.parseDouble(num2String);

            double result = num1+num2;

            resultView.setText(num1String+" + "+num2String+" = "+result);
        } catch (NumberFormatException e) {

            resultView.setText("WRONG INPUT!!");
            e.printStackTrace();
        }


    }

    public void calcSubtract(View view) {

        String num1String = editText1.getText().toString();
        String num2String = editText2.getText().toString();

        double num1 = 0;
        double num2 = 0;

        try {
            num1=Double.parseDouble(num1String);
            num2=Double.parseDouble(num2String);

            double result = num1-num2;

            resultView.setText(num1String+" - "+num2String+" = "+result);
        } catch (NumberFormatException e) {

            resultView.setText("WRONG INPUT!!");
            e.printStackTrace();
        }


    }

    public void showAbout(View view) {
        Intent intent = new Intent(this, DisplayAboutActivity.class);
        String message = resultView.getText().toString();
        intent.putExtra("data",message);
        startActivity(intent);
    }
}