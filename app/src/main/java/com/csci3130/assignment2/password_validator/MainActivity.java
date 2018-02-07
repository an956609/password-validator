package com.csci3130.assignment2.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static com.csci3130.assignment2.password_validator.Validator.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view) {
        TextView dst = (TextView) findViewById(R.id.validation_text_display);
        EditText src = (EditText) findViewById(R.id.password_box);
        dst.setText(String.format("Strength: %d of %d",
                validate(src.getText().toString()), Validator.rules));
    }
}
