package com.example.bgloh.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        // This method is called when this BroadcastReceiver receives an Intent broadcast.
        Toast.makeText(context, "Action: " + intent.getAction() + " good", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent();
        intent2.setAction(MainActivity.ACTION1);
        context.sendBroadcast(intent2);

        // throw new UnsupportedOperationException("Not yet implemented");
    }

}
