package com.example.bgloh.broadcastexample;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyReceiver mReceiver;
    public static final String ACTION1 = "BroadcastReceiver1";
    public static final String ACTION2 = "BroadcastReceiver2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // broadcast
        Intent intent = new Intent();
        intent.setAction(ACTION2);
        sendBroadcast(intent);

    }
}
