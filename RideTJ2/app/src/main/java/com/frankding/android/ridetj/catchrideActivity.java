package com.frankding.android.ridetj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class catchrideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catchride);

        String[] ridesArray = {"option1","option2","option3","option4"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_catchride, ridesArray);

        ListView listView = (ListView) findViewById(R.id.ridesList);
        listView.setAdapter(adapter);
    }
    
}
