package com.frankding.android.ridetj;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;

public class catchrideActivity extends AppCompatActivity {

    private static User mUser;
    private Firebase ref;
    private static final String FIREBASE_URL = "https://ridetj-e12cb.firebaseio.com/";

    public static Intent newIntent(Context packageContext, User user) {
        Intent i = new Intent(packageContext, catchrideActivity.class);
        mUser = user;
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catchride);

        Firebase.setAndroidContext(this);
        ref = new Firebase(FIREBASE_URL);

        String userInfo = ref.child(mUser.getUsername()).toString();

        String[] rideArray = {userInfo};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_catchride, rideArray);

        ListView listView = (ListView) findViewById(R.id.rideListLV);
        listView.setAdapter(adapter);
    }
}
