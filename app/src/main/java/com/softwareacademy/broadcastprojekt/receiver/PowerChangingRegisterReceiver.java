package com.softwareacademy.broadcastprojekt.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 *
 */

public class PowerChangingRegisterReceiver  extends BroadcastReceiver {
    public static final String POWER_CHANGE_REJESTR = "PowerChangeRejestr";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(POWER_CHANGE_REJESTR,"I reveived message");
    }
}
