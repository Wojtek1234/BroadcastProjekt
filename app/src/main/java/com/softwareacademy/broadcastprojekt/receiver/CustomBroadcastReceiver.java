package com.softwareacademy.broadcastprojekt.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 *
 */

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String text = intent.getStringExtra("KEY");
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
}
