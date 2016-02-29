package com.example.martin.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "montag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fab = (Button) findViewById(R.id.button2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, "button click");
                Intent goToContactList = new Intent(getApplicationContext(), ContactListActivity.class);
                startActivity(goToContactList);
            }
        });

    }

}
