package com.softwareacademy.broadcastprojekt;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.softwareacademy.broadcastprojekt.receiver.PowerChangingRegisterReceiver;

public class MainActivity extends AppCompatActivity {

    private PowerChangingRegisterReceiver powerChangingRegisterReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver();

    }

    private void registerReceiver() {
        powerChangingRegisterReceiver = new PowerChangingRegisterReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);

        registerReceiver(powerChangingRegisterReceiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(powerChangingRegisterReceiver);
    }





}
