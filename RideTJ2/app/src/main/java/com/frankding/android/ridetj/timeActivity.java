package com.frankding.android.ridetj;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class timeActivity extends AppCompatActivity {
    private static User mUser;
    private Spinner mTimeslot;
    private CheckBox mDriving;
    private Button mContinue;

    public static Intent newIntent(Context packageContext,User user) {
        Intent i = new Intent(packageContext, timeActivity.class);
        mUser = user;
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        mTimeslot = (Spinner)findViewById(R.id.regionSPIN);
        mDriving = (CheckBox)findViewById(R.id.checkBox);
        mContinue = (Button)findViewById(R.id.contBTN);
    }
}
