package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // For the button functionality --> from https://www.studytonight.com/android/get-edittext-set-textview
    // These are the global variables
    EditText editText;
    TextView result;
    Button buttonSubmit, buttonReset;

    /*
    Using the id of views specified in layout XML
    we can initialize the view using findViewById
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        editText = (EditText) findViewById(R.id.EditText);
//        result = (TextView) findViewById(R.id.tvResult);
//        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
//        buttonReset = (Button) findViewById(R.id.buttonReset);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","SubmitButton clicked");
                // get text from EditText name view
                String userinput = editText.getText().toString();
                result.setText("Text:\t" + userinput);

            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("==>","ResetButton clicked");
                // clearing out all the values
                editText.setText("");
                result.setText("");
                editText.requestFocus();
            }
        });

    }

}