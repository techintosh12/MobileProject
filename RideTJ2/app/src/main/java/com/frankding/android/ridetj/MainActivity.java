package com.frankding.android.ridetj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailfield;
    private EditText mPassfield;
    private Button mLogin;
    private Button mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailfield = (EditText)findViewById(R.id.editText);
        mPassfield = (EditText)findViewById(R.id.editText2);
        mLogin = (Button)findViewById(R.id.button10);
        mSignup = (Button)findViewById(R.id.button11);

    }
}
