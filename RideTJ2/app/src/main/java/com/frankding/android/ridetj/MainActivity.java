package com.frankding.android.ridetj;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailfield;
    private EditText mPassfield;
    private Button mLogin;
    private Button mSignup;
    private User mNewUser;
    private ArrayList<String> mSignInfo;
    private static String mUsername;
    private static String mPassword;
    private Firebase ref;
    private static final String FIREBASE_URL = "https://ridetj-e12cb.firebaseio.com/";
    private static final int REQUEST_CODE_USER = 1;

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK)
            return;
        if (requestCode == REQUEST_CODE_USER){
            if(data==null)
                return;
            mSignInfo = RegisterActivity.user(data);
            mNewUser = new User(mSignInfo.get(0),mSignInfo.get(1),mSignInfo.get(2),mSignInfo.get(3));
            ref.child("0").setValue(mNewUser);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        ref = new Firebase(FIREBASE_URL);


        mEmailfield = (EditText)findViewById(R.id.editText);
        mPassfield = (EditText)findViewById(R.id.editText2);
        mLogin = (Button)findViewById(R.id.button10);
        mSignup = (Button)findViewById(R.id.button11);

        mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mUsername = mEmailfield.getText().toString();
                mPassword = mPassfield.getText().toString();
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot){

                    }
                    @Override
                    public void onCancelled(FirebaseError databaseError){
                        System.out.println("The read failed: "+databaseError.getCode());
                    }

                });
            }
        });

        mSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = RegisterActivity.newIntent(MainActivity.this);
                startActivityForResult(i,REQUEST_CODE_USER);
            }
        });

    }
}
