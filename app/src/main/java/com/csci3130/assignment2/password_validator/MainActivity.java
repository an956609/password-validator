package com.csci3130.assignment2.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static com.csci3130.assignment2.password_validator.Validator.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EditText)findViewById(R.id.password_box)).addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ((TextView)findViewById(R.id.validation_text_display)).setText(
                        String.format("Strength: %d of %d",
                                validate(s.toString()), Validator.rules)
                );
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });
    }

    public void checkPassword(View view) {
        TextView dst = (TextView) findViewById(R.id.validation_text_display);
        EditText src = (EditText) findViewById(R.id.password_box);
        dst.setText(String.format("Strength: %d of %d",
                validate(src.getText().toString()), Validator.rules));
    }
}
