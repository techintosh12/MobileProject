package com.frankding.android.ridetj;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class catchrideActivity extends AppCompatActivity {

    private static User mUser;

    public static Intent newIntent(Context packageContext, User user) {
        Intent i = new Intent(packageContext, catchrideActivity.class);
        mUser = user;
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catchride);
    }
}
