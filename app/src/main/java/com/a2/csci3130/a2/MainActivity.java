package com.a2.csci3130.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void validatePassword(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String password = editText.getText().toString();

        Validator validate=new Validator();
        validate.setPwd(password);
        boolean getResult=validate.getValidation();
        sendMessage(getResult);

    }
    public void sendMessage(boolean getResult){
        String message=null;
        if(!getResult){
            message="Not Strong";
        }
        TextView textView = findViewById(R.id.textValidation);
        textView.setText(message);
    }
}
