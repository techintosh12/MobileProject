package com.frankding.android.ridetj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailfield;
    private EditText mPassfield;
    private Button mLogin;
    private Button mSignup;
    private static String mUsername;
    private static String mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailfield = (EditText)findViewById(R.id.editText);
        mPassfield = (EditText)findViewById(R.id.editText2);
        mLogin = (Button)findViewById(R.id.button10);
        mSignup = (Button)findViewById(R.id.button11);

        mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mUsername = mEmailfield.getText().toString();
                mPassword = mPassfield.getText().toString();
            }
        });

        mSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

    }
}
