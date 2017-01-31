package com.frankding.android.ridetj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import static com.frankding.android.ridetj.R.id.editText;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullNameET;
    private EditText gradYearET;
    private EditText streetAddressET;
    private EditText cityET;
    private EditText stateET;
    private EditText passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullNameET = (EditText)(findViewById(R.id.fullNameET));
        gradYearET = (EditText)(findViewById(R.id.gradYearET));
        streetAddressET = (EditText)(findViewById(R.id.streetAddressET));
        cityET = (EditText)(findViewById(R.id.cityET));
        stateET = (EditText)(findViewById(R.id.stateET));
        passwordET = (EditText)(findViewById(R.id.passwordET));

        String fullName = fullNameET.getText().toString();
        int gradYear = Integer.parseInt(gradYearET.getText().toString());
        String streetAddress = streetAddressET.getText().toString();
        String city = cityET.getText().toString();
        String state = stateET.getText().toString();
        String password = passwordET.getText().toString();

        User newUser = new User(fullName, gradYear, streetAddress, password);

        //now, need to load newUser into Firebase database.
    }
}
